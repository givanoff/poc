package com.demo.poc.web;

import com.demo.poc.domain.Employee;
import com.demo.poc.react.React;
import com.demo.poc.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
    private final Logger log = LoggerFactory.getLogger(EmployeeResource.class);

    private final EmployeeService employeeService;
    private final React react;

    public EmployeeResource(EmployeeService employeeService, React react) {
        this.employeeService = employeeService;
        this.react = react;
    }

    @ResponseBody
    @RequestMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> employees(Model model) {
        return this.employeeService.findAll();
    }

    @RequestMapping(value = "/test", produces = MediaType.TEXT_HTML_VALUE)
    public String getAllEmployees(Model model) throws Exception {
        log.info("REST request to fetch all users!");

        final List<Employee> empls = employeeService.findAll();
        String renderedHtml = react.renderEmployees(empls);
        model.addAttribute("content", renderedHtml);
        model.addAttribute("employees", empls);

        return "index";
    }
}
