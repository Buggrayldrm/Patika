import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner Distance =new Scanner(System.in);
        Scanner Age= new Scanner(System.in);
        Scanner Type =new Scanner(System.in);
        int distance,age,type,pay;
        //distance=mesafe,age=yaş,type=tip,pay=ücret


        System.out.println("Mesafeyi Giriniz(KM):");
        distance=Distance.nextInt();

        System.out.println("Yaşınızı Giriniz:");
        age=Age.nextInt();

        System.out.println("Yolculuk Tipini Seçiniz:(1:Tek Yön 2:Gidiş-Dönüş");
        type=Type.nextInt();

        pay= (int) (distance*(0.10));
        if (age<12){
            pay= (int) (pay-(pay*0.5));
            
        } else if (age>=12&&age<24) {
            pay= (int) (pay-(pay*0.1));
        } else if (age>65) {
            pay= (int) (pay-(pay*0.3));
        }


        if (type==2){
            pay=(int) (pay-(pay*0.20));
        }
        System.out.println("Yolculuk tutarı:"+pay);


    }
}
