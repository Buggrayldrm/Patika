import java.util.Scanner;

public class VucutKitleInndex {
    public static void main(String[] args) {
        System.out.println("Vucut Kitle Endex Programına Hoşgeldiniz.");
        Scanner inputKilo =new Scanner(System.in);
        Scanner inputBoy =new Scanner(System.in);
        int kilo;
        double boy;
        System.out.println("kiloyu giriniz:");
        kilo=inputKilo.nextInt();
        System.out.println("Boyunuzu Giriniz:");
        boy=inputBoy.nextDouble();
        int index;
        index= (int) (kilo/(boy*boy));
        System.out.println("Vucut Kitle İndexiniz:"+index);
    }

}



