package com.roslin.mwicks.testutility;

//import java.text.SimpleDateFormat;

import java.util.Date;

import com.roslin.mwicks.utility.CalendarUtil;
import com.roslin.mwicks.utility.DateUtil;
import com.roslin.mwicks.utility.Wrapper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDateUtil {

	public static void main(String args[]){  

    	try {
    		long startTime = Wrapper.printPrologue("*", Wrapper.getExecutingClass());

            System.out.println("");
            System.out.println("Set Up Date Strings - ALL 29th Feb 2012 !!!");
            System.out.println("-------------------");
            
            String dateString1 = "20120229";
            String dateString2 = "29/02/2012";
            String dateString3 = "2012-02-29";
            String dateString4 = "02/29/2012";
            String dateString5 = "2012/02/29";
            String dateString6 = "29 Feb 2012";
            String dateString7 = "29 February 2012";
            String dateString8 = "201202291200";
            String dateString9 = "20120229 1200";
            String dateString10 = "29-02-2012 12:00";
            String dateString11 = "2012-02-29 12:00";
            String dateString12 = "02/29/2012 12:00";
            String dateString13 = "2012/02/29 12:00";
            String dateString14 = "29 Feb 2012 12:00";
            String dateString15 = "29 February 2012 12:00";
            String dateString16 = "20120229120055";
            String dateString17 = "20120229 120055";
            String dateString18 = "29-02-2012 12:00:55";
            String dateString19 = "2012-02-29 12:00:55";
            String dateString20 = "02/29/2012 12:00:55";
            String dateString21 = "2012/02/29 12:00:55";
            String dateString22 = "29 Feb 2012 12:00:55";
            String dateString23 = "29 February 2012 12:00:55";

            System.out.println("dateString1  = " + dateString1);
            System.out.println("dateString2  = " + dateString2);
            System.out.println("dateString3  = " + dateString3);
            System.out.println("dateString4  = " + dateString4);
            System.out.println("dateString5  = " + dateString5);
            System.out.println("dateString6  = " + dateString6);
            System.out.println("dateString7  = " + dateString7);
            System.out.println("dateString8  = " + dateString8);
            System.out.println("dateString9  = " + dateString9);
            System.out.println("dateString10 = " + dateString10);
            System.out.println("dateString11 = " + dateString11);
            System.out.println("dateString12 = " + dateString12);
            System.out.println("dateString13 = " + dateString13);
            System.out.println("dateString14 = " + dateString14);
            System.out.println("dateString15 = " + dateString15);
            System.out.println("dateString16 = " + dateString16);
            System.out.println("dateString17 = " + dateString17);
            System.out.println("dateString18 = " + dateString18);
            System.out.println("dateString19 = " + dateString19);
            System.out.println("dateString20 = " + dateString20);
            System.out.println("dateString21 = " + dateString21);
            System.out.println("dateString22 = " + dateString22);
            System.out.println("dateString23 = " + dateString23);

            System.out.println("");
            System.out.println("Set Up Date Formats");
            System.out.println("-------------------");
            
            String formatString1 = "yyyyMMdd";
            String formatString2 = "dd/MM/yyyy";
            String formatString3 = "yyyy-MM-dd";
            String formatString4 = "MM/dd/yyyy";
            String formatString5 = "yyyy/MM/dd";
            String formatString6 = "dd MMM yyyy";
            String formatString7 = "dd MMMM yyyy";
            String formatString8 = "yyyyMMddHHmm";
            String formatString9 = "yyyyMMdd HHmm";
            String formatString10 = "dd-MM-yyyy HH:mm";
            String formatString11 = "yyyy-MM-dd HH:mm";
            String formatString12 = "MM/dd/yyyy HH:mm";
            String formatString13 = "yyyy/MM/dd HH:mm";
            String formatString14 = "dd MMM yyyy HH:mm";
            String formatString15 = "dd MMMM yyyy HH:mm";
            String formatString16 = "yyyyMMddHHmmss";
            String formatString17 = "yyyyMMdd HHmmss";
            String formatString18 = "dd-MM-yyyy HH:mm:ss";
            String formatString19 = "yyyy-MM-dd HH:mm:ss";
            String formatString20 = "MM/dd/yyyy HH:mm:ss";
            String formatString21 = "yyyy/MM/dd HH:mm:ss";
            String formatString22 = "dd MMM yyyy HH:mm:ss";
            String formatString23 = "dd MMMM yyyy HH:mm:ss";

            System.out.println("formatString1  = " + formatString1);
            System.out.println("formatString2  = " + formatString2);
            System.out.println("formatString3  = " + formatString3);
            System.out.println("formatString4  = " + formatString4);
            System.out.println("formatString5  = " + formatString5);
            System.out.println("formatString6  = " + formatString6);
            System.out.println("formatString7  = " + formatString7);
            System.out.println("formatString8  = " + formatString8);
            System.out.println("formatString9  = " + formatString9);
            System.out.println("formatString10 = " + formatString10);
            System.out.println("formatString11 = " + formatString11);
            System.out.println("formatString12 = " + formatString12);
            System.out.println("formatString13 = " + formatString13);
            System.out.println("formatString14 = " + formatString14);
            System.out.println("formatString15 = " + formatString15);
            System.out.println("formatString16 = " + formatString16);
            System.out.println("formatString17 = " + formatString17);
            System.out.println("formatString18 = " + formatString18);
            System.out.println("formatString19 = " + formatString19);
            System.out.println("formatString20 = " + formatString20);
            System.out.println("formatString21 = " + formatString21);
            System.out.println("formatString22 = " + formatString22);
            System.out.println("formatString23 = " + formatString23);

    	   	SimpleDateFormat format1 = new SimpleDateFormat(formatString1);
            SimpleDateFormat format2 = new SimpleDateFormat(formatString2);
            SimpleDateFormat format3 = new SimpleDateFormat(formatString3);
            SimpleDateFormat format4 = new SimpleDateFormat(formatString4);
            SimpleDateFormat format5 = new SimpleDateFormat(formatString5);
            SimpleDateFormat format6 = new SimpleDateFormat(formatString6);
            SimpleDateFormat format7 = new SimpleDateFormat(formatString7);
            SimpleDateFormat format8 = new SimpleDateFormat(formatString8);
            SimpleDateFormat format9 = new SimpleDateFormat(formatString9);
            SimpleDateFormat format10 = new SimpleDateFormat(formatString10);
            SimpleDateFormat format11 = new SimpleDateFormat(formatString11);
            SimpleDateFormat format12 = new SimpleDateFormat(formatString12);
            SimpleDateFormat format13 = new SimpleDateFormat(formatString13);
            SimpleDateFormat format14 = new SimpleDateFormat(formatString14);
            SimpleDateFormat format15 = new SimpleDateFormat(formatString15);
            SimpleDateFormat format16 = new SimpleDateFormat(formatString16);
            SimpleDateFormat format17 = new SimpleDateFormat(formatString17);
            SimpleDateFormat format18 = new SimpleDateFormat(formatString18);
            SimpleDateFormat format19 = new SimpleDateFormat(formatString19);
            SimpleDateFormat format20 = new SimpleDateFormat(formatString20);
            SimpleDateFormat format21 = new SimpleDateFormat(formatString21);
            SimpleDateFormat format22 = new SimpleDateFormat(formatString22);
            SimpleDateFormat format23 = new SimpleDateFormat(formatString23);

            System.out.println("");
            System.out.println("Parse Date Strings Using Date Formats");
            System.out.println("-------------------------------------");
            
            Date parsed1 = format1.parse(dateString1);
    	   	Date parsed2 = format2.parse(dateString2);
    	   	Date parsed3 = format3.parse(dateString3);
    	   	Date parsed4 = format4.parse(dateString4);
    	   	Date parsed5 = format5.parse(dateString5);
    	   	Date parsed6 = format6.parse(dateString6);
    	   	Date parsed7 = format7.parse(dateString7);
    	   	Date parsed8 = format8.parse(dateString8);
    	   	Date parsed9 = format9.parse(dateString9);
    	   	Date parsed10 = format10.parse(dateString10);
    	   	Date parsed11 = format11.parse(dateString11);
    	   	Date parsed12 = format12.parse(dateString12);
    	   	Date parsed13 = format13.parse(dateString13);
    	   	Date parsed14 = format14.parse(dateString14);
    	   	Date parsed15 = format15.parse(dateString15);
    	   	Date parsed16 = format16.parse(dateString16);
    	   	Date parsed17 = format17.parse(dateString17);
    	   	Date parsed18 = format18.parse(dateString18);
    	   	Date parsed19 = format19.parse(dateString19);
    	   	Date parsed20 = format20.parse(dateString20);
    	   	Date parsed21 = format21.parse(dateString21);
    	   	Date parsed22 = format22.parse(dateString22);
    	   	Date parsed23 = format23.parse(dateString23);

            System.out.println("");
            System.out.println("Print Out Date Strings Parsed Using Date Formats");
            System.out.println("------------------------------------------------");
            
            System.out.println("format1.parse(dateString1)   = " + parsed1.toString());
            System.out.println("format2.parse(dateString2)   = " + parsed2.toString());
            System.out.println("format3.parse(dateString3)   = " + parsed3.toString());
            System.out.println("format4.parse(dateString4)   = " + parsed4.toString());
            System.out.println("format5.parse(dateString5)   = " + parsed5.toString());
            System.out.println("format6.parse(dateString6)   = " + parsed6.toString());
            System.out.println("format7.parse(dateString7)   = " + parsed7.toString());
            System.out.println("format8.parse(dateString8)   = " + parsed8.toString());
            System.out.println("format9.parse(dateString9)   = " + parsed9.toString());
            System.out.println("format10.parse(dateString10) = " + parsed10.toString());
            System.out.println("format11.parse(dateString11) = " + parsed11.toString());
            System.out.println("format12.parse(dateString12) = " + parsed12.toString());
            System.out.println("format13.parse(dateString13) = " + parsed13.toString());
            System.out.println("format14.parse(dateString14) = " + parsed14.toString());
            System.out.println("format15.parse(dateString15) = " + parsed15.toString());
            System.out.println("format16.parse(dateString16) = " + parsed16.toString());
            System.out.println("format17.parse(dateString17) = " + parsed17.toString());
            System.out.println("format18.parse(dateString18) = " + parsed18.toString());
            System.out.println("format19.parse(dateString19) = " + parsed19.toString());
            System.out.println("format20.parse(dateString20) = " + parsed20.toString());
            System.out.println("format21.parse(dateString21) = " + parsed21.toString());
            System.out.println("format22.parse(dateString22) = " + parsed22.toString());
            System.out.println("format23.parse(dateString23) = " + parsed23.toString());

            System.out.println("");
            System.out.println("Print Out Date Strings Parsed Using OTHER Date Formats");
            System.out.println("------------------------------------------------------");
            
            System.out.println("format1.format(parsed23)  = " + format1.format(parsed23));
            System.out.println("format2.format(parsed22)  = " + format2.format(parsed22));
            System.out.println("format3.format(parsed21)  = " + format3.format(parsed21));
            System.out.println("format4.format(parsed20)  = " + format4.format(parsed20));
            System.out.println("format5.format(parsed19)  = " + format5.format(parsed19));
            System.out.println("format6.format(parsed18)  = " + format6.format(parsed18));
            System.out.println("format7.format(parsed17)  = " + format7.format(parsed17));
            System.out.println("format8.format(parsed16)  = " + format8.format(parsed16));
            System.out.println("format9.format(parsed15)  = " + format9.format(parsed15));
            System.out.println("format10.format(parsed14) = " + format10.format(parsed4));
            System.out.println("format11.format(parsed13) = " + format11.format(parsed13));
            System.out.println("format12.format(parsed12) = " + format12.format(parsed12));
            System.out.println("format13.format(parsed11) = " + format13.format(parsed11));
            System.out.println("format14.format(parsed10) = " + format14.format(parsed10));
            System.out.println("format15.format(parsed9)  = " + format15.format(parsed9));
            System.out.println("format16.format(parsed8)  = " + format16.format(parsed8));
            System.out.println("format17.format(parsed7)  = " + format17.format(parsed7));
            System.out.println("format18.format(parsed6)  = " + format18.format(parsed6));
            System.out.println("format19.format(parsed5)  = " + format19.format(parsed5));
            System.out.println("format20.format(parsed4)  = " + format20.format(parsed4));
            System.out.println("format21.format(parsed3)  = " + format21.format(parsed3));
            System.out.println("format22.format(parsed2)  = " + format22.format(parsed2));
            System.out.println("format23.format(parsed1)  = " + format23.format(parsed1));
            /*
            */
            
            System.out.println("");
            System.out.println("Parse Date Strings Using DateUtil package");
            System.out.println("-----------------------------------------");
            
            Date date1 = DateUtil.parse(dateString1);
            Date date2 = DateUtil.parse(dateString2); 
            Date date3 = DateUtil.parse(dateString3); 
            Date date4 = DateUtil.parse(dateString4);
            Date date5 = DateUtil.parse(dateString5);
            Date date6 = DateUtil.parse(dateString6); 
            Date date7 = DateUtil.parse(dateString7);
            Date date8 = DateUtil.parse(dateString8);
            Date date9 = DateUtil.parse(dateString9);
            Date date10 = DateUtil.parse(dateString10);
            Date date11 = DateUtil.parse(dateString11);
            Date date12 = DateUtil.parse(dateString12);
            Date date13 = DateUtil.parse(dateString13);
            Date date14 = DateUtil.parse(dateString14);
            Date date15 = DateUtil.parse(dateString15);
            Date date16 = DateUtil.parse(dateString16);
            Date date17 = DateUtil.parse(dateString17);
            Date date18 = DateUtil.parse(dateString18);
            Date date19 = DateUtil.parse(dateString19);
            Date date20 = DateUtil.parse(dateString20);
            Date date21 = DateUtil.parse(dateString21);
            Date date22 = DateUtil.parse(dateString22);
            Date date23 = DateUtil.parse(dateString23);

            System.out.println("");
            System.out.println("Print Out Date Strings Parsed Using DateUtil package");
            System.out.println("----------------------------------------------------");
            
            System.out.println("date1.toString()  = " + date1.toString());
            System.out.println("date2.toString()  = " + date2.toString());
            System.out.println("date3.toString()  = " + date3.toString());
            System.out.println("date4.toString()  = " + date4.toString());
            System.out.println("date5.toString()  = " + date5.toString());
            System.out.println("date6.toString()  = " + date6.toString());
            System.out.println("date7.toString()  = " + date7.toString());
            System.out.println("date8.toString()  = " + date8.toString());
            System.out.println("date9.toString()  = " + date9.toString());
            System.out.println("date10.toString() = " + date10.toString());
            System.out.println("date11.toString() = " + date11.toString());
            System.out.println("date12.toString() = " + date12.toString());
            System.out.println("date13.toString() = " + date13.toString());
            System.out.println("date14.toString() = " + date14.toString());
            System.out.println("date15.toString() = " + date15.toString());
            System.out.println("date16.toString() = " + date16.toString());
            System.out.println("date17.toString() = " + date17.toString());
            System.out.println("date18.toString() = " + date18.toString());
            System.out.println("date19.toString() = " + date19.toString());
            System.out.println("date20.toString() = " + date20.toString());
            System.out.println("date21.toString() = " + date21.toString());
            System.out.println("date22.toString() = " + date22.toString());
            System.out.println("date23.toString() = " + date23.toString());

            System.out.println("");
            System.out.println("Convert Dates to Calendars using DateUtil package");
            System.out.println("-------------------------------------------------");
            
            Calendar calendar1 = DateUtil.toCalendar(date1);
            Calendar calendar2 = DateUtil.toCalendar(date2); 
            Calendar calendar3 = DateUtil.toCalendar(date3); 
            Calendar calendar4 = DateUtil.toCalendar(date4);
            Calendar calendar5 = DateUtil.toCalendar(date5);
            Calendar calendar6 = DateUtil.toCalendar(date6); 
            Calendar calendar7 = DateUtil.toCalendar(date7);
            Calendar calendar8 = DateUtil.toCalendar(date8);
            Calendar calendar9 = DateUtil.toCalendar(date9);
            Calendar calendar10 = DateUtil.toCalendar(date10);
            Calendar calendar11 = DateUtil.toCalendar(date11);
            Calendar calendar12 = DateUtil.toCalendar(date12);
            Calendar calendar13 = DateUtil.toCalendar(date13);
            Calendar calendar14 = DateUtil.toCalendar(date14);
            Calendar calendar15 = DateUtil.toCalendar(date15);
            Calendar calendar16 = DateUtil.toCalendar(date16);
            Calendar calendar17 = DateUtil.toCalendar(date17);
            Calendar calendar18 = DateUtil.toCalendar(date18);
            Calendar calendar19 = DateUtil.toCalendar(date19);
            Calendar calendar20 = DateUtil.toCalendar(date20);
            Calendar calendar21 = DateUtil.toCalendar(date21);
            Calendar calendar22 = DateUtil.toCalendar(date22);
            Calendar calendar23 = DateUtil.toCalendar(date23);

            System.out.println("");
            System.out.println("Print Out Converted Calendars");
            System.out.println("-----------------------------");
            
            System.out.println("calendar1.getTime()  = " + calendar1.getTime());
            System.out.println("calendar2.getTime()  = " + calendar2.getTime());
            System.out.println("calendar3.getTime()  = " + calendar3.getTime());
            System.out.println("calendar4.getTime()  = " + calendar4.getTime());
            System.out.println("calendar5.getTime()  = " + calendar5.getTime());
            System.out.println("calendar6.getTime()  = " + calendar6.getTime());
            System.out.println("calendar7.getTime()  = " + calendar7.getTime());
            System.out.println("calendar8.getTime()  = " + calendar8.getTime());
            System.out.println("calendar9.getTime()  = " + calendar9.getTime());
            System.out.println("calendar10.getTime() = " + calendar10.getTime());
            System.out.println("calendar11.getTime() = " + calendar11.getTime());
            System.out.println("calendar12.getTime() = " + calendar12.getTime());
            System.out.println("calendar13.getTime() = " + calendar13.getTime());
            System.out.println("calendar14.getTime() = " + calendar14.getTime());
            System.out.println("calendar15.getTime() = " + calendar15.getTime());
            System.out.println("calendar16.getTime() = " + calendar16.getTime());
            System.out.println("calendar17.getTime() = " + calendar17.getTime());
            System.out.println("calendar18.getTime() = " + calendar18.getTime());
            System.out.println("calendar19.getTime() = " + calendar19.getTime());
            System.out.println("calendar20.getTime() = " + calendar20.getTime());
            System.out.println("calendar21.getTime() = " + calendar21.getTime());
            System.out.println("calendar22.getTime() = " + calendar22.getTime());
            System.out.println("calendar23.getTime() = " + calendar23.getTime());
            /*
             */

            System.out.println("");
            System.out.println("Date Arithmetic using DateUtil package");
            System.out.println("--------------------------------------");
            
            Date date24 = DateUtil.addYears(date1, -1);
            Date date25 = DateUtil.addMonths(date2, -1); 
            Date date26 = DateUtil.addDays(date3, -1); 
            Date date27 = DateUtil.addHours(date4, -1);
            Date date28 = DateUtil.addMinutes(date5, -1);
            Date date29 = DateUtil.addSeconds(date6, -1); 
            Date date30 = DateUtil.addMillis(date7, -1);

            Date date31 = DateUtil.addYearsMonthsDaysHoursMinutesSecondsMillis(date1, 1, 1, 1, 1, 1, 1, 1);
            Date date32 = DateUtil.addYearsMonthsDaysHoursMinutesSecondsMillis(date1, -1, -1, -1, -1, -1, -1, -1);

            System.out.println("date24 = DateUtil.addYears(date1, -1)   = " + date24.toString());
            System.out.println("date25 = DateUtil.addMonths(date2, -1)  = " + date25.toString());
            System.out.println("date26 = DateUtil.addDays(date3, -1)    = " + date26.toString());
            System.out.println("date27 = DateUtil.addHours(date4, -1)   = " + date27.toString());
            System.out.println("date28 = DateUtil.addMinutes(date5, -1) = " + date28.toString());
            System.out.println("date29 = DateUtil.addSeconds(date6, -1) = " + date29.toString());
            System.out.println("date30 = DateUtil.addMillis(date7, -1)  = " + date30.toString());

            System.out.println("date31 = DateUtil.addYearsMonthsDaysHoursMinutesSecondsMillis(date1, 1, 1, 1, 1, 1, 1, 1)        = " + date31.toString());
            System.out.println("date32 = DateUtil.addYearsMonthsDaysHoursMinutesSecondsMillis(date1, -1, -1, -1, -1, -1, -1, -1) = " + date32.toString());

            System.out.println("");

            Calendar calendar24 = DateUtil.toCalendar(date24);
            Calendar calendar25 = DateUtil.toCalendar(date25);
            Calendar calendar26 = DateUtil.toCalendar(date26);
            Calendar calendar27 = DateUtil.toCalendar(date27);
            Calendar calendar28 = DateUtil.toCalendar(date28);
            Calendar calendar29 = DateUtil.toCalendar(date29);
            Calendar calendar30 = DateUtil.toCalendar(date30);

            System.out.println("date24 = calendar24.getTime() = " + calendar24.getTime());
            System.out.println("date25 = calendar25.getTime() = " + calendar25.getTime());
            System.out.println("date26 = calendar26.getTime() = " + calendar26.getTime());
            System.out.println("date27 = calendar27.getTime() = " + calendar27.getTime());
            System.out.println("date28 = calendar28.getTime() = " + calendar28.getTime());
            System.out.println("date29 = calendar29.getTime() = " + calendar29.getTime());
            System.out.println("date30 = calendar30.getTime() = " + calendar30.getTime());

            System.out.println("");
            System.out.println("Calendar Arithmetic using CalendarUtil package");
            System.out.println("----------------------------------------------");
            
            Calendar calendar31 = calendar1;
            Calendar calendar32 = calendar2;
            Calendar calendar33 = calendar3;
            Calendar calendar34 = calendar4;
            Calendar calendar35 = calendar5;
            Calendar calendar36 = calendar6;
            Calendar calendar37 = calendar7;

            CalendarUtil.addYears(calendar31, 1);
            CalendarUtil.addMonths(calendar32, 1); 
            CalendarUtil.addDays(calendar33, 1); 
            CalendarUtil.addHours(calendar34, 1);
            CalendarUtil.addMinutes(calendar35, 1);
            CalendarUtil.addSeconds(calendar36, 1); 
            CalendarUtil.addMillis(calendar37, 1);

            System.out.println("calendar31 = CalendarUtil.addYears(calendar1, 1)   = " + calendar31.getTime());
            System.out.println("calendar32 = CalendarUtil.addMonths(calendar2, 1)  = " + calendar32.getTime());
            System.out.println("calendar33 = CalendarUtil.addDays(calendar3, 1)    = " + calendar33.getTime());
            System.out.println("calendar34 = CalendarUtil.addHours(calendar4, 1)   = " + calendar34.getTime());
            System.out.println("calendar35 = CalendarUtil.addMinutes(calendar5, 1) = " + calendar35.getTime());
            System.out.println("calendar36 = CalendarUtil.addSeconds(calendar6, 1) = " + calendar36.getTime());
            System.out.println("calendar37 = CalendarUtil.addMillis(calendar7, 1)  = " + calendar37.getTime());

            System.out.println("");
            System.out.println("Date Comparison using DateUtil package");
            System.out.println("--------------------------------------");
            
            boolean b1 = DateUtil.sameYear(date1, date2);
            boolean b2 = DateUtil.sameMonth(date3, date4);
            boolean b3 = DateUtil.sameDay(date5, date6);
            boolean b4 = DateUtil.sameHour(date7, date8);
            boolean b5 = DateUtil.sameMinute(date9, date10);
            boolean b6 = DateUtil.sameSecond(date11, date12);

            if (b1) {
                System.out.println("");
            	System.out.println("DateUtil.sameYear(date1, date2) is TRUE");
                System.out.println("date1  = " + date1.toString());
                System.out.println("date2  = " + date2.toString());
            }
            else {
                System.out.println("");
            	System.out.println("DateUtil.sameYear(date1, date2) is FALSE");
                System.out.println("date1  = " + date1.toString());
                System.out.println("date2  = " + date2.toString());
            }

            if (b2) {
                System.out.println("");
            	System.out.println("DateUtil.sameMonth(date3, date4) is TRUE");
                System.out.println("date3  = " + date3.toString());
                System.out.println("date4  = " + date4.toString());
            }
            else {
                System.out.println("");
            	System.out.println("DateUtil.sameMonth(date3, date4) is FALSE");
                System.out.println("date3  = " + date3.toString());
                System.out.println("date4  = " + date4.toString());
            }

            if (b3) {
                System.out.println("");
            	System.out.println("DateUtil.sameDay(date5, date6) is TRUE");
                System.out.println("date5  = " + date5.toString());
                System.out.println("date6  = " + date6.toString());
            }
            else {
                System.out.println("");
            	System.out.println("DateUtil.sameDay(date5, date6) is FALSE");
                System.out.println("date5  = " + date5.toString());
                System.out.println("date6  = " + date6.toString());
            }

            if (b4) {
                System.out.println("");
            	System.out.println("DateUtil.sameHour(date7, date8) is TRUE");
                System.out.println("date7  = " + date7.toString());
                System.out.println("date8  = " + date8.toString());
            }
            else {
                System.out.println("");
            	System.out.println("DateUtil.sameHour(date7, date8) is FALSE");
                System.out.println("date7  = " + date7.toString());
                System.out.println("date8  = " + date8.toString());
            }

            if (b5) {
                System.out.println("");
            	System.out.println("DateUtil.sameMinute(date9, date10) is TRUE");
                System.out.println("date9  = " + date9.toString());
                System.out.println("date10 = " + date10.toString());
            }
            else {
                System.out.println("");
            	System.out.println("DateUtil.sameMinute(date9, date10) is FALSE");
                System.out.println("date9  = " + date9.toString());
                System.out.println("date10 = " + date10.toString());
            }

            if (b6) {
                System.out.println("");
            	System.out.println("DateUtil.sameSecond(date11, date12) is TRUE");
                System.out.println("date11 = " + date11.toString());
                System.out.println("date12 = " + date12.toString());
            }
            else {
                System.out.println("");
            	System.out.println("DateUtil.sameSecond(date11, date12) is FALSE");
                System.out.println("date11 = " + date11.toString());
                System.out.println("date12 = " + date12.toString());
            }

            System.out.println("");
            System.out.println("Calendar Comparison using CalendarUtil package");
            System.out.println("----------------------------------------------");
            
            boolean b7 = CalendarUtil.sameYear(calendar1, calendar2);
            boolean b8 = CalendarUtil.sameMonth(calendar3, calendar4);
            boolean b9 = CalendarUtil.sameDay(calendar5, calendar6);
            boolean b10 = CalendarUtil.sameHour(calendar7, calendar8);
            boolean b11 = CalendarUtil.sameMinute(calendar9, calendar10);
            boolean b12 = CalendarUtil.sameSecond(calendar11, calendar12);

            if (b7) {
                System.out.println("");
            	System.out.println("CalendarUtil.sameYear(calendar1, calendar2) is TRUE");
                System.out.println("calendar1  = " + calendar1.get(Calendar.YEAR));
                System.out.println("calendar2  = " + calendar2.get(Calendar.YEAR));
            }
            else {
                System.out.println("");
            	System.out.println("CalendarUtil.sameYear(calendar1, calendar2) is FALSE");
                System.out.println("calendar1  = " + calendar1.get(Calendar.YEAR));
                System.out.println("calendar2  = " + calendar2.get(Calendar.YEAR));
            }

            if (b8) {
                System.out.println("");
            	System.out.println("CalendarUtil.sameMonth(calendar3, calendar4) is TRUE");
                System.out.println("calendar3  = " + calendar3.get(Calendar.MONTH));
                System.out.println("calendar4  = " + calendar4.get(Calendar.MONTH));
            }
            else {
                System.out.println("");
            	System.out.println("CalendarUtil.sameMonth(calendar3, calendar4) is FALSE");
                System.out.println("calendar3  = " + calendar3.get(Calendar.MONTH));
                System.out.println("calendar4  = " + calendar4.get(Calendar.MONTH));
            }

            if (b9) {
                System.out.println("");
            	System.out.println("CalendarUtil.sameDay(calendar5, calendar6) is TRUE");
                System.out.println("calendar5  = " + calendar5.get(Calendar.DAY_OF_MONTH));
                System.out.println("calendar6  = " + calendar6.get(Calendar.DAY_OF_MONTH));
            }
            else {
                System.out.println("");
            	System.out.println("CalendarUtil.sameDay(calendar5, calendar6) is FALSE");
                System.out.println("calendar5  = " + calendar5.get(Calendar.DAY_OF_MONTH));
                System.out.println("calendar6  = " + calendar6.get(Calendar.DAY_OF_MONTH));
            }

            if (b10) {
                System.out.println("");
            	System.out.println("CalendarUtil.sameHour(calendar7, calendar8) is TRUE");
                System.out.println("calendar7  = " + calendar7.get(Calendar.HOUR_OF_DAY));
                System.out.println("calendar8  = " + calendar8.get(Calendar.HOUR_OF_DAY));
            }
            else {
                System.out.println("");
            	System.out.println("CalendarUtil.sameHour(calendar7, calendar8) is FALSE");
                System.out.println("calendar7  = " + calendar7.get(Calendar.HOUR_OF_DAY));
                System.out.println("calendar8  = " + calendar8.get(Calendar.HOUR_OF_DAY));
            }

            if (b11) {
                System.out.println("");
            	System.out.println("CalendarUtil.sameMinute(calendar9, calendar10) is TRUE");
                System.out.println("calendar9  = " + calendar9.get(Calendar.MINUTE));
                System.out.println("calendar10 = " + calendar10.get(Calendar.MINUTE));
            }
            else {
                System.out.println("");
            	System.out.println("CalendarUtil.sameMinute(calendar9, calendar10) is FALSE");
                System.out.println("calendar9  = " + calendar9.get(Calendar.MINUTE));
                System.out.println("calendar10 = " + calendar10.get(Calendar.MINUTE));
            }

            if (b12) {
                System.out.println("");
            	System.out.println("CalendarUtil.sameSecond(calendar11, calendar12) is TRUE");
                System.out.println("calendar11 = " + calendar11.get(Calendar.SECOND));
                System.out.println("calendar12 = " + calendar12.get(Calendar.SECOND));
            }
            else {
                System.out.println("");
            	System.out.println("CalendarUtil.sameSecond(calendar11, calendar12) is FALSE");
                System.out.println("calendar11 = " + calendar11.get(Calendar.SECOND));
                System.out.println("calendar12 = " + calendar12.get(Calendar.SECOND));
            }
            /*
             */

            System.out.println("");
            System.out.println("More Date Comparisons using DateUtil package");
            System.out.println("--------------------------------------------");
            
            int i1 = DateUtil.elapsedYears(date32,  date31);
            int i2 = DateUtil.elapsedMonths(date32,  date31);
            int i3 = DateUtil.elapsedDays(date32,  date31);
            int i4 = DateUtil.elapsedHours(date32,  date31);
            int i5 = DateUtil.elapsedMinutes(date32,  date31);
            int i6 = DateUtil.elapsedSeconds(date32,  date31);
            long l1 = DateUtil.elapsedMillis(date32,  date31);
            int[] intArray = DateUtil.elapsedTime(date32,  date31);

            System.out.println("DateUtil.elapsedYears(date32,  date31)     = " + i1 + " years");
            System.out.println("DateUtil.elapsedMonths(date32,  date31)    = " + i2 + " months");
            System.out.println("DateUtil.elapsedDays(date32,  date31)      = " + i3 + " days");
            System.out.println("DateUtil.elapsedHours(date32,  date31)     = " + i4 + " hours");
            System.out.println("DateUtil.elapsedMinutes(date32,  date31)   = " + i5 + " minutes");
            System.out.println("DateUtil.elapsedSeconds(date32,  date31)   = " + i6 + " seconds");
            System.out.println("DateUtil.elapsedMillis(date32,  date31)    = " + l1 + " milliseconds");

            System.out.println("");

            String appendStr = "";
            
            for (int i = 0; i < intArray.length; i++) {
            	if (i == 0) { appendStr = " Years"; }
            	if (i == 1) { appendStr = " Months"; }
            	if (i == 2) { appendStr = " Days"; }
            	if (i == 3) { appendStr = " Hours"; }
            	if (i == 4) { appendStr = " Minutes"; }
            	if (i == 5) { appendStr = " Seconds"; }
                System.out.println("DateUtil.elapsedTime(date32,  date31) = " + intArray[i] + appendStr);
            }
            
            System.out.println("");
            System.out.println("More Calendar Comparisons using CalendarUtil package");
            System.out.println("----------------------------------------------------");
            
            int i7 = CalendarUtil.elapsedYears(calendar2, calendar1);
            int i8 = CalendarUtil.elapsedMonths(calendar4, calendar3);
            int i9 = CalendarUtil.elapsedDays(calendar6, calendar5);
            int i10 = CalendarUtil.elapsedHours(calendar7, calendar8);
            int i11 = CalendarUtil.elapsedMinutes(calendar9, calendar10);
            int i12 = CalendarUtil.elapsedSeconds(calendar11, calendar12);
            long l2 = CalendarUtil.elapsedMillis(calendar13, calendar14);
            int[] intArray2 = CalendarUtil.elapsedTime(calendar15, calendar16);

            System.out.println("CalendarUtil.elapsedYears(calendar2, calendar1)     = " + i7 + " years");
            System.out.println("CalendarUtil.elapsedMonths(calendar4, calendar3)    = " + i8 + " months");
            System.out.println("CalendarUtil.elapsedDays(calendar6, calendar5)      = " + i9 + " days");
            System.out.println("CalendarUtil.elapsedHours(calendar7, calendar8)     = " + i10 + " hours");
            System.out.println("CalendarUtil.elapsedMinutes(calendar9, calendar10)  = " + i11 + " minutes");
            System.out.println("CalendarUtil.elapsedSeconds(calendar11, calendar12) = " + i12 + " seconds");
            System.out.println("CalendarUtil.elapsedMillis(calendar13, calendar14)  = " + l2 + " milliseconds");
            
            System.out.println("");

            String appendStr2 = "";
            
            for (int i = 0; i < intArray2.length; i++) {
            	if (i == 0) { appendStr2 = " Years"; }
            	if (i == 1) { appendStr2 = " Months"; }
            	if (i == 2) { appendStr2 = " Days"; }
            	if (i == 3) { appendStr2 = " Hours"; }
            	if (i == 4) { appendStr2 = " Minutes"; }
            	if (i == 5) { appendStr2 = " Seconds"; }
                System.out.println("CalendarUtil.elapsedTime(calendar15, calendar16) = " + intArray2[i] + appendStr2);
            }

            System.out.println("");

            Wrapper.printEpilogue("*", Wrapper.getExecutingClass(), startTime);
    	}
    	catch (Exception e) {
    		
    		e.printStackTrace();
    	}
	}  
}
