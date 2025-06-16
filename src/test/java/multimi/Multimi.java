package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {

    //Multimi = array, list(arraylist), map

    @Test

    public void testMethod(){
       // colegiCurs();
        //colegiCurslista();
        // fructe();
        //multimeFructeLista();
        //obiectiveTuristice();
        //obiectiveTuristiceV2();
        //obiectiveTuristiceV3();
        retete();

    }

    //Afisam numele colegilor de la curs.

    public void colegiCurs(){
        String[] colegi=new String[10];
        colegi[0]="Silvia";
        colegi[1]="Andu";
        colegi[2]="Laura";
        colegi[3]="Mihai";
        colegi[4]="Adina";
        for (int index=0; index<colegi.length; index++){
            System.out.println("Numele colegului este "+colegi[index]);
        }
    }

    //Afisam numele colegilor de la curs - V2 lista

    public void colegiCurslista(){
        List<String> colegi=new ArrayList<>();
        colegi.add("Silvia");
        colegi.add("Andrei");
        colegi.add("Mihai");
        colegi.add("Laura");
        colegi.add("Adina");
        for (int index=0; index<colegi.size(); index++){
            System.out.println("Numele colegului este "+colegi.get(index));
        }
    }

    //Afisam o multime de fructe

    public void fructe(){
        String[] fructe=new String[5];
        fructe[0]="mar";
        fructe[1]="para";
        fructe[2]="capsuni";
        fructe[3]="cirese";
        fructe[4]="corcoduse";
        for (int index=0; index<fructe.length; index++){
            System.out.println("Numele fructului este "+fructe[index]);
        }
    }

    //Afisam o multime de fructe - V2 lista

    public void multimeFructeLista(){
        List<String> fructe=new ArrayList<>();
        fructe.add("Mar");
        fructe.add("Para");
        fructe.add("Capsuni");
        fructe.add("Cirese");
        fructe.add("Corcoduse");
        for (int index=0; index<fructe.size(); index++){
            System.out.println("Numele fructului este "+fructe.get(index));
        }
    }

    //Afisam niste obiective turistice alaturi de orasele din care se afla.
    //Map=key-value
    //LinkedHashMap-afiseaza in ordine
    //HashMap-afiseama random
    //TreeMap-afiseaza alfabetic/numeric

    public void obiectiveTuristice(){
        Map<String,String> obiective=new LinkedHashMap<>();
        obiective.put("Roma", "Coloseum");
        obiective.put("Paris","Turnul Eiffel");
        obiective.put("Barcelona","La Sagrada familia");
        obiective.put("Berlin","Zidul Berlinului");
        obiective.put("Bucuresti","Casa poporului");
        for (String key: obiective.keySet()){  //for each
            System.out.println("Orasul curent este: "+key);
            System.out.println("Obiectivul din oras este: "+obiective.get(key));
        }

    }

    public void obiectiveTuristiceV2(){
        Map<String, List<String>> obiective=new LinkedHashMap<>();
        obiective.put("Roma", Arrays.asList("Coloseum","Panteon","Fantana Trevi"));
        obiective.put("Paris",Arrays.asList("Turnul Eiffel","Muzeul Luvru"));
        obiective.put("Barcelona",Arrays.asList("La Sagrada familia"));
        obiective.put("Berlin",Arrays.asList("Zidul Berlinului"));
        obiective.put("Bucuresti",Arrays.asList("Casa poporului","Centrul Vechi"));
        for (String key: obiective.keySet()){  //for each
            System.out.println("Orasul curent este: "+key);
            System.out.println("Obiectivele din oras sunt: "+obiective.get(key));
        }
    }

    public void obiectiveTuristiceV3(){
        Map<String, Map<String, List<String>>> obiective=new LinkedHashMap<>();

        Map<String, List<String>> oraseObiectiveItalia=new LinkedHashMap<>();
        oraseObiectiveItalia.put("Roma", Arrays.asList("Coloseum","Panteon","Fantana Trevi"));
        oraseObiectiveItalia.put("Venice",Arrays.asList("Doge Palace","Ponte di Rialto"));
        oraseObiectiveItalia.put("Milano",Arrays.asList("Duomo di Milano"));

        Map<String, List<String>> oraseObiectiveFranta=new LinkedHashMap<>();
        oraseObiectiveFranta.put("Paris", Arrays.asList("O1","O2","O3"));
        oraseObiectiveFranta.put("Lyon",Arrays.asList("O1","O2"));

        Map<String, List<String>> oraseObiectiveSpania=new LinkedHashMap<>();
        oraseObiectiveSpania.put("Barcelona", Arrays.asList("O1","O2","O3"));

        obiective.put("Franta",oraseObiectiveFranta);
        obiective.put("Italia",oraseObiectiveItalia);
        obiective.put("Spania",oraseObiectiveSpania);

        for (Map.Entry<String, Map<String, List<String>>> taraEntry : obiective.entrySet()) {
            String tara = taraEntry.getKey();
            //System.out.println("Țara: " + tara);

            Map<String, List<String>> orase = taraEntry.getValue();
            for (Map.Entry<String, List<String>> orasEntry : orase.entrySet()) {
                String oras = orasEntry.getKey();
                // System.out.println("  Oraș: " + oras);

                List<String> obiectiveOras = orasEntry.getValue();
                for (String obiectiv : obiectiveOras) {
                    // System.out.println("    - " + obiectiv);
                    System.out.println("Țara: " + tara +"  Oraș: " + oras +" Obiectiv:  " + obiectiv );

                }
            }
        }

    }

    //Definiti o carte de retete cu mai multe retete care se diferentiaza prin numele lor, cu ingrediente.

    public void retete(){
        Map<String, List<String>> reteta=new LinkedHashMap<>();
        reteta.put("Sarmale", Arrays.asList("Carne tocata","Pasta de tomate","Orez", "Ceapa", "Condimente", "Varza murata"));
        reteta.put("Ciorba de perisoare",Arrays.asList("Carne tocata","telina", "pastarnac", "rosii", "cartofi", "bors", "condimente"));
        reteta.put("Varza calita",Arrays.asList("varza murata", "rosii", "ceapa","condimente"));
        reteta.put("Iahnie de fasole",Arrays.asList("fasole","bulion","ceapa","morcovi","condimente"));
        reteta.put("Musaca",Arrays.asList("carne tocata","rosii", "cartofi","ceapa","condimente"));
        for (String key: reteta.keySet()){  //for each
            System.out.println("Reteta: "+key);
            System.out.println("Ingrediente: "+reteta.get(key));
        }
    }



}


















