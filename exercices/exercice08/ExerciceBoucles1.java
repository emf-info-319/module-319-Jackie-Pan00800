package exercice08;

public class ExerciceBoucles1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println("i: "+ i);
        }
        int nbr=1;
        do{
            System.out.println(nbr);
            nbr++;
        }
        while(nbr<=5);
        int nbr2=1;
        boolean uneCondition=true;
        while (uneCondition=true){
            System.out.println(nbr2++);
            if (nbr2>5){
                uneCondition=false;
                System.out.println(uneCondition);
                if (uneCondition=false);{
                    break;
                }
            }
        }
    }

    
}
