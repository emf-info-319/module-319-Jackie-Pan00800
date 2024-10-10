package exercice12;

public class ExercicesString {
    public static void main(String[] args) {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";
        System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : "+maChaineDeCaractere.length());
        int pos = maChaineDeCaractere.indexOf("con");
        System.out.println("Le mot contenu commence à la position : "+pos);
        char lettre = maChaineDeCaractere.charAt(10);
        System.out.println("Le position 17 contient la lettre : "+lettre);

        String monPrénom="Jackie";
        for(int i= 0;i<6;i++){
            char lettre2 = monPrénom.charAt(i);
            System.out.println("Le "+i+" est "+lettre2);
        }
    }
    
}
