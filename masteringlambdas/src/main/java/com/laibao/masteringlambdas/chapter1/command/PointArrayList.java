package com.laibao.masteringlambdas.chapter1.command;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1.0
 */
public class PointArrayList extends ArrayList<Point> {

    public void forEach(PointAction pointAction) {
        for (Point point:this) {
            pointAction.doForPoint(point);
        }
    }
}
