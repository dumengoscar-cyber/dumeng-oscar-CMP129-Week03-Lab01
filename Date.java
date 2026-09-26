//name: oscar dumeng
// lab 1
// date: 9/22/2026
// course: cmp 129
// 
public class Date {
    
    private int month;
    private int day;
    private int year;
    private String[] months = {
        "january", "february", "march", "april", "may", "june", "july", "augest", "september", "october", "november", "december" 
    };

    public Date(int month, int day, int year)
    {
        setMonth(month);
        setDay(day);
       this.year = year;
    }

   public void setMonth(int m)
{
    if (m >= 1 && m <= 12)
    {
        this.month = m;
    }
    else
    {
        System.out.println("Invalid month.");
    }
}
 public void setDay(int d)
{
    if (d >= 1 && d <= 31)
    {
        this.day = d;
    }
    else
    {
        System.out.println("Invalid day.");
    }
}
    public void setYear(int y)
    {this.year = y;
    }
    public int getMonth()
    {return month;
    }
    public int getDay()
    {return day;
    }
    public int getYear()
    {return year;
    }
    public void displayNumeric()
    {
System.out.println(month + "/" + day + "/" + year);
    }
    
        public void displayMonthFirst()
        { 
            System.out.println(months[month - 1] + " " + day + ", " + year);
         }
         public void displayDayFirst()
         {
            System.out.println(day + " " + months[month - 1] + " " + year);
         }
}
