package com.laibao.masteringlambdas.chapter7.defaultmethodandinherite;

/**
 * @author laibao wang
 * @date 2018-09-13
 * @version 1.0
 */
public class Foo1Bar1MainTest {
    public static void main(String[] args) {
        Foo1Bar1 foo1Bar1 = new Foo1Bar1();
        System.out.println("hello from : " + foo1Bar1.hello());
        System.out.println("welcome from : " + foo1Bar1.welcome());
    }
}
