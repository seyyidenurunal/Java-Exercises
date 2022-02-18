package OOPCalısma;

public class OOPCalısma1 {
    public static void main(String[] args) {

        CemberDaire cember1 = new CemberDaire(5);
        System.out.printf("Yarıçapı 5 olan çemberin çevresi ; %.2f \n", cember1.cevreBul()); //Doğru sonuca ulaşaşilmek için format metodu kullanıyoruz.
        CemberDaire daire1 = new CemberDaire(5);
        System.out.printf("Yarıçapı 5 olan dairenin alanı ; %.2f",  daire1.alanBul());


    }
}

    class CemberDaire{
        private int yariCap;
        public final static double PI = 3.14; // Final değerler son değrlerdir.


        public CemberDaire(int r){
            this.yariCap = r;
        }

        public double cevreBul(){
            return 2 * PI * yariCap;
        }

        public double alanBul(){
            return PI * Math.pow(yariCap,2);
        }
    }

