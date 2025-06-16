package variabilaMetoda;

import org.testng.annotations.Test;

public class Telefon {
    public String model;
    public String marca;
    public String culoare;
    public double pret;
    public String caracteristici;

    @Test
    public void testMethod(){
        prezentareTelefon("16 Pro Max","Iphone","Negru",7500.23,"Stare foarte buna");
        discountTelefon();
        System.out.println();
        prezentareTelefon("14 Pro Max","Iphone","Gri",5432.12,"Deteriorat");
        discountTelefon();
        System.out.println();
        prezentareTelefon("Galaxy S15","Samsung","Albastru",5122.99,"Stare buna");
        discountTelefon();
    }

    //Metodele pot sau nu sa contina parametrii.
    //Scopul parametrilor este sa defineasca intr-un mod generic o anumita actiune.
    //O metoda poate avea unul sau mai multi parametrii delimitati prin virgula.
    //Un parametru trebuie sa contina tipul de data si numele acestuia.
    //Parametrii se definesc intre ().

    public void prezentareTelefon(String param1, String param2, String param3, double param4, String param5){
        model=param1;
        marca=param2;
        culoare=param3;
        pret=param4;
        caracteristici=param5;

        System.out.println("Modelul "+model);
        System.out.println("Marca "+marca);
        System.out.println("Culoare "+culoare);
        System.out.println("Pret "+pret);
        System.out.println("Caracteristici "+caracteristici);
    }

    //Exemplu Variabila locala

    public void discountTelefon(){
        int discount=10;
        System.out.println("Pretul initial al telefonului este "+pret);
        double pretFinal=pret-(pret*discount)/100;
        System.out.println("Noul pret al telefonului este "+pretFinal);
    }

}






























