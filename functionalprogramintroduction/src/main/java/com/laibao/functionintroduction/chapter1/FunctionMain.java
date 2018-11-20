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
        System.out.println(computeOne(100,number -> number + 1000));
        System.out.println(computeTwo(1000,200,(Integer a,Integer b) -> a + b));
        System.out.println(convertToString(123123,number -> String.valueOf(number)));

        System.out.println(function.apply("jinge"));
        System.out.println(function1.compose(function).apply("jinge"));
        System.out.println(function.andThen(function1).apply("aaaaa"));

        Comparator<String> comparator = (String one, String two) -> one.compareTo(two);
        Comparator<String> reversed = comparator.reversed();

        System.out.println(compute(2000, (Integer number) -> number + 2000));
        System.out.println(compute(2000, (Integer number) -> String.valueOf(number))+"sadfasfd".toUpperCase());
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


    /**
     * 这个是一个通用的抽象 体现了很高的抽象能力
     * @param t
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    private static <T,R> R compute(T t, Function<T,R> function) {
        return function.apply(t);
    }
}
