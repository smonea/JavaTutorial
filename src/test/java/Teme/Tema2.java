package Teme;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Tema2 {
public int numardeclarat;
    @Test


    public void testMethod(){

        helloWorld("Hello World","Buna",26,"Monea","Silvia",'M','H');
        adaugaZdupaVocale("Ana are mere,pere,prune");
        cerinta8T1("Marius");
        cerinta8T1("Andrei");
        cerinta8T1("Ana");
        cerinta9T1("Popescu");
        cerinta9T1("Marius");
        cerinta9T1("George");

        cerinta10T1(286, 287, 288, 350);
        cerinta10T1(123, 111, 122, 176);

        bonus();

        cerinta1T2();

        cerinta2T2();

        cerinta3T2(15, 20);

        cerinta4T2(4.5, 3.25);

        cerinta5T2();
        System.out.println();

        cerinta6T2();
        System.out.println();

        cerinta7T2(74);
        System.out.println();

        cerinta8T2();

        cerinta9T2();

        cerinta10T2();

    }

    //Tema 1

//    Hello World
//    Varsta ta (numar)
//    Numele si prenumele pe 2 randuri
//    Adauga la "Salut" caracterul "M" la final
//    Adauga la "Hello" caracterul "H" la inceput


    public void helloWorld(String hello,String salut,int varsta, String nume, String prenume, char param1,char param2){

        System.out.println(hello+" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println();
        System.out.println(salut+" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println();
        System.out.println("Varsta mea este "+varsta+" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println();
        System.out.println("Nume: "+nume+" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println();
        System.out.println("Prenume: "+prenume+" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println();
        System.out.println(salut+param1+" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println();
        System.out.println(param2+hello+" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println();

    }

    //Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"

    public void adaugaZdupaVocale(String propozitie) {
        String[] cuvinte = propozitie.split("[ ,]+"); // separare după spațiu sau virgulă
        String rezultat = "";
        int pozitieCuvantInText = 0;

        for (int i = 0; i < cuvinte.length; i++) {
            String cuvant = cuvinte[i];
            //Returneaza lungimea cuvatului (nr de caractere)
            //Indexarea incepe de la 0 -> deci indexului ultimei litere din Ana este 3-1=2
            char ultimaLitera = cuvant.charAt(cuvant.length() - 1);

            // verifică dacă ultima literă este vocală
            char literaMic = Character.toLowerCase(ultimaLitera);
            boolean esteVocala = false;
            if (literaMic == 'a') {
                esteVocala = true;
            } else if (literaMic == 'e') {
                esteVocala = true;
            } else if (literaMic == 'i') {
                esteVocala = true;
            } else if (literaMic == 'o') {
                esteVocala = true;
            } else if (literaMic == 'u') {
                esteVocala = true;
            }

            if (esteVocala) {
                cuvant += "Z";
            }

            rezultat += cuvant;

            // găsește separatorul după cuvânt
            // cautăm în text de la ultima poziție găsită
            pozitieCuvantInText = propozitie.indexOf(cuvinte[i], pozitieCuvantInText);
            int dupaIndex = pozitieCuvantInText + cuvinte[i].length();

            if (i < cuvinte.length - 1) {
                if (dupaIndex < propozitie.length()) {
                    char sep = propozitie.charAt(dupaIndex);
                    if (sep == ',' || sep == ' ') {
                        rezultat += sep;
                    } else {
                        rezultat += ' '; // fallback separator
                    }
                } else {
                    rezultat += ' '; // fallback separator la final
                }
            }

            // mutăm indexul mai departe pentru căutarea următorului cuvânt
            pozitieCuvantInText = dupaIndex;
        }

        System.out.println(rezultat+" Poti pleca acasa dupa ce iti verific munca!");
        System.out.println();
    }

    //Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;

//    import java.util.HashMap;
//
//    public class Firma {
//        HashMap<String, Integer> salarii = new HashMap<>();
//
//        public Firma() {
//            // atribuim salarii unor angajați
//            salarii.put("Andrei", 5000);
//            salarii.put("Maria", 4800);
//            salarii.put("Ion", 4500);
//        }
//
//        public void cerinta8(String angajat) {
//            if (angajat.equals("Andrei")) {
//                if (salarii.containsKey(angajat)) {
//                    int salariu = salarii.get(angajat);
//                    System.out.println("Salariul angajatului " + angajat + " este " + salariu + " RON.");
//                } else {
//                    System.out.println("Nu exista salariu inregistrat pentru " + angajat + ".");
//                }
//            } else {
//                System.out.println("Nu putem afisa salariul pentru acest nume.");
//            }
//        }
//    }

    public void cerinta8T1(String angajat) {
        switch (angajat) {
            case "Andrei":
                int salariuAndrei = 5000;
                System.out.println("Salariul angajatului Andrei este " + salariuAndrei + " RON.");
                break;

            case "Vlad":
            case "Costel":
            case "Marius":
                System.out.println("Nu putem afisa salariul pentru acest nume.");
                break;

            default:
                System.out.println("Angajatul nu exista in baza de date.");
                break;
        }
        System.out.println();
    }

    //Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"

    public void cerinta9T1(String angajat1) {
        switch (angajat1) {
            case "Popescu":
                int idAngajat = 234;
                int departament=126;
                System.out.println("ID-ul angajatului este "+idAngajat+", iar departamentul este "+departament);
                break;
            case "Andrei":
            case "Marius":
            case "Vlad":
                System.out.println("Nu putem afisa ID-ul si departamentul angajatului.");
                break;

            default:
                System.out.println("Angajatul nu exista in baza de date.");
                break;
        }
        System.out.println();
    }

    //Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;

    public void cerinta10T1(int param1, int param2, int param3, int param4) {
        boolean gasit=false;
        if (param1 > 287) {
            System.out.println("Numarul departamentului este " + param1);
            gasit=true;
        } else {
        }
        if (param2 > 287) {
            System.out.println("Numarul departamentului este " + param2);
            gasit=true;
        } else {
        }
        if (param3 > 287) {
            System.out.println("Numarul departamentului este " + param3);
            gasit=true;
        } else {
        }
        if (param4 > 287) {
            System.out.println("Numarul departamentului este " + param4);
            gasit=true;
        } else {
        }
        if (!gasit){
            System.out.println("Nu este nici un departament cu numarul mai mare ca 287.");
        }
        System.out.println();
    }

    //Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3

    public void bonus(){
        double rezultat=(2+(3*4)-3)/3.0; // Se foloseste 3.0 la sfarsit pentru a face impartirea in double si sa pastreze zecimalele.
        System.out.println("Rezultatul corect este: "+rezultat);
        System.out.println();
    }

    //Tema 2

    //Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;

    public void cerinta1T2() {
        int counter = 0;

        for (int index = 0; index < 50; index++) {
            if (index % 2 == 0) { // putem folosi orice condiție, doar ca să controlăm câte intrări avem
                System.out.print("DA ");
                counter++;
            }

            if (counter == 5) {
                break;
            }
        }
        System.out.println(); // doar ca să facem o linie nouă după

        //Alternativa
//        for (int i = 0; i < 5; i++) {
//            System.out.print("DA ");
//        }
//        System.out.println();
    }

    //Afisam in consola primele 3 numere de la 1 la 3;

    public void cerinta2T2(){
        int counter=0;
        for(int index=1; index<=3; index++){
            if(counter<3){
                System.out.println("Numarul este "+index);
            }
            if (counter==3){
                break;
            }
        }System.out.println();

    }

    //Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void cerinta3T2(int nr1, int nr2){
        if (nr1>nr2){
            System.out.println("Numarul "+nr1+ " este mai mare decat "+nr2);
        }else if (nr2>nr1){
            System.out.println("Numarul "+nr2+ " este mai mare decat "+nr1);
        }
        System.out.println();
    }

    //Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void cerinta4T2(double nr1, double nr2){
        if (nr1>nr2){
            System.out.println("Numarul "+nr2+ " este cel mai mic nr dintre "+nr1+" si "+nr2);
        }else if (nr2>nr1){
            System.out.println("Numarul "+nr1+ " este cel mai mic nr dintre "+nr1+" si "+nr2);
        }
        System.out.println();
    }

    //Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");

//    public void cerinta5T2(){
//        for (int index=0;index<10;index++){
//            if (index%2==0){
//                System.out.println("Numerele pare sunt "+index);
//            }
//            if (index%2==1){
//                System.out.println("Numerele impare sunt "+index);
//            }
//        }
//    }

    public void cerinta5T2() {
        System.out.print("Numerele pare sunt: ");
        for (int index = 0; index < 10; index++) {
            if (index % 2 == 0) {
                System.out.print(index + " ");
            }
        }

        System.out.println();

        System.out.print("Numerele impare sunt: ");
        for (int index = 0; index < 10; index++) {
            if (index % 2 == 1) {
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }

    //Afisam in consola doar numerele pare pana la 10 (utilizam "for");

    public void cerinta6T2(){
        System.out.print("Numerele pare sunt: ");
        for (int index = 0; index < 10; index++) {
            if (index % 2 == 0) {
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }

    //Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void cerinta7T2(int param1){
        System.out.print("Numerele divizibile cu 5 sunt: ");
        numardeclarat=param1;
        for (int index=0;index<numardeclarat;index++){
            if(index%5==0){
                System.out.print(index+" ");
            }
        }
        System.out.println();
    }

    //Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;

    public void cerinta8T2(){
        int counter=0;
        for (int index = 0; index < 100; index++){
            if (index%5==0) {
                System.out.println("Numarul " + index + " este divizibil cu 5");
                counter++;
            }
            if (counter==3){
                break;
            }
        }
        System.out.println();
    }

    //Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;

    public void cerinta9T2(){
        int rezultat=(235+10);
        System.out.println("Suma numerele lor 235 si 10 este "+rezultat);
        System.out.println();
    }

    //Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;

    public void cerinta10T2(){
        int suma=0;
        for (int index=0; index<10; index++){
            suma+=index;
        }
        System.out.println("Suma este: "+suma);
        System.out.println();
    }

    //Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;

    public void cerinta11T2(){
        for (int index=1;index<=5;index++){
            int rezultat=index*index++;
            System.out.println("Rezultatul este "+rezultat);
        }
    }





}































