import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kilo,boy,BMI;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();

        BMI = (kilo / (boy * boy));

        System.out.println("Vücut kitle İndeksiniz: " +BMI);

        //@author Diyar Akdemir


    }
}