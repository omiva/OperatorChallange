package com.company;

public class Main
{
    public static void main(String[] args)
    {
        double blat=20d,clat=80d;
        double AlmostThere=100*(blat+clat);
        double ReminderTime = AlmostThere%40;

        boolean blast=(ReminderTime==0) ? true :false;
        System.out.println("We don't have a reminder="+blast);

        if(blast== false)
        {
            System.out.println("you wrong rat");
        }
    }
}
