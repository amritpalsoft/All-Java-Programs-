package Codingninja;


import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String monthname="a";
        int noofdays=0;
        System.out.print("Enter the Month : \n ");
        int month=sc.nextInt();
        System.out.print("Enter the year:  \n ");
        int year=sc.nextInt();
        switch (month){
            case 1:
              monthname=  "Janvuary";
              noofdays=31;
              return;
            case 2:
                if(year%4==0&&year%100!=0&&year%400==0) {
                    monthname = "feb";
                    noofdays = 29;
                }else {
                    monthname="feb";
                    noofdays=28;
                }
                return;
            case 3:
                monthname="march";
                noofdays=31;
                return;
            case 4:
                monthname="april";
                noofdays=30;
                return;
            case 5:
                monthname="may";
                noofdays=31;
                return;
            case 6:
                monthname="june";
                noofdays=30;
                return;
            case 7:
                monthname="july";
                noofdays=31;
                return;
            case 8:
                monthname="august";
                noofdays=31;
                return;
            case 9:
                monthname="september";
                noofdays=30;
                return;
            case 10:
                monthname="october";
                noofdays=31;
                return;
            case 11:
                monthname="november";
                noofdays=30;
                return;
            case 12:
                monthname="december";
                noofdays=31;





        }
        System.out.print(monthname+ year+"has"+noofdays);

    }
}
