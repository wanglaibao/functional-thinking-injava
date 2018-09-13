package com.laibao.masteringlambdas.chapter7.defaultmethodandinherite;

/**
 * @author laibao wang
 * @date 2018-09-13
 * @version 1.0
 */
public class FooBarMainTest {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar();
        String helloMsg = fooBar.hello();
        System.out.println("hello from : " + helloMsg);
    }
}
