package devoir02;

public class devoir02 {
    public static void main(String[] args) {
        int CAPACITE_RESERVOIR_A = 3;
        int CAPACITE_RESERVOIR_B = 5;
        int réservoirA = 0;
        int réservoirB = 0;
        int max=3; int min=0;
        int remplissage = 0;
        remplissage = min +(int)(Math.random()*((max|min)));
        do{
            System.out.println("remplissage du réservoirA");
            System.out.println("Le réservoirA: "+ (réservoirA+remplissage) + ", le réservoirB: "+ réservoirB);
        }
        while(réservoirA>=CAPACITE_RESERVOIR_A);
        
    }
    
}
