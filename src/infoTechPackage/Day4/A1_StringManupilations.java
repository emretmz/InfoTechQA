package infoTechPackage.Day4;

public class A1_StringManupilations {
    public static void main (String []args)
    {
       String str="Banana,apple";
       int indx1=str.indexOf(" ");
       int indx2=str.indexOf("B");
       int indx3=str.indexOf(",");
       int indx4=str.indexOf("a");
       int indx5=str.indexOf("e");
       int indx6=str.indexOf("L");
       int indx7=str.indexOf("a",7);

       System.out.println(indx7);

    }
}
