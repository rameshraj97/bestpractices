package com.chainsys.bestPractices.clone;

public class TestCloning {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.name="ramesh";
        firstStudent.age=25;
        System.out.println(firstStudent.hashCode());
        try {
        Student secondStudent = (Student) firstStudent.clone();
        System.out.println(secondStudent.name);
        System.out.println(secondStudent.age);
        System.out.println(secondStudent.hashCode());
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
    }

}