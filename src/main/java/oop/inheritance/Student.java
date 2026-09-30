package oop.inheritance;

public class Student extends Person{
    int score;
    public Student(String name,int age,int score){
        super(name,age);
        //用于调用父类构造器，java只能有一个父类
        this.score = score;
    }
}
