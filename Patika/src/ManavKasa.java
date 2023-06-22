import java.security.KeyStore;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        System.out.println("Hangi ürünü almak istersiniz:\n" +
                "1.Domates Kilo:5\n" +
                "2.Salatalık Kİlo:10\n" +
                "3.Biber Kilo:15\n" +
                "4.Patlıcan Kilo:20\n" +
                "5.Elma Kilo:25\n" +
                "6.Çıkmak için 6 ya basınız.\n");
        int secenek;
        double Kilo;
        double toplam = 0;
        while (true) {
            System.out.println("Seçiniz:");
            Scanner input =new Scanner(System.in);
            Scanner kilo=new Scanner(System.in);

            secenek=input.nextInt();

            if (secenek == 1) {
                System.out.println("Domatesten kaç kilo almak istersiniz:");
                Kilo=kilo.nextDouble();
                toplam=toplam+(Kilo*5);
            }if (secenek == 2) {
                System.out.println("Salatalıktan kaç kilo almak istersiniz:");
                Kilo=kilo.nextDouble();
                toplam=toplam+(Kilo*10);
            }if (secenek == 3) {
                System.out.println("Biber kaç kilo almak istersiniz:");
                Kilo=kilo.nextDouble();
                toplam=toplam+(Kilo*15);
            }if (secenek == 4) {
                System.out.println("Patlıcan kaç kilo almak istersiniz:");
                Kilo=kilo.nextDouble();
                toplam=toplam+(Kilo*20);
            }if (secenek == 5) {
                System.out.println("Elma kaç kilo almak istersiniz:");
                Kilo=kilo.nextDouble();
                toplam=toplam+(Kilo*25);
            }if (secenek == 6) {

                System.out.println("Ürünlerin Toplam Fiyatı:"+toplam);
                System.out.println("İyi Günler.");
                break;
            }

        }
    }
}
