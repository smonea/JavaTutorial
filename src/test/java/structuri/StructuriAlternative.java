package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative = IF (conditie 1...conditie n) THEN ... ELSE, SWITCH...CASE
    //Putem avea mai multe conditii intre paranteze care se delimiteaza folosind operatorii logici: &&, ||, !
    //Nu este obligatoriu ca un IF sa aibe ELSE
    //Putem adauga mai multe structuri de tipul IF cu ajutorul lui ELSE folosind ELSE/IF

    @Test
    public void testMethod() {
//        celMaiMareNR(25,78);
//        celMaiMareNR(23,0);
//        celMaiMareNR(-2,2);
//        celMaiMareNR(12, 12);
//        celMaiMareNR(1,2);
//        celMaiMareNR(-1,-1);
//        celMaiMareNR(0,255);

//        numarPar(3);
//        numarPar(2);
//        numarPar(0);
//        numarPar(-4);
//        numarPar(-9);
//        numarPar(1234567891);

//        numarParPoz(3);
//        numarParPoz(2);
//        numarParPoz(-3);
//        numarParPoz(-4);
//        numarParPoz(0);
//        numarParPoz(1234567891);

//        lungimeParola("Parola123");
//        lungimeParola("12345678");
//        lungimeParola("1234567");
//        lungimeParola("123456789123456");
//        lungimeParola("!@#$%^%^$$");
//        lungimeParola("ParolaParola");
//        lungimeParola("ParolaParolaPar");
//        lungimeParola("ParolaParolaParo");
//        lungimeParola("");

        lungimeParolaV1("Test123!");
        lungimeParolaV1("test1234");
        lungimeParolaV1("TEST!!!!");

        lungimeParolaV2("Test123!");
        lungimeParolaV2("test1234");
        lungimeParolaV2("TEST!!!!");

        lungimeParolaV3("Test123!");
        lungimeParolaV3("test1234");
        lungimeParolaV3("TEST!!!!");

    }

    //Verificam care este numarul cel mai mare dintre 2 valori.

    public void celMaiMareNR(int nr1, int nr2) {

        if (nr1 > nr2) {
            System.out.println("Cel mai mare numar dintre " + nr1 + " si " + nr2 + " este " + nr1);
        } else {
            System.out.println("Cel mai mare numar dintre " + nr1 + " si " + nr2 + " este: " + nr2);
        }
    }

    //Verificam daca un numar este par.
    //Daca vrem sa lucram cu catul unei impartiri folosim / (divide)
    //Daca vrem sa lucram cu restul unei impartiri folosim % (modulo)

    public void numarPar(int nr) {
        if (nr % 2 == 0) {
            System.out.println("Numarul " + nr + " este par");
        } else {
            System.out.println("Numarul " + nr + " este impar");
        }
    }

    //Verificam daca un numar este par si pozitiv

//    public void numarParPoz(int nr) {
//        if (nr % 2 == 0) {
//            if(nr>0){
//                System.out.println("Numarul " + nr + " este par pozitiv");
//            } else {
//                System.out.println("Numarul " + nr + " este par negativ");
//            }
//        } else if(nr%2==1){
//            if(nr>0){
//                System.out.println("Numarul " + nr + " este impar pozitiv");
//            } else {
//                System.out.println("Numarul " + nr + " este impar negativ");
//            }
//        } else {
//            System.out.println("Numarul este egal cu 0");
//        }
//    }

    public void numarParPoz(int nr) {
        if (nr == 0) {
            System.out.println("Numarul este 0");
        } else if (nr % 2 == 0) {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este par pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este par negativ");
            }
        } else {
            if (nr > 0) {
                System.out.println("Numarul " + nr + " este impar pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar negativ");
            }
        }
    }

    //Verificam daca lungimea unei valori(parole) este cuprinsa intre 8 si 15 caractere.

    public void lungimeParola(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            System.out.println("Parola " + parola + " are lungimea intre 8 si 15 caractere.");
        } else {
            System.out.println("Parola " + parola + " nu are lungimea intre 8 si 15 caractere.");
        }
    }


    //Adaugam extra verificari legat de continutul parolei.
    //Aceste verificari se focuseaza pe faptul ca parola trebuie sa contina: un caracter mare, o cifra, un caracter special.

    //cu if si else

    public void lungimeParolaV1(String parola) {
        int lungime = parola.length();

        if (lungime >= 8) {
            if (lungime <= 15) {
                boolean areLiteraMare = false;
                boolean areCifra = false;
                boolean areSpecial = false;

                for (int i = 0; i < lungime; i++) {
                    char c = parola.charAt(i);

                    if (c >= 'A') {
                        if (c <= 'Z') {
                            areLiteraMare = true;
                        }
                    }

                    if (c >= '0') {
                        if (c <= '9') {
                            areCifra = true;
                        }
                    }

                    // Verificăm dacă nu e literă sau cifră
                    if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {
                        areSpecial = true;
                    }
                }

                if (areLiteraMare) {
                    if (areCifra) {
                        if (areSpecial) {
                            System.out.println("Parola \"" + parola + "\" este valida.");
                        } else {
                            System.out.println("Parola \"" + parola + "\" trebuie sa contina un caracter special.");
                        }
                    } else {
                        System.out.println("Parola \"" + parola + "\" trebuie sa contina o cifra.");
                    }
                } else {
                    System.out.println("Parola \"" + parola + "\" trebuie sa contina o litera mare.");
                }

            } else {
                System.out.println("Parola \"" + parola + "\" este prea lunga.");
            }
        } else {
            System.out.println("Parola \"" + parola + "\" este prea scurta.");
        }
    }


    //cu if si for
    public void lungimeParolaV2(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            boolean areLiteraMare = false;
            boolean areCifra = false;
            boolean areSpecial = false;

            for (int i = 0; i < parola.length(); i++) {
                char c = parola.charAt(i);
                if (Character.isUpperCase(c)) {
                    areLiteraMare = true;
                } else if (Character.isDigit(c)) {
                    areCifra = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    areSpecial = true;
                }
            }

            if (areLiteraMare && areCifra && areSpecial) {
                System.out.println("Parola \"" + parola + "\" este valida.");
            } else {
                System.out.println("Parola \"" + parola + "\" trebuie sa contina cel putin o litera mare, o cifra si un caracter special.");
            }
        } else {
            System.out.println("Parola \"" + parola + "\" nu are lungimea intre 8 si 15 caractere.");
        }
    }

    //cu regex

    public void lungimeParolaV3(String parola) {
        if (parola.length() >= 8 && parola.length() <= 15) {
            if (parola.matches(".*[0-9].*") &&
                    parola.matches(".*[!@#$%^&*()\"{}\\[\\]||].*") && parola.matches(".*[A-Z].*")) {
                System.out.println("Parola este validă și respectă toate criteriile.");
            } else {
                System.out.println("Parola trebuie să conțină cel puțin o cifră, un caracter special (!@#$%^&*()\"{}[]||) și o literă mare.");
            }
        } else {
            System.out.println("Parola nu are lungimea între 8 și 15 caractere.");
        }
    }
}



















