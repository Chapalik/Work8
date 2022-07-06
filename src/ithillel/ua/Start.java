package ithillel.ua;

import java.util.Arrays;

public class Start {


    public static void main(String[] args) {


        for (int i = 0; i < GlobalRating.data.length; i++) {
            System.out.println(GlobalRating.data[i].category + Arrays.toString(GlobalRating.data[i].statistic));
        }
    }
}
