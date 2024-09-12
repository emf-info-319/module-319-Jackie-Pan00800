package devoir02;

import java.util.Random;

public class devoir02 {
    public static final int CAPACITE_RESERVOIR_A = 3;
    public static final int CAPACITE_RESERVOIR_B = 5;
    
    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        Random random = new Random();
        int remplissage = random.nextInt(CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B + 1);

        System.out.println("Nombre de litres à remplir : " + remplissage);

        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA != CAPACITE_RESERVOIR_A) {
                reservoirA++;
                System.out.println("Réservoir A : " + reservoirA + " litre(s), Réservoir B : " + reservoirB + " litre(s)");
            } else if (reservoirB != CAPACITE_RESERVOIR_B) {
                // Remplir le réservoir B une fois que le réservoir A est plein
                reservoirB++;
                System.out.println("Réservoir A : " + reservoirA + " litre(s), Réservoir B : " + reservoirB + " litre(s)");
            }
        }

        // Affichage final
        System.out.println("Remplissage terminé !");
        System.out.println("Réservoir A : " + reservoirA + " litre(s)");
        System.out.println("Réservoir B : " + reservoirB + " litre(s)");
    }
    
}
