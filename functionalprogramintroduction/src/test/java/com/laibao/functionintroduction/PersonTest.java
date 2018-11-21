package com.laibao.functionintroduction;

import com.alibaba.fastjson.JSON;
import com.laibao.functionintroduction.model.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author laibao wang
 */
public class PersonTest {

    private static final List<Person> personList = Arrays.asList(new Person("zhangsan",20),new Person("wangwu",30),new Person("lisi",25),new Person("jialiu",40));

    @Test
    public void testGetPersonByUserName() {
        String userName = "zhangsan";
        List<Person> list= personList.stream().filter(person -> userName.equalsIgnoreCase(person.getName())).collect(Collectors.toList());
        list.forEach(person -> System.out.println(JSON.toJSONString(person)));
    }
}
