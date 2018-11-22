package com.laibao.closuresandlambda.understandinglambdas;

import org.apache.commons.lang3.StringUtils;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @author laibao wang
 */
public class FunctionUtil {

    private UnaryOperator<String> upperCase = str -> str.toUpperCase();

    private BinaryOperator<String> concat = (left, right) -> left + right;

    private Predicate<String> notNullOrEmpty = s -> StringUtils.isNotEmpty(s) && s.length() > 0;

    //Identity Function Assigned to an Object Variable
    // This code does not compile
    //private Object funObject = it -> it;


    // Identity Function Assigned to a Generic Function Variable
    private Function<?,?> function = it -> it;

    // Identity Function for Number Instances Assigned to a Function Variable
    private Function<Number,Number> numberFunction = it -> it;

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
    public static  <T> Function<T,T> identityFunction() {
        return (T t) -> t;
    }

    public static String transform(String str, Function<String, String> transformer) {
        return transformer.apply(str);
    }

    public static CharSequence transform(CharSequence str, Function<CharSequence, CharSequence> transformer) {
        return transformer.apply(str);
    }
}
