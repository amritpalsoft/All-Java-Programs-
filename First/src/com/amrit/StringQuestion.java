package com.amrit;
import java.util.Scanner;
public class StringQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String name2=name.toLowerCase();
        System.out.println(name2);
        String rep=name.replace('m','p');
        System.out.println(rep);
        String letter="Dear <name>, tahnks a lot.";
        String changeletter=letter.replaceAll("<name>","amrit");
        System.out.println(changeletter);
    }
}
