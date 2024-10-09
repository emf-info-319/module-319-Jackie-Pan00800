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
