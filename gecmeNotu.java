package KontrolYapilari;

import java.util.Scanner;

public class gecmeNotu {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("DÖNEM NOTU ORTALAMA HESAPLAMA");
        System.out.println("Vize Notunuzu Giriniz : ");
        int vize = a.nextInt();
        System.out.println("Final Notunuzu Giriniz : ");
        int finall = a.nextInt();

        double vizeort = vize * 40/100 ;
        double finallort = finall * 60/100;

        double toplamort = (vizeort + finallort);

        System.out.println("Dönem ortalamanız : " + toplamort);

        if (toplamort > 50){
            System.out.println("GEÇTİ");
        }else{
            System.out.println("KALDI !");
        }
    }
}
