package Practice;
import java.text.SimpleDateFormat;

import java.util.Calendar;

//import java.util.Date;

import java.util.Scanner;

public class Print_Date {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);


            int date = sc.nextInt();

            int Month = sc.nextInt();

            int Year = sc.nextInt();


            Calendar c = Calendar.getInstance();


            c.set(Year, Month, date);


            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

            System.out.println("Today's date: " + sdf.format(c.getTime()));


// System.out.println(c.getCalendarType());

// System.out.println(c.isWeekDateSupported());


        }
    }

