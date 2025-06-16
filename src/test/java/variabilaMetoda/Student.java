
package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    // CLASA
    //Clasa = Sablon specific unei entitati care contine variabile si metode.
    //Intr-un fisier Java recunoastem o clasa dupa cuvantul "class".
    //O clasa trebuie sa aibe un nume.
    //Variabilele/Metodele unei clase se regasesc intre acolade.
    //Intr-un fisier Java putem avea mai multe clase diferentiate prin nume.
    //Nu este un practice bun sa avem mai multe clase intr-un fisier Java.

    // VARIABILA
    //Variabila = proprietatea unei clase
    //Variabilele pot sa fie de 2 feluri: Globale si Locale
    //Variabila Globala = variabila care este prezenta peste tot in fisierul Java.
    //Variabila Globala -> definita ca -> public tipvariabila numevariabila
    //O variabila poate sau nu, sa primeasca o valoare.
    //Variabila Locala = variabila care este prezenta doar in locul in care a fost definita.
    //Variabila Locala -> definita ca -> tipvariabila numevariabila

    //METODE
    //Metoda = actiunea unei clase
    //Metodele pot sa fie de 2 feluri: VOID si RETURN
    //Metoda VOID = metoda care afiseaza rezultatul codului scris.
    //Metoda VOID -> definita ca -> public void numemetoda(){}

    //Variabila GLOBALA

    public String nume;
    public String prenume;
    public int varsta;
    public String adresa;
    public double inaltime;
    public float greutate;
    public char sex;
    public boolean areBursa;

    //Metoda VOID

    @Test
    public void prezentareStudent(){
        nume="Monea";
        prenume="Silvia";
        varsta=26;
        adresa="Str P nr.10 sector 4";
        inaltime=1.225;
        greutate=12.54f;
        sex='F';
        areBursa=true;

        System.out.println("Nume "+nume);
        System.out.println("Prenume "+prenume);
        System.out.println("Varsta "+varsta);
        System.out.println("Adresa "+adresa);
        System.out.println("Inaltime "+inaltime);
        System.out.println("Greutate "+greutate);
        System.out.println("Sex "+sex);
        System.out.println("Bursa "+areBursa);

    }
}
























