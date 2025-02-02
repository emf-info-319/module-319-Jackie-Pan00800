public class Pan {
    public static final int NOTE_MIN = 1;
    public static final int NOTE_MAX = 6;
    public static final int NBRE_NOTES = 5;
    public static void main(String[] args){
        int[] notesObtenues = new int[NBRE_NOTES];
        float totalNote=0;
        float moyenne=0;
        for (int i = 0; i < notesObtenues.length; i++){
            notesObtenues[i] = NOTE_MIN + ( int ) ( Math.random() * ( NOTE_MAX-NOTE_MIN + 1) );
            System.out.println("La note obtenu est "+notesObtenues[i]);
            switch (notesObtenues[i]){
                case 4:
                System.out.println("suffisant");
                break;
                case 5:
                System.out.println("bien");
                break;
                case 6:
                System.out.println("très bien");
                break;
                default:
                System.out.println("insuffisant");
                break;
            }
            totalNote=totalNote+notesObtenues[i]
        }
        moyenne=totalNote/NBRE_NOTES;
        System.out.println(moyenne);
        if (moyenne>3.9){
            System.out.println("l'élève est promu!");
        }else{
            System.out.println("L'élève est non promu.");
        }

    }
    
}
