package KontrolYapilari;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

    public static void main(String[] args) {

            double kilo = 0;
            int boy = 0;
        Scanner tara = new Scanner(System.in);

        System.out.println("Vücut Kitle İndeksi Hesaplama Programına Hoşgeldiniz...");

        System.out.println("Lütfen boyunuzu cm cinsinden giriniz.");
        boy = tara.nextInt();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz. ");
        kilo = tara.nextDouble();

        double vucutKitleIndeksi = 0;
        double cmToMetre = (double)boy / 100.0;
        double boyunKaresi = Math.pow(cmToMetre,2);

        vucutKitleIndeksi = kilo / boyunKaresi;
        System.out.println("Vücut Kitle İndeksiniz = " + vucutKitleIndeksi);

            if (vucutKitleIndeksi < 18.5){
                System.out.println("Zayıf");
            }else if (vucutKitleIndeksi < 25 && vucutKitleIndeksi > 18.5){
                System.out.println("Normal");
            }else if (vucutKitleIndeksi < 30 && vucutKitleIndeksi > 25){
                System.out.println("Kilolu");
            }else if (vucutKitleIndeksi < 35 && vucutKitleIndeksi > 30 ){
                System.out.println("Obez");
            }else{
                System.out.println("2.derece obez");
            }
    }
}
