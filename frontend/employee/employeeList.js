import React from 'react';

const EmployeeList = ({
    employees = []
}) => (
        <div>
            <ul>
                {employees.map(({ firstName, lastName, employeeId }, i) => (
                    <li key={i}>
                        {firstName}{lastName}{employeeId}
                    </li>
                ))}
            </ul>
        </div>
    )

export default EmployeeList;