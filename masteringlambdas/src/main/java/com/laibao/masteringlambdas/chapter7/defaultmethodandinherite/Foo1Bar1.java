package com.laibao.masteringlambdas.chapter7.defaultmethodandinherite;

/**
 * @author laibao wang
 * @date 2018-09-13
 * @version 1.0
 */
public class Foo1Bar1 extends Bar1 implements Foo1{

    @Override
    public String welcome() {
        return "welcome from foo1bar1";
    }
}
