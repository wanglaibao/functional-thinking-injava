package com.laibao.functionintroduction;

import com.laibao.functionintroduction.comparator.StudentComparator;
import com.laibao.functionintroduction.model.Company;
import com.laibao.functionintroduction.model.Employee;
import com.laibao.functionintroduction.model.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author laibao wang
 */
public class MethodReferenceTest {

     /*
            1: ClassName::StaticMethodName
     */



    private List<Student> studentList;

    @Before
    public void startUp() {
        studentList = Arrays.asList(new Student("jinge",12,120),new Student("alading",23,100),new Student("qiancheng",28,110),new Student("panchang",67,80));
    }

    @Test
    public void testSortByScoreThroughLambda() {
        studentList.sort((Student concurrent,Student other) -> Student.compareStudentByScore(concurrent,other));
        studentList.forEach(student -> System.out.println(student.getScore()));
    }

    @Test
    public void testSortByScoreThroughStaticMethodReference() {
        studentList.sort(Student::compareStudentByScore);
        studentList.forEach(student -> System.out.println(student.getScore()));
    }

    @Test
    public void testSortByAgeThroughLambda() {
        studentList.sort((Student concurrent,Student other) -> Student.compareStudentByAge(concurrent,other));
        studentList.forEach(student -> System.out.println(student.getScore()));
    }

    @Test
    public void testSortByAgeThroughClassNameStaticMethodReference() {
        studentList.sort(Student::compareStudentByAge);
        studentList.forEach(student -> System.out.println(student.getScore()));
    }


    @Test
    public void testSortByNameThroughReferenceObjectNameLambda() {
        StudentComparator studentComparator = new StudentComparator();
        studentList.sort((Student concurrent,Student other) -> studentComparator.compareStudentByName(concurrent,other));
        studentList.forEach(student -> System.out.println(student.getName()));
    }

    @Test
    public void testSortByNameThroughReferenceObjectNameAndInstanceMethodReference() {
        StudentComparator studentComparator = new StudentComparator();
        studentList.sort(studentComparator::compareStudentByName);
        studentList.forEach(student -> System.out.println(student.getName()));
    }

    @Test
    public void testSortByNameThroughClassNameAndInstanceMethodReference() {
        studentList.sort(Student::compareStudentByName1);
        studentList.forEach(student -> System.out.println(student.getName()));
    }
}
