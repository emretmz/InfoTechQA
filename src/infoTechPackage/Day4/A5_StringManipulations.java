package infoTechPackage.Day4;

import java.util.Scanner;

public class A5_StringManipulations {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Bir kelime girin lutfen");
    String str=s.next();

    String str1="Abfahren meint dass leave oder depart.";
    String str2=str.toUpperCase();
    System.out.println(str2);
    String str3=str.toLowerCase();
    System.out.println(str3);
    String str4=str.trim();
    System.out.println(str4);
    }
}
