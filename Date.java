//name: oscar dumeng
// lab 1
// date: 9/22/2026
// course: cmp 129
// 
public class Date {
    
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int m)
    { month = m;
    }
    public void setDay(int d)
    {day = d;
    }
    public void setYear(int y)
    {year = y;
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
    public void displayInfo()
    {
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        System.out.println("year: " + year);
    }
}
