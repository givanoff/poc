package com.demo.poc.react;

import com.demo.poc.domain.Employee;
import jdk.nashorn.api.scripting.NashornScriptEngine;
import org.springframework.stereotype.Component;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.List;

@Component
public class React {
    public String renderEmployees(List<Employee> employees) throws Exception{
        NashornScriptEngine nse = getEngine();

        Object html = nse.invokeFunction("renderServer", employees);
        return String.valueOf(html);
    }

    private NashornScriptEngine getEngine() throws ScriptException{
        NashornScriptEngine nse = (NashornScriptEngine) new ScriptEngineManager().getEngineByName("nashorn");
        nse.eval("load ('src/main/resources/static/nashorn-polyfill.js')");
        nse.eval ("load ('src/main/resources/static/app.bundle.js')");

        return nse;
    }
}
