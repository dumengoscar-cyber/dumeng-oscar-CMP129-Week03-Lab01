public class DateTest {
    public static void main(String[] args){


        Date date1 = new Date(12, 25, 2014);
        Date date2 = new Date(7, 14, 2025);
        //display date 1 in format
        date1.displayNumeric();
        date1.displayMonthFirst();
        date1.displayDayFirst();

        System.out.println();
//display date2
           date2.displayNumeric();
        date2.displayMonthFirst();
        date2.displayDayFirst();


            //set date2
            date2.setMonth(10);
            date2.setDay(31);
            date2.setYear(2026);

            System.out.println();

            //display update for date 2
date2.displayNumeric();
date2.displayMonthFirst();
date2.displayDayFirst();

//test invalid month and day
date2.setMonth(15);
date2.setDay(40);

//getter
System.out.println();
System.out.println("month " + date2.getMonth());
System.out.println("day: " + date2.getDay());
System.out.println("year: " + date2.getYear());

        
    }
    
}
