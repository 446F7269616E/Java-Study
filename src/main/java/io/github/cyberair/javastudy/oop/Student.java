package io.github.cyberair.javastudy.oop;

public class Student {
    String name;
    int age;
    double score;

    Student(String name,int age,double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
// 这是构造器，没有返回类型，类似于C++构造函数。
    void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
    }
}
// 编译时，可能会按类编译成多个.class文件
