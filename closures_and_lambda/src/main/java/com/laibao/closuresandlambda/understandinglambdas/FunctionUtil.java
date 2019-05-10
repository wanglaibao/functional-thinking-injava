package com.laibao.closuresandlambda.understandinglambdas;

import org.apache.commons.lang3.StringUtils;

import java.beans.ExceptionListener;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.function.*;

/**
 * @author laibao wang
 */
public class FunctionUtil {

    private UnaryOperator<String> upperCase = str -> str.toUpperCase();

    private BinaryOperator<String> concat = (left, right) -> left + right;

    private Predicate<String> notNullOrEmpty = s -> StringUtils.isNotEmpty(s) && s.length() > 0;

    private IntFunction<String> intToString = Integer::toString;

    private ToIntFunction<String> parseInt = Integer::valueOf;

    private Function<String, BigInteger> newBigInt = BigInteger::new;

    private Consumer<String> print = System.out::println;

    private UnaryOperator<String> makeGreeting = "Hello, "::concat;

    private IntFunction<String> lookup = Arrays.asList("a", "b", "c")::get;

    // Create concurrency interfaces from lambdas
    private Runnable runMe = () -> System.out.println("Ran!");

    private Callable<Long> callMe = System::currentTimeMillis;

    private static ThreadFactory threadFactory = Thread::new;

    // Implement listener interfaces
    private ExceptionListener listener = Exception::printStackTrace;

    //Identity Function Assigned to an Object Variable
    // This code does not compile
    //private Object funObject = it -> it;


    // Identity Function Assigned to a Generic Function Variable
    private Function<?, ?> function = it -> it;

    // Identity Function for Number Instances Assigned to a Function Variable
    private Function<Number, Number> numberFunction = it -> it;

    // Identity Function Implemented Using an Anonymous Inner Class
    public static <T> Function<T, T> identityFunctionAIC() {
        return new Function<T, T>() {
            @Override
            public T apply(T t) {
                return t;
            }
        };
    }

    // Identity Function Implemented Using a Lambda
    public static <T> Function<T, T> identityFunction() {
        return (T t) -> t;
    }

    public static String transform(String str, Function<String, String> transformer) {
        return transformer.apply(str);
    }

    public static CharSequence transform(CharSequence str, Function<CharSequence, CharSequence> transformer) {
        return transformer.apply(str);
    }

    public static IntUnaryOperator compareAgainst(Integer compareLeft) {
        return compareLeft::compareTo;
    }

    private static UnaryOperator<String> stringOp = ""::concat;

    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = compareAgainst(100);
        int value = intUnaryOperator.applyAsInt(200);
        System.out.println(value);

        stringOp.apply("afasfd");

        threadFactory.newThread(() -> System.out.println()).start();
    }

}

