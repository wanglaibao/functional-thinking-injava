package com.laibao.masteringlambdas.chapter1.command;

import java.awt.*;
import java.util.function.Consumer;

/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1.0
 */
public class TranslateByOneConsumer implements Consumer<Point>{

    @Override
    public void accept(Point point) {
        point.translate(10,10);
        System.out.println("point.translate(10,10)");
    }
}
