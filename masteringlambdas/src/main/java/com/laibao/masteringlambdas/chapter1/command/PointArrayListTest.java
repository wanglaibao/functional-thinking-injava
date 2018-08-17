package com.laibao.masteringlambdas.chapter1.command;

import java.awt.*;
import java.util.Arrays;

/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1.0
 */
public class PointArrayListTest {

    public static void main(String[] args) {
        PointArrayList pointArrayList = new PointArrayList(); //Arrays.asList(,,,,);
        pointArrayList.add(new Point(1,2));
        pointArrayList.add(new Point(2,2));
        pointArrayList.add(new Point(3,4));
        pointArrayList.add(new Point(5,6));
        pointArrayList.add(new Point(7,8));

        pointArrayList.forEach(new TranslateByOneAction());

    }
}
