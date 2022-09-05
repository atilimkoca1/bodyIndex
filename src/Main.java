import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double boy, kilo,index;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo=scanner.nextDouble();
        index=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndexsiniz : "+index);
    }
}
