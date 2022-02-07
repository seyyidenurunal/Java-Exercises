package DegiskenKavrami;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class VeriTipleriCalısma {
    public static void main(String[] args) {

        //Strig ifadeleri integer ifadeye dönüştürme.

        String strSayi = "500";
        int intSayi = Integer.parseInt(strSayi);
        int intSayi2 = Integer.valueOf(strSayi);

        System.out.println("str sayı : " + intSayi);
        System.out.println("str sayı 2  : " + intSayi2);

        //İnteger ifadeleri string ifadeye dönüştürme.

        int number = 500;
        String strNumber = String.valueOf(number);

        System.out.println("String sayı : " + strNumber);

        // çalışma ; int, float ve double bölüm

        int sayi = 5 / 3;
        float sayi1 = 5f / 3f; //Sayıların float olarak algılanabilmesi için yanlarına s harfi yazıyoruz.
        double sayi2 = 5d / 3d;

        System.out.println("sayı : " + sayi);
        System.out.println("sayı 1 : " + sayi1); // Float virgülden sonra 7 karaktere kadar saklar.
        System.out.println("sayı 2 : " + sayi2);

        // ondalıklı işlemler

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); //0.5 görmeyi bekliyoruz ancak double olarak algılandığı için daha farklı bir sonuçla karşılaşıyoruz.
        System.out.println(1.0 - 0.9); // 0.1 görmeyi planlıyoruz.

        // ortalama alma:

        int not = 1;
        int not1 = 2;

        double ortalama = (not + not1) / 2;
        System.out.println("Ortalama 1 ; " +  ortalama);

        double ortalama1 = (not + not1) / 2.0; // ifadeyi double olarak gösterdik, daha doğru bir sonuca ulaşabilmek için.
        System.out.println("Ortalama 2 ; " +  ortalama1);


    }
}
