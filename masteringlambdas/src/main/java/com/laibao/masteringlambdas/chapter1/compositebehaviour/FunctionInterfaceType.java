package com.laibao.masteringlambdas.chapter1.compositebehaviour;

/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1,0
 */
@FunctionalInterface
public interface FunctionInterfaceType {

    String iAmFunctionalInterface();

    /**
     *  函数式接口的抽象方法不可以是
     *  下述三个方法中的任何一个，他们是Object的
     *  默认所有的接口都继承的，函数式接口可以定义
     *  三个方法的一个或者几个以便实现类进行重写
     */
    boolean equals(Object obj);
    String toString();
    int hashCode();
}
