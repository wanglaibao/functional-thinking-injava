package com.laibao.functionintroduction.model;

import java.util.List;

/**
 * @author laibao wang
 */
public class Company {
    private String name;
    private List<Employee> employeeList;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
