package ithillel.ua;

public class Score {
    public String category;
    public double[] statistic;

    {
        statistic = new double[10];
        for (int i = 0; i < statistic.length; i++) {
            statistic[i] = Double.parseDouble(String.format("%.3s", Math.random() * 10));
        }
    }
}
