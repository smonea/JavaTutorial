package exceptions;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {
    //Sunt 2 tipuri de exceptii: checked, unchecked.

    @Test

    public void testMethod() throws FileNotFoundException {
//        printFileContent();
//        printStudents();
//        regula();
        printFileContentV2();
    }

    //Citim continutul dintr-un fisier.

    public void printFileContent(){
        String pathFile = "path-ul catre fisier";
        File file = new File(pathFile);
        try {
            FileInputStream fileContent = new FileInputStream(file);
            System.out.println("A intrat in try");
        } catch (FileNotFoundException e) {
            System.out.println("A intrat in catch");
        } finally {
            System.out.println("A intrat in finally");
        }
    }

    //Definim o lista de cursanti

    public void printStudents(){
        String[] colegi = new String[2];
        colegi[0]="Andrei";
        colegi[1]="Marius";
        colegi[2]="Adina";
        for (int index=0; index<colegi.length;index++){
            System.out.println(colegi[index]);
        }
    }

    //Facen o regula de a nu vinde tigari la minori.

    public void regula(){
        int varsta = 15;
        if (varsta < 18){
            throw new RuntimeException("Nu vindem tigari la minori");
        }else{
            System.out.println("Persoana e majora.");
        }
    }

    //print content file v2

    public void printFileContentV2() throws FileNotFoundException {
        String pathFile = "path-ul catre fisier";
        File file = new File(pathFile);
        FileInputStream fileContent = new FileInputStream(file);
    }
}
