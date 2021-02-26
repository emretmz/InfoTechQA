package infoTechPackage.Day4;

public class A3_StringManupilations {
    public static void main (String []args) {

    String str="Easy Java is Easy 12_34";
    String str1=str.replaceAll("Easy","nananana");
    String str2=str.replaceAll("\\s","*");
    String str3=str.replaceAll("\\S","*");
    String str4=str.replaceAll("\\w","*");//special karakterler haric * yap
    String str5=str.replaceAll("\\W","*");
    String str6=str.replaceAll("\\d","*");
    String str7=str.replaceAll("\\D","*");
    String str8=str.replaceAll(" ","*");//sadece string degistirir
    String str9=str.replace("a","*");//sadece char degistirir

        System.out.println(str9);

}
}
