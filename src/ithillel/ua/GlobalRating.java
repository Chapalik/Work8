package ithillel.ua;

public class GlobalRating {
    public static Score[] data;

    static {
        Score score1 = new Score();
        score1.category = "views :";
        Score score2 = new Score();
        score2.category = "actions :";
        Score score3 = new Score();
        score3.category = "sharings :";
        Score score4 = new Score();
        score4.category = "buyings :";
        data = new Score[4];
        data[0] = score1;
        data[1] = score2;
        data[2] = score3;
        data[3] = score4;
    }

}


