package com.codingblocks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Teacher teacher = new JavaTeacher();

        teacher.study();
        teacher.teach();
//        teacher.dance();

        Teacher t = new TeachingAssistant();
        Student s = new TeachingAssistant();
        TeachingAssistant ta = new TeachingAssistant();

    }
}
