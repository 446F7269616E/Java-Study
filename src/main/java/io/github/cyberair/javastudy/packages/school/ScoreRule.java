package io.github.cyberair.javastudy.packages.school;

// 注意：故意没有 public
class ScoreRule {
    public static boolean isPass(int score){
        if(score >= 60){
            return  true;
        }
        return false;
    }
    // 你完成：
    // public static boolean isPass(int score)
    // >= 60 返回 true，否则 false
}
