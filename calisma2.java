package KontrolYapilari;

public class calisma2 {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            System.out.print(i); // Yan yana yazabilmek için print kullandık.
            if ( i != 10){
                System.out.print(","); //10 sayısından sonra virgül koymak istemediğimiz için.
            }
        }
    }
}
