package com.laibao.closuresandlambda.understandinglambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author laibao wang
 */
public class ConsumerTest {

    @Test
    public void testGreetFolks() {
        Consumer<String> consumer = name -> System.out.println("Hello, " + name);
        List<String> nameList = Arrays.asList("Alice", "Bob", "Cathy");
        System.out.println();
        for (String name:nameList) {
            consumer.accept(name);
        }
        System.out.println();
        nameList.forEach(name -> consumer.accept(name));
    }

    @Test
    public void testConcat() {
        BiConsumer<String,String> biConsumer = (left, right) -> System.out.println(left + right);
        List<String> nameList = Arrays.asList("Alice", "Bob", "Cathy");
        for (String name : nameList) {
            biConsumer.accept("Goodbye, ", name);
        }
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        nameList.forEach(name -> biConsumer.accept("Goodbye, ", name));
    }
}
