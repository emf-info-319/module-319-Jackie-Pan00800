package devoir01;

public class devoir01 {
    public static void main(String[] args) {
        int monAge=15;
        boolean estMajeur;
        if (monAge>=20){
            estMajeur = true;
        }else{
            estMajeur = false;
        }
        if (estMajeur == true){
            System.out.println("Je suis majeur");
        }else{
            System.out.println("Je suis mineur");
        }
    }
}