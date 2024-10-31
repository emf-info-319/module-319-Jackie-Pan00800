package exercice10;

public class Methodes {
    public static void main(String[] args) {
        direBonjour();
        dire();
        math();
    }
    public static void direBonjour(){
        System.out.println("Bonjour");
    }
    public static String dire(){
        String direString = "Bonjour";
        System.out.println(direString);
        return direString;
    }
    public static void math(){
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.min(4,3));
        System.out.println(Math.max(4,5));
        System.out.println(Math.abs(-4));
        
    }
}
