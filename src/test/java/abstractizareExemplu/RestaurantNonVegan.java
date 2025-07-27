package abstractizareExemplu;

public class RestaurantNonVegan extends Restaurant implements RestaurantNonVeganInterface {
    public RestaurantNonVegan(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void meniu() {
        System.out.println("Tipul meniului este non vegan");
    }

    @Override
    public void servireBurger() {
        System.out.println("La acest restaurant se serveste burger de vita");
    }
}
