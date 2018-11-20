package com.laibao.functionintroduction.chapter1;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author laibao wang
 */
public class FunctionMain {


    private static Function<String,String> function = (String str) -> "<asfdasf>"+str+"</sfasfdasf>";

    private static Function<String,String> function1 = String::toUpperCase;

    public static void main(String[] args) {
        computeOne(100,number -> number + 1000);
        computeTwo(1000,200,(Integer a,Integer b) -> a + b);
        convertToString(123123,number -> String.valueOf(number));

        System.out.println(function.apply("jinge"));
        System.out.println(function1.compose(function).apply("jinge"));
        System.out.println(function.andThen(function1).apply("aaaaa"));

        Comparator<String> comparator = (String one, String two) -> one.compareTo(two);
        Comparator<String> reversed = comparator.reversed();
    }

    private static Integer computeOne(int number, Function<Integer,Integer> function) {
        return function.apply(number);
    }

    private static Integer computeTwo(int numberA, int numberB, BiFunction<Integer, Integer,Integer> function) {
        return function.apply(numberA,numberB);
    }

    private static String convertToString(int number,Function<Integer, String> function) {
        return function.apply(number);
    }
}
