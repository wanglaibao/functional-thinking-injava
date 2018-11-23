package com.laibao.functionintroduction.model;

/**
 * @author laibao wang
 */
public class Student {
    private String name;

    private int age;

    private int score;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareStudentByScore(Student concurrent,Student other) {
        return concurrent.getScore() - other.getScore();
    }

    public static int compareStudentByAge(Student concurrent,Student other) {
        return concurrent.getAge() - other.getAge();
    }

    public int compareStudentByName1(Student other) {
        return this.getName().compareTo(other.getName());
    }

    public int compareStudentByScore1(Student other) {
        return this.getScore() - other.getScore();
    }

    public int compareStudentByAge1(Student other) {
        return this.getAge() - other.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
