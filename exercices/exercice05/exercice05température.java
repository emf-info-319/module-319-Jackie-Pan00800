package exercices.exercice05;

public class exercice05température {
    public static void main(String[] args) {
        int température =4;
        if (température<0);{
            if (température < -10){
                System.out.println("il fait très froid");
            }else{
                System.out.println("il fait froid");
            }
        
        }
        if (température>0);{
            if (température<25){
                System.out.println("il fait normal");
                if (température>25){
                    if (température>35){
                        System.out.println("il fait très chaud");
                    }else{
                        System.out.println("il fait chaud");
                    }
                }

            }
        }
        }
    
}
