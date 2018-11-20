package com.laibao.functionintroduction.chapter1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.function.Function.*;

/**
 * @author laibao wang
 * @date 2018-08-14
 * @version 1.0
 */
public class Java8FunctionalHelloButtonApp {
    private final Button button = new Button();

    public Java8FunctionalHelloButtonApp() {
        button.addActionListener(( ActionEvent event) -> System.out.println("Hello There: event received: "+event));
    }

    private static Function<String,String> function = (String str) -> "<asfdasf>"+str+"</sfasfdasf>";

    private static Function<String,String> function1 = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(function.apply("jinge"));
        System.out.println(function1.compose(function).apply("jinge"));
        System.out.println(function.andThen(function1).apply("aaaaa"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        Comparator<String> comparator = (String one,String two) -> one.compareTo(two);

        Comparator<String> reversed = comparator.reversed();
    }
}
