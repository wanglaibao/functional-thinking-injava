package com.laibao.masteringlambdas.chapter1.command;

import java.awt.*;

/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1.0
 */
public class TranslateByOneAction implements PointAction{

    @Override
    public void doForPoint(Point point) {
        point.translate(1,1);
        System.out.println(" point.translate(1,1)");
    }
}
