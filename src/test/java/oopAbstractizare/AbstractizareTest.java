package oopAbstractizare;

import org.testng.annotations.Test;

public class AbstractizareTest{

    @Test

    public void methodTest(){
        AngajatFullTime gojo = new AngajatFullTime("Gojo","Satoru",30, "AAA");
        gojo.mergeInConcediu();

        AngajatPartTime silvia = new AngajatPartTime("Monea", "Silvia",26,"BBB");
        silvia.mergeInConcediu();
    }
}
