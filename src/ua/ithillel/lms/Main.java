package ua.ithillel.lms;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println(GlobalRating.data[i]);
        }
        Score score1 = new Score();
        for (int i = 0; i < 10; i++) {
            score1.statistic[i] = Math.random();
            System.out.println(score1.statistic[i]);
        }
    }
}