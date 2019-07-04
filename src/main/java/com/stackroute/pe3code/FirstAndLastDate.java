package com.stackroute.pe3code;
import java.util.Date;
import java.util.*;
import java.text.SimpleDateFormat;

public class FirstAndLastDate {
    public String dateCalculate() {
        Calendar c =GregorianCalendar.getInstance();
        SimpleDateFormat dateForm = new SimpleDateFormat("E/MM/dd/YY");
        String startDate = "", endDate = "";
        c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        startDate = dateForm.format(c.getTime());
        c.add(Calendar.DATE, 6);
        endDate = dateForm.format(c.getTime());
        String date = startDate + "," + endDate;
        return date;
    }
}