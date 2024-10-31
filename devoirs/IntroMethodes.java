import java.util.Scanner;
public class IntroMethodes {
    public static void main(String[] args) {
        System.out.println("Bonjour et bienvenu sur ce premier programme.");
        System.out.println("On va voir les méthodes dans ce cours");
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Entrez un nombre:" );
        int guess = scanner.nextInt();
        System.out.println("Merci j'enregistre : "+guess);
        System.out.print( "Entrez un nombre:" );
        int guess2 = scanner.nextInt();
        System.out.println("Merci j'enregistre : "+guess2);
        System.out.print( "Entrez un nombre:" );
        int guess3 = scanner.nextInt();
        System.out.println("Merci j'enregistre : "+guess3);
        scanner.close ();
        int answer= guess+guess2+guess3;
        System.out.println("La somme est "+answer);
        System.out.println("Programme terminé");
    }
    
}
