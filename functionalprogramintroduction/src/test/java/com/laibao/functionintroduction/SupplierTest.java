package com.laibao.functionintroduction;

import com.alibaba.fastjson.JSON;
import com.laibao.functionintroduction.model.Student;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * @author laibao wang
 */
public class SupplierTest {

    // Constant Supplier of Number Instances
    private Supplier<Number> function = () -> 1;

    // String Concatenation Bifunction
    BiFunction<String, String, String> concat = (a, b) -> a + b;

    @Test
    public void testGetSimpleString() {
        Supplier<String> supplier = () -> "this is the hello world string";
        String value = supplier.get();
        System.out.println("value : "+value);
    }

    @Test
    public void testGetStudent() {
        Supplier<Student> supplier = () -> new Student("jinge",123);
        Student student = supplier.get();
        System.out.println(JSON.toJSONString(student));
    }

    @Test
    public void testGetStudentTwo() {
        Supplier<Student> supplier = Student::new; //只能是无惨构造函数，而不能说有参构造函数
        Student student = supplier.get();
        student.setName("金戈");
        student.setAge(100000);
        System.out.println(JSON.toJSONString(student));
    }
}
