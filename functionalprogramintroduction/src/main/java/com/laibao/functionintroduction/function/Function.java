package com.laibao.functionintroduction.function;

/**
 * @author laibao wang
 * @date 2018-08-14
 * @version
 */
@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}
