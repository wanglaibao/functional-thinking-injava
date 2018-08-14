package com.laibao.functionintroduction.function;

/**
 * @author laibao wang
 * @date 2018-08-14
 * @version 1.0.
 */
@FunctionalInterface
public interface FunctionVoid<T> {
    void apply(T t);
    //函数式接口是 SAM类接口的一种抽象【行为抽象】
}
