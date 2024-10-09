package devoir04;

public class devoir04 {
    public static void main(String[] args) {
        int year=2024;
        int day=9;
        int month=10;
        System.out.println("Date entré le "+day+"."+month+"."+year);
        switch (month){
            case 1:
            if(day>31){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" january "+year);
            break;
            case 2:
            if(day>29){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" february "+year);
            break;
            case 3:
            if(day>31){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" march "+year);
            break;            
            case 4:
            if(day>30){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" april "+year);
            break;            
            case 5:
            if(day>31){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" may "+year);
            break;            
            case 6:
            if(day>30){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" juny "+year);
            break;            
            case 7:
            if(day>31){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" july "+year);
            break;            
            case 8:
            if(day>31){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" august "+year);
            break;            
            case 9:
            if(day>30){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" septembre "+year);
            break;            
            case 10:
            if(day>31){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" octobre "+year);
            break;            
            case 11:
            if(day>3){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" novembre "+year);
            break;            
            case 12:
            if(day>31){
                System.out.println("Jour incorrect");
            }
            System.out.println("La date formaté est le "+day+" december "+year);
            break;
        }

    }
    
}
