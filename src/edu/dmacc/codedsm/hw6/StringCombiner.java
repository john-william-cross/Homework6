package edu.dmacc.codedsm.hw6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {

    public static void main(String[] args) {

        System.out.println(allStrings(allStrings("Today", "is"), outputDate()));
    }

    public static String allStrings(String allStrings, String outputDate) {
        return allStrings + " " + outputDate;
    }

    public static String outputDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM, yyyy.");
        return format.format(Date.from(Instant.now()));
    }
}
