import React from 'react'
import { render } from 'react-dom'
import { renderToString } from 'react-dom/server'
import App from './App'


if (typeof window !== 'undefined' && typeof document !== 'undefined' && typeof document.createElement === 'function') {
    window.renderClient = (employees) => {
        render (
            <App products={employees}/>,
            document.getElementById ('root')
        );
    }
}
else {
    global.renderServer = (employees) => {
        // const jsEmployees = Java.from(employees);
        return renderToString (
            <App employees={employees}/>
        )
    };
}