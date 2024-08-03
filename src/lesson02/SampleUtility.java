package lesson02;

import java.util.Calendar;

public class SampleUtility {
    public static void main(String args[]){
        Calendar calendar = Calendar.getInstance();
        System.out.println("Date and Time");
        System.out.println("YEAR : "+calendar.get(Calendar.YEAR));
        System.out.println("MONTH : "+calendar.get(Calendar.MONTH));
        System.out.println("DATE : "+calendar.get(Calendar.DATE));
    }
}
