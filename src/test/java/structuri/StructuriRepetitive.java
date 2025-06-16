package structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri Repetitive = for, while, foreach

    @Test

    public void testMethod(){
        //afisareNumere();
        //afisareNumereWhile();
        //afisareNumerePare();
        //afisareNumerePareV2();
        //afisareNumereDiv();
        //afisarePrimeleCinci();
        suma();
    }

    //Afisam primele 100 de numere incepand de la 0

    public void afisareNumere(){
        for (int index=0;index<100;index++){
            System.out.println("Valoarea curenta este "+index);
        }
    }

    public void afisareNumereWhile(){
        int index=0;
        while (index<100){
            System.out.println("Valoarea curenta este "+index);
            index++;
        }
    }

    //Afisam numerele pare de la 0 la 50

    public void afisareNumerePare(){
        for (int index=0; index<50; index++){
                System.out.println("Numarul par este: "+index);
        }
    }

    public void afisareNumerePareV2(){
        for (int index =0;index < 50;index++){
            if(index%2==0){
                System.out.println("Numarul par este: "+index);
            }
        }
    }

    //Afisam numerele divizibile cu 3 de la 0 la 50

    public void afisareNumereDiv(){
        int index=0;
        while (index<50){
            if (index%3==0){
                System.out.println("Numarul divizibil cu 3 este:  "+index);
            }
            index++;
        }
    }

    //Afisam primele 5 numere divizibile cu 5 de la 0 la 50

    public void afisarePrimeleCinci(){
        int counter=0;
        for (int index=0; index<50; index++){
           if (index%5==0){
               System.out.println("Numarul divizibil cu 5 este:  "+index);
               counter++;
               }
            if (counter==5){
                break;
           }
        }
    }

    //Calculam suma cifrelor pana la 10

    public void suma(){
        int suma=0;
        for (int index=0; index<10; index++){
            suma=suma+index;
            //suma+=index;
        }
        System.out.println("Suma este: "+suma);
    }

}






















