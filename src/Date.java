/**
 * Write a description of class Date here.
 *
 * @author Meng
 * @version 9/30/2018
 */
public class Date
{
    public static void main(String[] args){
        Date d = new Date();
        d.setDate(10, 21, 2018);
        d.report();
    }
    //instance variables: "has a"
    private int month;
    private int day;
    private int year;

    public Date(){
        month = 0;
        day = 0;
        year = 0;
    }
    public Date(Date otherDate){
        this.day = otherDate.day;
        this.month = otherDate.month;
        this.year = otherDate.year;
    }
    public Date(int m, int d, int y) {
        if (m >= 1 && m <= 12) {
            this.month = m;
        } else {
            this.month = 0;
        }

        if (d >= 1 && d <= 31) {
            this.day = d;
        } else {
            this.day = 0;
        }

        if (y >= 1) {
            this.year = y;
        } else {
            this.year = 0;
        }
    }
    //setter
    public void setDate(int m, int d, int y) {//what should you check?
        if (m >= 1 && m <= 12) {
            this.month = m;
        } else {
            this.month = 0;
        }

        if (d >= 1 && d <= 31) {
            this.day = d;
        } else {
            this.day = 0;
        }

        if (y >= 1) {
            this.year = y;
        } else {
            this.year = 0;
        }
    }
    public void setMonth(int month){
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month... Setting month as " + this.month);
        }
    }
    public void setDay(int day){
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid day... Setting day as " + this.day);
        }
    }
    public void setYear(int year){
        if (year >= 1){
            this.year = year;
        } else {
            System.out.println("Invalid year... Setting year as " + this.year);
        }
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }

    //prints out date
    public void report(){
        System.out.printf("%d/%d/%d",month, day, year);
    }

    //Returns the date
    @Override
    public String toString(){
        return this.month + "/" + this.day + "/" + this.year;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Date)){
            return false;
        }

        Date otherDate = (Date) obj;

        return this.day == otherDate.day
                && this.month == otherDate.month
                && this.year == otherDate.year;
    }
}

