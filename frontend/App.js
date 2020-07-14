import React from 'react'
import EmployeeList from './employee/employeeList'

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            employees: props.employees
        };
    }

    componentDidMount() {
        this.popstateListener = window.addEventListener('popstate', ev => {
            const { pathname, search } = event.target.location;
            this.setState({ employees: [] })
            fetch(`${pathname}${search}`)
                .then(r => r.json())
                .then(employees => this.setState({ employees }))
        })
    }

    render() {
        const { employees } = this.state;
        return (
            <div>
                <h1>Join the darkside</h1>
                <EmployeeList employees={employees} />
            </div>
        )
    }
}


export default App;