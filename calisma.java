package KontrolYapilari;

import java.awt.datatransfer.FlavorTable;
import java.util.Scanner;

public class calisma {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("1. SAYIYI GİRİNİZ.");
        int sayi1  = a.nextInt();
        System.out.println("2. SAYIYI GİRİNİZ.");
        int sayi2 = a.nextInt();
        System.out.println("3. SAYIYI GİRİNİZ.");
        int sayi3 = a.nextInt();

        double ortalama = (sayi1 + sayi2 + sayi3) / 3;

        System.out.println("GİRDİĞİNİZ SAYILARIN ORTALAMASI : " + ortalama);
    }
}
