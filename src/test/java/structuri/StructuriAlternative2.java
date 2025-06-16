package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative2 {

    @Test

    public void testMethod(){
     zileSaptamana(4);
     zileSaptamana(9);
     cosFructe("para");
     cosFructe("capsuna");
    }

    //Afisam o zi a saptamanii in functie de cifra introdusa.

    public void zileSaptamana(int zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este Vineri");
                break;
            case 6:
                System.out.println("Astazi este Sambata");
                break;
            case 7:
                System.out.println("Astazi este Duminica");
                break;
            default:
                System.out.println("Nu exista aceasta zi din saptamana");
        }
    }

    //Afisam un fruct specific dintr-un cos cu fructe.

    public void cosFructe(String fruct){
        switch (fruct){
            case "mar":
                System.out.println("In cosul cu fructe este un mar");
                break;
            case "para":
                System.out.println("In cosul cu fructe este o para");
                break;
            case "portocala":
                System.out.println("In cosul cu fructe este o portocala");
                break;
            default:
                System.out.println("Nu este fructul acesta in cos");
        }
    }
}




















