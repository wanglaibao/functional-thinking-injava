package com.laibao.masteringlambdas.chapter1;

import java.awt.*;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;


/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1.0
 */
public class PointDemo {

    public static void main(String[] args) {
        List<Point> pointList = Arrays.asList(new Point(1,2),new Point(2,2),new Point(3,4),new Point(5,6),new Point(7,8));
        // in java 5
        for (Point point: pointList) {
            point.translate(1,1);
        }

        // before java 5
        for (Iterator iterator = pointList.iterator();iterator.hasNext();) {
            Point point = (Point) iterator.next();
            point.translate(1,1);
        }

        // before java 5
        Iterator iterator = pointList.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            point.translate(1,1);
        }

        // in java 8
        pointList.forEach(point -> point.translate(1,1));

        iteratorJava8Way(pointList);
    }

    private static void iteratorJava8Way(List<Point> list) {
        Objects.requireNonNull(list);
        list.forEach(point -> point.translate(10,10));
    }
}
