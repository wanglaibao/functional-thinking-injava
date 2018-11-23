package com.laibao.functionintroduction;

import com.laibao.functionintroduction.model.Employee;
import com.laibao.functionintroduction.model.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author laibao wang
 */
public class StreamTest {

    private List<Student> studentList;

    private List<Employee> employeeList;

    @Before
    public void startUp() {
        studentList = Arrays.asList(new Student("jinge",12,120),new Student("alading",23,100),new Student("qiancheng",28,110),new Student("panchang",67,80),
                new Student("jinge",12,1230),new Student("alading",23,1030),new Student("qiancheng",28,1130),new Student("panchang",67,830));

        employeeList = Arrays.asList(new Employee("jinge",12),new Employee("alading",23),new Employee("qiancheng",28),new Employee("panchang",67),
                new Employee("jinge",102),new Employee("alading",203),new Employee("qiancheng",208),new Employee("panchang",607));
    }

    @Test
    public void testGroupEmployeeByName() {

    }
}
