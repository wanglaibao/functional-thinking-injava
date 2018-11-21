package com.laibao.closuresandlambda.understandinglambdas;

import java.util.function.Function;

/**
 * @author laibao wang
 */
public class LambdaExpressionExample {


    //Identity Function Implemented Using a Lambda
    public static <T> Function<T,T> identityFunction() {
        return t -> t;
    }
}
