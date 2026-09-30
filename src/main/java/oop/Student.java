package oop;

public class Student {
    String name;
    int age;
    double score;

    Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // 构造器没有返回类型，类似于 C++ 构造函数。
    void show() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
    }
}

// 编译时，每个类通常会生成对应的 .class 文件。
