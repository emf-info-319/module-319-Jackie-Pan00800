package devoir02;

import java.util.Random;

public class devoir02 {
    public static final int CAPACITE_RESERVOIR_A = 3;
    public static final int CAPACITE_RESERVOIR_B = 5;
    
    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        Random remplissage;
        remplissage = (int) ( Math.random() * (CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B - 0 + 1))+0;

        System.out.println("il y a "+remplissage+" litres à remplir.");

        while (remplissage!=0) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                reservoirA++;
                System.out.println("remplissage du réservoir A...");
            } else {
                reservoirB++;
                System.out.println("remplissage du réservoir B...");
            }
        remplissage--;
        System.out.println("le réservor A: "+ reservoirA + ", le réservoir B: "+ reservoirB);
    }
    System.out.println("remplissage terminé!");
    }
}
