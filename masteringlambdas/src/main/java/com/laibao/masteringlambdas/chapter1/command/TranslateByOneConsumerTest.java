package com.laibao.masteringlambdas.chapter1.command;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1.0
 */
public class TranslateByOneConsumerTest {

    public static void main(String[] args) {
        List<Point> pointList = Arrays.asList(new Point(1,2),new Point(2,2),new Point(3,4),new Point(5,6),new Point(7,8));
        pointList.forEach(new TranslateByOneConsumer());


        pointList.forEach(new Consumer<Point>() {
            @Override
            public void accept(Point point) {
                point.translate(10,10);
            }
        });
    }
}
