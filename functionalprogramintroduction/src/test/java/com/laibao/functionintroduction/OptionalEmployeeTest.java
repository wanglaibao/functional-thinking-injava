package com.laibao.functionintroduction;

import com.alibaba.fastjson.JSON;
import com.laibao.functionintroduction.model.Company;
import com.laibao.functionintroduction.model.Employee;
import org.apache.commons.collections.CollectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * @author laibao wang
 */
public class OptionalEmployeeTest {

    private Company company;

    @Before
    public void startUp() {
        company = new Company();
        List<Employee> employeeList = Arrays.asList(new Employee("jinge",12),new Employee("alading",23),new Employee("qiancheng",28),new Employee("panchang",67));
        company.setEmployeeList(employeeList);
        company.setName("alibaba");
    }

    @Test
    public void testGetEmployeeList() {
        List<Employee> list = company.getEmployeeList();
        if (CollectionUtils.isNotEmpty(list)) {
            list.forEach(employee -> System.out.println(JSON.toJSONString(employee)));
        }else {
            list = new ArrayList<>();
            System.out.println("列表是空的!!");
        }
    }

    @Test
    public void testByOptionalList() {
        Optional<Company> companyOptional = Optional.ofNullable(company);
        companyOptional.ifPresent(company1 -> System.out.println(JSON.toJSONString(company1)));
        companyOptional.orElse(new Company());
        //companyOptional.orElseGet(new Company());

        //Optional<List<Employee>> employeeList = companyOptional.map(company1 -> company1.getEmployeeList());
        List<Employee> employeeList = companyOptional.map(company1 -> company1.getEmployeeList()).orElse(Collections.EMPTY_LIST);
        employeeList.forEach(employee -> System.out.println(JSON.toJSONString(employee)));
    }
}


