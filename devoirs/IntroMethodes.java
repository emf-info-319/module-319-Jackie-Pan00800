import java.util.Scanner;
public class IntroMethodes {
    public static void main(String[] args) {
        debut();
        int result1= demandenombre();
        int result2= demandenombre();
        int result3= demandenombre();
        int somme = somme(result1, result2, result3);
        fin();
    }
    public static void debut(){
        System.out.println("Bonjour et bienvenu sur ce premier programme.");
        System.out.println("On va voir les méthodes dans ce cours");
    }
    public static int demandenombre(){
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Entrez un nombre: ");
        int chiffre1 = scanner.nextInt();
        System.out.println("Merci j'enregistre : "+ chiffre1 );
        return chiffre1;
    }
    public static void fin(){
        System.out.println("Programme terminé");
    }
    public static int somme(int chiffre1, int chiffre2, int chiffre3){
        int result= chiffre1+chiffre2+chiffre3;
        System.out.println("La somme est "+result);
        return result;

    }
}
