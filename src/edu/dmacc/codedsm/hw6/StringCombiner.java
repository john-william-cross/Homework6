package edu.dmacc.codedsm.hw6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {

    public static void main(String[] args) {
        String stringOne = "Today";
        String stringTwo = "is";

        String twoStrings = twoStrings(stringOne, stringTwo);

        String result = combinedMethods(twoStrings, outputDate());

        System.out.println(result);
    }

    public static String twoStrings(String stringOne, String stringTwo) {
        return stringOne + " " + stringTwo;
    }

    public static String outputDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM, yyyy.");
        return format.format(Date.from(Instant.now()));
    }

    public static String combinedMethods(String twoStrings, String outputDate) {
        return twoStrings + " " + outputDate;
    }

}
