package com.laibao.masteringlambdas.chapter1.compositebehaviour;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1.0
 */
public class PointComparatorTest {

    private static List<Point> pointList = Arrays.asList(new Point(1,2),new Point(2,2),new Point(3,4),new Point(5,6),new Point(7,8));

    private static Comparator<Point> comparatorByX = new Comparator<Point>() {
        @Override
        public int compare(Point point1, Point point2) {
            return Double.compare(point1.getX(),point2.getX());
        }
    };

    private static Comparator<Point> comparatorByY = (Point point1,Point point2) -> Double.compare(point1.getY(),point2.getY());

    public static void main(String[] args) {
        pointList.sort(comparatorByX);

        pointList.sort(comparatorByY);
    }
}
