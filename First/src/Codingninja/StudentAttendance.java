package Codingninja;
import java.util.Scanner;
public class StudentAttendance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("No of classes held : ");
        float classes= sc.nextInt();
        System.out.print("No Of classes atended : ");
        float attended= sc.nextInt();
        float percent;
        percent=((attended/classes)*100);
        if(percent<75){

        //    System.out.print("You are not allowed in Exam");
            //boolean Y = true;
            //String medicalcause;
            System.out.print("do you have any medical cause : ");
            //medicalcause=sc.next();
           // Y= sc.nextBoolean(Y);
           // boolean Yes=sc.nextBoolean();
           // boolean Y=true;
            char Yes ;
            char Y ;
            //String Y;
            //String hell=sc.next();
            Yes=sc.next().charAt(0);

            if(Yes=='Y'){
                System.out.print("You attneded  "+ percent + " classes\n");
                System.out.println("You are allowed in exam due to medical purpose");
            }else if(Yes=='N'){
                System.out.println("You are not allowed");
            }
        }else {
            System.out.print("You attende " + percent + " classes\n");
            System.out.println("You are alllowed in exam");
        }
    }
}
