package io.github.cyberair.javastudy.packages.school;

public class StudentManager {

    //这个failed为什么不能在printReport内部定义？
    public void printReport(Student[] students) {
         int failed = 0;
        for(Student student : students){
            String rank;
            boolean ispass = ScoreRule.isPass(student.getScore()) ;
            if(student.getScore()>=90){
                rank = "优秀";
                
            }
            else if(student.getScore() >= 60){
                // 为什么我这里输60<=student.getScore < 90就报错了？
                rank ="及格";
            }
            else{
                rank = "不及格";
                if (ispass == false){
                    failed += 1;
                }
                }
            System.out.printf("%s:%d - %s%n",student.getName(),student.getScore(),rank);
        }
        System.out.printf("不及格人数：%d",failed);
        // 你完成：
        //
        // 遍历所有学生
        //
        // 输出：
        // Alice: 92 - 优秀
        // Bob: 73 - 及格
        // Jack: 48 - 不及格
        //
        // 判定规则：
        // >= 90       优秀
        // >= 60       及格
        // < 60        不及格
        //
        // 同时统计不及格人数
        //
        // 最后输出：
        // 不及格人数: 1
    }
}
