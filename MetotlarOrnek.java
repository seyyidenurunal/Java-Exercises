package Metotlar;

import KontrolYapilari.SwitchCaseKullanimi;
import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import java.util.Scanner;

public class MetotlarOrnek {
    public static void main(String[] args) {

        int kullaniciSecimi = -1;
/*
        while (kullaniciSecimi != 0){
            kullaniciSecimi = menu();
        }
*/
        for(;;){
            kullaniciSecimi = menu();
            if(kullaniciSecimi == 0){
                System.out.println("Çıkış Yapılıyor...");
                break;
            }
            Scanner a = new Scanner(System.in);

            System.out.println("Birinci Sayıyı Giriniz...");
            int birinciSayi = a.nextInt();

            System.out.println("İkinci Sayıyı Giriniz...");
            int ikinciSayi = a.nextInt();



            switch (kullaniciSecimi){
                case 1 :
                    toplama(birinciSayi,ikinciSayi);
                    break;
                case 2 :
                    cıkarma(birinciSayi,ikinciSayi);
                    break;
                case 3 :
                    carpma(birinciSayi,ikinciSayi);
                    break;
                case 4 :
                    bölme(birinciSayi,ikinciSayi);
                    break;
            }
        }
    }
    public static int menu(){
        System.out.println("************MENÜ**************");
        System.out.println("1 - Toplama : ");
        System.out.println("2 - Çıkarma : ");
        System.out.println("3 - Çarpma : ");
        System.out.println("4 - Bölme : ");
        System.out.println("Çıkmak için 0 tuşuna basınız.");

        Scanner a = new Scanner(System.in);
        int sec = a.nextInt();
        return sec;

    }
    public static void toplama(int birinciSayi, int ikinciSayi) {
        System.out.println("Toplam = " + (birinciSayi + ikinciSayi));

    }

    public static void cıkarma(int birinciSayi, int ikinciSayi) {
        System.out.println("Fark = " + (birinciSayi - ikinciSayi));
    }

    public static void carpma(int birinciSayi, int ikinciSayi) {
        System.out.println("Çarpım = " + (birinciSayi * ikinciSayi));
    }

    public static void bölme(int birinciSayi, int ikinciSayi) {
        System.out.println("Bölüm = " + (birinciSayi / ikinciSayi));
    }



}
