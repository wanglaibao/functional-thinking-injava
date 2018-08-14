package com.laibao.functionintroduction.function;

/**
 * @author laibao wang
 * @date 2018-08-14
 * @version 1.0
 */
@FunctionalInterface
public interface BiFunction<T,W,R> {
  R apply(T t,W w);
}
