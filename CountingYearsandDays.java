import java.util.*;
class CountingYearsandDays
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Input number of minutes:");
        double min=sc.nextDouble();
        double minInYear = 60*24*365;
        long years = (long)(min/minInYear);
        int days = (int)(min/60/24)%365;
        System.out.println((int)min+" minutes is approximately "+years+" years and "+days+" days.");
    }
} 
        