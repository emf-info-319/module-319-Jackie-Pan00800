package exercice04;

public class EchangeValeurs {
    public static void main(String[] args) {
        int variable1 = 1;
        int variable2 = 2;
        int variable3 = 0;
        System.out.println("Le contenu de la variable1 est de " + variable1);
        System.out.println("Le contenu de la variable1 est de " + variable2);
        System.out.println("...Traitement...");
        variable3 = variable1;
        variable1 = variable2;
        variable2 = variable3;
        System.out.println("Le contenu de la variable1 est de " + variable1);
        System.out.println("Le contenu de la variable1 est de " + variable2);
        


    
}
}