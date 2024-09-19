package exercice09;

public class ExercicesTableau2 {
    public static final int MIN=1;
    public static final int MAX=6;
    public static void main(String[] args) {
        int[] tableauRandom =  new int [11];
        for (int i = 1; i < tableauRandom.length; i++){
            tableauRandom[i] = MIN + ( int ) ( Math.random() * ( MAX-MIN + 1) );
            System.out.println("Cellule "+ i +"; "+ tableauRandom[i]);
        }
    }
    
}
