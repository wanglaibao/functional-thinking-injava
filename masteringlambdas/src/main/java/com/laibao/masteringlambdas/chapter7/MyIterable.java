package com.laibao.masteringlambdas.chapter7;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 测试接口 定义了一个默认方法
 * @author laibao wang
 * @date 2018-09-13
 * @version 1.0
 */
public interface MyIterable<T> extends Iterable<T>{

    default void forEachTest(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }
}
