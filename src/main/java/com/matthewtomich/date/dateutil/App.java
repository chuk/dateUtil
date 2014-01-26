package com.matthewtomich.date.dateutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Date date = new Date();

        //  current date and time
	System.out.println("Todays date: "+date.toString());
        
        // date formatting
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("Todays date: " + simpleDateFormat.format(date));
        
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
	System.out.println("Todays date: " + simpleDateFormat2.format(date));
        
        
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        // convert string
	String strdate = "26-Jan-2014 09:00:40";
	try {
            Date newdate = simpleDateFormat2.parse(strdate);
            System.out.println(newdate);
	} catch (ParseException e) {
            e.printStackTrace();
	}
		
    }
}
