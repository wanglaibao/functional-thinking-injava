package com.laibao.functionintroduction;

import com.alibaba.fastjson.JSON;
import com.laibao.functionintroduction.model.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author laibao wang
 */
public class PersonTest {

    private static final List<Person> originalPersonList = Arrays.asList(new Person("zhangasdfasfdsan",14),new Person("zhangsasdfan",12),new Person("zhangsan",20),new Person("wangwu",30),new Person("lisi",20),new Person("jialiu",20),new Person("zhangsan",27),new Person("zhangsasdfan",200));

    @Test
    public void testGetPersonByUserName() {
        String userName = "zhangsan";
        List<Person> list= originalPersonList.stream().filter(person -> userName.equalsIgnoreCase(person.getName())).collect(Collectors.toList());
        list.forEach(person -> System.out.println(JSON.toJSONString(person)));
    }

    @Test
    public void testGetPersonByAge() {
        int age = 20;
        //List<Person> list = personList.stream().filter(person -> person.getAge() == age).collect(Collectors.toList());
        BiFunction<Integer,List<Person>,List<Person>> persons = (Integer personAge,List<Person> personList) -> personList.stream().filter(person -> person.getAge() == personAge).collect(Collectors.toList());

        List<Person> list = persons.apply(age,originalPersonList);
        list.forEach(person -> System.out.println(JSON.toJSONString(person)));
    }


    @Test
    public void testGetPersonListByAge() {
        final int age = 20;
        final List<Person> list = getPersonListByUserAge(age,
                                                  originalPersonList,
                                                   (Integer personAge,List<Person> personsList) -> personsList.stream().filter(person -> person.getAge() == personAge).collect(Collectors.toList()));
        list.forEach(person -> System.out.println(JSON.toJSONString(person)));
        System.out.println();
        System.out.println();
        final List<Person> list1 = getPersonListByUserAge(age,
                originalPersonList,
                (Integer personAge,List<Person> personsList) -> personsList.stream().filter(person -> person.getAge() > personAge).collect(Collectors.toList()));
        list1.forEach(person -> System.out.println(JSON.toJSONString(person)));
        System.out.println();
        System.out.println();
        final List<Person> list2 = getPersonListByUserAge(age,
                originalPersonList,
                (Integer personAge,List<Person> personsList) -> personsList.stream().filter(person -> person.getAge() < personAge).collect(Collectors.toList()));
        list2.forEach(person -> System.out.println(JSON.toJSONString(person)));
    }

    private List<Person> getPersonListByUserAge(int age,List<Person> originalPersons,BiFunction<Integer,List<Person>,List<Person>> biFunction) {
        return biFunction.apply(age,originalPersons);
    }
}
