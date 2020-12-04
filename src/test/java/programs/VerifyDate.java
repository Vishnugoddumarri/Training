package programs;
import org.testng.annotations.Test;

import java.util.*;
import java.util.regex.*;

public class VerifyDate {
    public static void date_validation(String date){

        Calendar cal = Calendar.getInstance();
        int today = cal.get(Calendar.DAY_OF_MONTH);
        int verification_date = Integer.parseInt(String.valueOf(date.charAt(0) + String.valueOf(date.charAt(1))));
        if(verification_date - today >= 10 && verification_date < 31)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");

    }
    @Test
    public static void date() {

        String date ="26/7/2020";
        String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        String regex2 = "^(1[0-2]|0[1-9]).(3[01]|[12][0-9]|0[1-9]).[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(date);

        if(matcher.matches() || matcher2.matches())
            date_validation(date);
        else
            System.out.println("Date is not valid");
    }
}
