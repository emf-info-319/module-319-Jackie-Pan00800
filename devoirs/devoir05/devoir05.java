package devoir05;

public class devoir05 {
    public static final int MAX=100;
    public static final int MIN=1;
    public static void main(String[] args) {
        int nbre1 = (int)( Math.random() * ( MAX - MIN + 1 )) + MIN;
        int nbre2 = (int)( Math.random() * ( MAX - MIN + 1 )) + MIN;
        System.out.println(nbre2);
        if(nbre1==nbre2){
            System.out.println("Bravo tu as réussi");

            }else if(nbre1>nbre2){
                System.out.println("Trop petit");
            }else{
                System.out.println("Trop grand");
            }
    }
    
}

Corrigé devoir05
import java.util.Scanner;
 
public class devoir05 {
    public static final int MAX=100;
    public static final int MIN=1;
    public static void main(String[] args) {
        int nbre = (int)( Math.random() * ( MAX - MIN + 1 )) + MIN;
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Entrez une valeur entre 1 et 100 : " );
        int guess = scanner.nextInt();
        while (guess!=nbre) {
            if (guess<1||guess>100) {
                System.out.print( "Veuillez entrez un nombre valide : " );
                guess = scanner.nextInt();
                continue;
            }
            if (guess>nbre) {
                System.out.println("Trop grand");
                guess = scanner.nextInt();
            } else if (guess<nbre) {
                System.out.println("Trop petit");
                guess = scanner.nextInt();
            }
        }
        System.out.println("Bravo, trouvé");
        scanner.close();
    }
}
 
