package com.laibao.functionintroduction;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author laibao wang
 */
public class PredicateTest {

    private static final List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

    private List<Integer> getFilterProperNumberList(List<Integer> list,Predicate<Integer> predicate) {
       // return list.stream().filter(number -> predicate.test(number)).collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();
        for (Integer number:list) {
            if (predicate.test(number)) {
                newList.add(number);
            }
        }
        return newList;
    }


    private List<Integer> getFilterProperNumberList(List<Integer> list,Predicate<Integer> predicateOne,Predicate<Integer> predicateTwo) {
        // return list.stream().filter(number -> predicate.test(number)).collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();
        for (Integer number:list) {
            if (predicateOne.and(predicateTwo).test(number)) {
                newList.add(number);
            }
        }
        return newList;
    }

    private List<Integer> getFilterProperNumberListTwo(List<Integer> list,Predicate<Integer> predicate) {
        return list.stream().filter(number -> predicate.test(number)).collect(Collectors.toList());
    }

    private List<Integer> getFilterProperNumberListTwo(List<Integer> list,Predicate<Integer> predicateOne,Predicate<Integer> predicateTwo) {
        return list.stream().filter(number -> predicateOne.and(predicateTwo).test(number)).collect(Collectors.toList());
    }

    @Test
    public void testGetOdds() {
        List<Integer> oddsList = getFilterProperNumberList(intList,number -> number % 2 != 0);
        oddsList.forEach(System.out::println);
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        List<Integer> oddsList1 = getFilterProperNumberListTwo(intList,number -> number % 2 != 0);
        oddsList1.forEach(System.out::println);
    }


    @Test
    public void testGetEvens() {
        List<Integer> evensList = getFilterProperNumberList(intList,number -> number % 2 == 0);
        evensList.forEach(System.out::println);
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");


        List<Integer> evensList1 = getFilterProperNumberListTwo(intList,number -> number % 2 == 0);
        evensList1.forEach(System.out::println);
    }

    @Test
    public void testPredicateOne() {
        Predicate<String> predicate = (String value) -> value.length() > 10;
        System.out.println(predicate.test("fasfdasfasfasfasfasfasfasfd"));
        System.out.println();
        System.out.println(predicate.test("fasf"));
    }
}
