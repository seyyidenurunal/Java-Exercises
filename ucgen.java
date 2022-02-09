package KontrolYapilari;

import java.util.Scanner;

public class ucgen {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Üçegenin kenar uzunluklarını giriniz...");

        System.out.println("1. KENAR : ");
        int x = a.nextInt();
        System.out.println("2.KENAR : ");
        int y = a.nextInt();
        System.out.println("3. KENAR : ");
        int z = a.nextInt();


        if (x == y && y == z) {
            System.out.println("Eşkenar Üçgen");
        } else if (x == y || y == z || x == z) {
            System.out.println("İkizkenar üçgen");
        } else {
            System.out.println("Çeşitkenar üçgen");


        }
    }
}