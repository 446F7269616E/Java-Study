package io.github.cyberair.javastudy.packages.school;

public class Student {
    private String name;
    private int score;
 //构造器也可以设置权限
    public Student(String name,int score){
        this.name = name;
        this.score = score;

    }
    public String getName() {
        return name;
    }
    public int getScore(){
        return score;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

}
