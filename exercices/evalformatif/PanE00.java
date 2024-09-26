package evalformatif;

public class PanE00 {
    public static final int NOMBRE_PTS_VICTOIRE = 3;
    public static final int MIN = 0;
    public static final int MAX = 9;
    public static void main(String[] args) {
        String nomEquipe1 = "Barcelone";
        String nomEquipe2 = "Madrid";
        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;
        int i = 0;
        int nbr =0;
        for (int nbrDeMatch=0; nbrDeMatch<10; nbrDeMatch++){
            i = MIN + ( int ) ( Math.random() * ( MAX-MIN + 1) );
            nbr = MIN + ( int ) ( Math.random() * ( MAX-MIN + 1) );
            System.out.println(nomEquipe1+" joue contre "+ nomEquipe2+" et le résultat est : "+i+" à "+nbr);
            if (i==nbr){
                System.out.println("Match nul");
                nombrePointEquipe1++;
                nombrePointEquipe2++;
                } else if (i<nbr){
                    System.out.println(nomEquipe2+" à gagné");
                    nombrePointEquipe2++;
                
            } else{
                System.out.println(nomEquipe1+" à gagné");
                nombrePointEquipe1++;
            }   

        }
        

        
    }

    
}
