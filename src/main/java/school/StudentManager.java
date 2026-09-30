package school;

public class StudentManager {
    public void printReport(Student[] students) {
        int failed = 0;

        for (Student student : students) {
            String rank;

            if (student.getScore() >= 90) {
                rank = "优秀";
            } else if (ScoreRule.isPass(student.getScore())) {
                rank = "及格";
            } else {
                rank = "不及格";
                failed++;
            }

            System.out.printf(
                    "%s: %d - %s%n",
                    student.getName(),
                    student.getScore(),
                    rank);
        }

        System.out.printf("不及格人数：%d%n", failed);
    }
}
