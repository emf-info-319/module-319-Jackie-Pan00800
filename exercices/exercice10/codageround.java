package exercice10;

public class codageround {
    public final static double PI=3.14;
    public static void main(String[] args) {
        int[] rayons ;
        rayons = new int[10] ;
        int min=1;
        int max=10;
        for(int i=0;i<rayons.length;i++){
            rayons[i]=genereNombre(min, max);
        }
        for(int i=rayons.length-1;i>=0;i--){
            if(rayons[i]>50){
                System.out.println();
            }
        }
    }
    public static int genereNombre(int max, int min){
        int genereNbre = (int) ( Math.random() * (min|max));
        return genereNbr
    }

    
}
