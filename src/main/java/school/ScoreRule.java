package school;

final class ScoreRule {
    private ScoreRule() {
    }

    static boolean isPass(int score) {
        return score >= 60;
    }
}
