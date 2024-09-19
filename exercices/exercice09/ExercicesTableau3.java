package exercice09;

public class ExercicesTableau3 {
    public static final int MIN=1;
    public static final int MAX=6;
    public static void main(String[] args) {
        int moyenne = 0;
        int j=0;
        int[] tableauRandom =  new int [11];
        for (int i = 1; i < tableauRandom.length; i++){
            tableauRandom[i] = MIN + ( int ) ( Math.random() * ( MAX-MIN + 1) );
            System.out.println("Cellule "+ i +"; "+ tableauRandom[i]);
            moyenne=moyenne + tableauRandom[j];
            j++;
        }
        moyenne=moyenne/10;
        System.out.println(moyenne);
    }
    
    
}
