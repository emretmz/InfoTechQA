package infoTechPackage.Day4;

public class A4_StringManipulations {
    public static void main(String[] args) {
     String str="Banana@gmail.com";
     int i1=str.indexOf("@");
     System.out.println(i1);
     int i2=str.indexOf(".");
     System.out.println(i2);
     String str2=str.substring(6);//ilk numaradan sonra kalani yazdirir
     String str3=str.substring(7,12);//ilk numara dahil,ikinci numara haric string'i yazdir
     System.out.println(str3);


    }
}