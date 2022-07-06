package ua.ithillel.lms;

public class GlobalRating {
    static Score[] data;

    static {
        // Score d1 = new Score();
        data = new Score[4];
        data[0] = new Score();
        data[0].category = "views";
        data[0].statistic = new double[]{1.01, 0.66, 1.15, 0.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55};
        data[1] = new Score();
        data[1].category = "actions";
        data[1].statistic = new double[]{2.01, 0.66, 5.15, 4.86, 2.01, 6.66, 10.01, 12.06, 1.01, 2.15};
        data[2] = new Score();
        data[2].category = "sharings";
        data[2].statistic = new double[]{1.01, 0.66, 1.15, 0.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55};
        data[3] = new Score();
        data[3].category = "buyings";
        data[3].statistic = new double[]{4.01, 1.61, 1.15, 4.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55};
        System.out.println();
    }
}
