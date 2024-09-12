package exercice08;

public class exerciceBoucles2 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){
            System.out.println("i: "+ i);
        }
        int nbr=5;
        do{
            System.out.println("nbr "+nbr);
            nbr--;
        }
        while(nbr>=1);
        int nbr2=5;
        boolean uneCondition=true;
        while (uneCondition=true){
            System.out.println("mbr2 "+nbr2--);
            if (nbr2<1){
                uneCondition=false;
                System.out.println(uneCondition);
                if (uneCondition=false);{
                    break;
                }
            }
        }
    }
    
}
