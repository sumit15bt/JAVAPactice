/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Date;

/**
 *
 * @author sumit
 */
public class DateTest {
    
    public String printDateDifference(Date d1, Date d2) {
        long diff;
        if (d1.after(d2)) {
            diff = d1.getTime() - d2.getTime();
        } else {
            diff = d2.getTime() - d1.getTime();
        }

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        System.out.print(diffDays + " days, ");
        System.out.print(diffHours + " hours, ");
        System.out.print(diffMinutes + " minutes, ");
        System.out.print(diffSeconds + " seconds.");
        return "DateTest done.";
    }
    
}
