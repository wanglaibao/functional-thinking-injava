package com.laibao.masteringlambdas.chapter7.defaultmethodandinherite;

/**
 * @author laibao wang
 * @date 2018-09-13
 * @version 1.0
 */
public class Foo2Bar2 extends Bar2 implements Foo2{
    @Override
    public String hello() {
        return "Foo2Bar2";
    }
}
