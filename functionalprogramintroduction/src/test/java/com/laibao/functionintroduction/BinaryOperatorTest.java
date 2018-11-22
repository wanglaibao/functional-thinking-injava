package com.laibao.functionintroduction;

import com.alibaba.fastjson.JSON;
import com.laibao.functionintroduction.model.Student;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author laibao wang
 */
public class BinaryOperatorTest {

    private static final BinaryOperator<Integer> operator = (Integer a,Integer b) -> a + b;

    @Test
    public void compute() {
        // 加法
        System.out.println(getComputeResult(100,200,(a,b) -> a + b));
        //减法
        System.out.println(getComputeResult(1000,500,(a,b) -> a - b));
        //乘法
        System.out.println(getComputeResult(100,200,(a,b) -> a * b));
        //除法
        System.out.println(getComputeResult(2000,20,(a,b) -> a / b));
    }

    @Test
    public void testGetMaxResult() {
        Comparator<Student> comparator = (Student studentA,Student studentB) -> studentA.getAge() - studentB.getAge();
        BinaryOperator<Student> binaryOperator = BinaryOperator.maxBy(comparator);
        Student student = binaryOperator.apply(new Student("jinge",20000),new Student("jinddd",300000));
        System.out.println(JSON.toJSONString(student));
    }

    @Test
    public void testGetMinResult() {

    }
    private Integer getComputeResult(Integer numberA,Integer numberB,BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(numberA,numberB);
    }
}
