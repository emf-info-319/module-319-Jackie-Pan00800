public class tblmultiplication {
    public final static int MIN =5;
    public final static int MAX=20;
    public static void main(String[] args) {
        int nombreAleatoire=choisirUnNombre(MIN, MAX);
        System.out.println(nombreAleatoire);
        int nombreAleatoire2=choisirUnNombre(MIN, MAX);
        System.out.println(nombreAleatoire2);
    }
    public static int choisirUnNombre(int min, int max){
        int randomAnswer=(int) ( Math.random() * (min|max));
        return randomAnswer;
    }
}
