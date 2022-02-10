package KontrolYapilari;

public class calisma1 {

    public static void main(String[] args) {

        //Tüm döngülerle sayaç yapalım.

        for (int  i = 1; i < 11; i++ ){  //i'nin 1 'den başlamasını istiyoruz

            System.out.println("For Döngüsü - " + i + ". Tur");
        }

        int i = 1;
        while (i < 11){
            System.out.println("While Döngüsü - " +i + ". Tur");
            i++;
        }

        int k = 1;
        do{
            System.out.println(" Do While Döngüsü - " + k + ". Tur");
            k++;
        }while (k < 11);



    }
}
