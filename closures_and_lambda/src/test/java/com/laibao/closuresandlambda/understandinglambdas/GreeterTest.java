package com.laibao.closuresandlambda.understandinglambdas;

import org.junit.Test;

import java.util.function.Function;

/**
 * @author laibao wang
 */
public class GreeterTest {

    @Test
    public void testAnonymousInnerClassesAsAClosure() {
        // Create variable in this scope
        String greeting = "Hello, ";
        Greeter greeter = new Greeter(){
            @Override
            public String createGreeting(String whom) {
                // Close (ie: capture) the variable here
                return greeting + whom + "!";
            }
        };
        greetWorld(greeter);
    }


    @Test
    public void testLambdaAsAClosure() {
        String greeting = "Hello, ";
        Function<String, String> stringFunction = whom -> greeting + whom + "!";
        greetWorld(stringFunction);
    }

    private  void greetWorld(Greeter greeter) {
        // Have the greeter use the closed variable here
        // Note that the "greeting" variable is out of scope
        System.out.println(greeter.createGreeting("World"));
    }

    private void greetWorld(Function<String, String> greeter) {
        System.out.println(greeter.apply("World"));
    }
}
