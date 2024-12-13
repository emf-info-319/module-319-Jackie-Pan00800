package E1Pan;

import java.util.Scanner;

public class E1_ShutTheBox_PanJackie {
    Scanner SCANNER = new Scanner(System.in);
    public static final int DES_MIN=1;
    public static final int DES_MAX=6;
    public static final int NOMBRE_TUILES=12;
    public static void main(String[] args) {
        int[] tuiles=new int[NOMBRE_TUILES];
        boolean enJeu=true;
        System.out.println("**********************************");
        System.out.println("*         'Shut The Box'         *");
        System.out.println("**********************************");
        for (int i = 0; i < tuiles.length; i++) {
            tuiles[i]=i+1;
            System.out.println(tuiles[i]);
        }
    }
    
}
