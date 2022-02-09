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
        
        int sansliSayiBirinciBasamak = sansliSayi/10;
        int sansliSayiIkinciBasamak = sansliSayi %10;

        int tahminEdilenSayiBirinciBasamak = tahminEdilenSayi/10;
        int tahminEdilenSayiIkinciBasamak = tahminEdilenSayi %10;

        if (tahminEdilenSayi == sansliSayi){
            System.out.println("TEBRİKLER 10000 TL KAZANDINIZ !\nŞanslı sayı : " +sansliSayi);

        }else if (sansliSayiBirinciBasamak == tahminEdilenSayiIkinciBasamak && sansliSayiIkinciBasamak == tahminEdilenSayiBirinciBasamak) {
            System.out.println("TEBRİKLER! 5000 TL KAZANDINIZ.\n Şanslı Sayı : " + sansliSayi);

        }else if(sansliSayiBirinciBasamak == tahminEdilenSayiBirinciBasamak || sansliSayiIkinciBasamak == tahminEdilenSayiIkinciBasamak || sansliSayiBirinciBasamak == tahminEdilenSayiIkinciBasamak || sansliSayiIkinciBasamak == tahminEdilenSayiBirinciBasamak) {
            System.out.println("TEBRİKLER! 2500 TL KAZANDINIZ.\n Şanslı Sayı : " + sansliSayi);
        }else {
                System.out.println("Lütfen Tekrar Deneyiniz...\n Şanslı sayı : " + sansliSayi);

        }


    }

}
