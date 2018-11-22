package com.laibao.functionintroduction.comparator;

import com.laibao.functionintroduction.model.Student;

/**
 * @author laibao wang
 */
public class StudentComparator {

    public int compareStudentByScore(Student concurrent, Student other) {
        return concurrent.getScore() - other.getScore();
    }

    public int compareStudentByAge(Student concurrent,Student other) {
        return concurrent.getAge() - other.getAge();
    }

    public int compareStudentByName(Student concurrent,Student other) {
        return concurrent.getName().compareTo(other.getName());
    }
}
