package com.laibao.masteringlambdas.chapter1.compositebehaviour;

import java.awt.*;
import java.util.Comparator;
import java.util.function.Function;

/**
 * @author laibao wang
 * @date 2018-08-17
 * @version 1.0
 */
public class CompositeCompare {

    // 我们知道 Comparator 【f(g(x))】函数实际上是两个函数的复合：1:【g(x)】 第一个函数用来从参数中抽取出排序键    2:【f(x)】 第二个函数用来比较这些排序键

    // 第一个函数
    Function<Point,Double> keyExtractor  = (Point point) -> point.getX();

    //第二个函数
    Comparator<Double> keyCompare = (Double d1,Double d2) -> Double.compare(d1,d2);

    //将上面的两个函数进行复合 得到我们所需要的复合函数

    Comparator<Point> comparatorByX = (Point p1,Point p2) -> keyCompare.compare(keyExtractor.apply(p1),keyExtractor.apply(p2));
}
