package com.laibao.masteringlambdas.chapter7.defaultmethodandinherite;

/**
 * @author laibao wang
 * @date 2018-09-13
 * @version 1.0
 */
public interface Foo {
    default String hello() {
        return "FOO";
    }
}
