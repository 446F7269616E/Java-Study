package io.github.cyberair.javastudy.oop;

public class Main {
    public static void main(String args[]){
       // Student s = new Student();
        Student s = new Student("Tom",20,85.5);
        s.name = "Tom";
        s.age = 20;
        s.score = 85.5;
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.score);
        
        s.show();
}
}
