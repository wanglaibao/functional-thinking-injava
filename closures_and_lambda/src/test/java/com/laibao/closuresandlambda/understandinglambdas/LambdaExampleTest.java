package com.laibao.closuresandlambda.understandinglambdas;

import org.junit.Test;

import java.util.function.Function;

/**
 * @author laibao wang
 */
public class LambdaExampleTest {

    @Test
    public void testIdentify() {
        Function<String,String> function = Function.identity();
        String name = function.apply("金戈");
        System.out.println("the name is "+name);
    }
}
