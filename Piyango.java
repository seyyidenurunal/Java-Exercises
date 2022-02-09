package KontrolYapilari;
import sun.awt.image.AbstractMultiResolutionImage;
import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Piyango {
    public static void main(String[] args) {

        System.out.println("JAVA ÇEKİLİŞİNE HOŞ GELDİNİZ...");

         int sansliSayi = (int) (Math.random() * 99 + 1);
        Scanner tara = new Scanner(System.in);
        System.out.println("Lütfen Tahmininizi Giriniz...");
        int tahminEdilenSayi = tara.nextInt();

        if (tahminEdilenSayi == sansliSayi){
            System.out.println("TEBRİKLER 1000 TL KAZANDINIZ !\nŞanslı sayı : " +sansliSayi);

        }else {
                System.out.println("Lütfen Tekrar Deneyiniz...\n Şanslı sayı : " + sansliSayi);

        }


    }

}
