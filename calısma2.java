package Operatorler;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class calısma2 {

    public static void main(String[] args) {

        int yil = 4550;
        boolean artikyil = (yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0);
        System.out.println(yil + "  Artık yıl mı : " + artikyil);

    }
}
