package abstractizareExemplu;

public class RestaurantVegan extends Restaurant implements RestaurantVeganInterface {
    public RestaurantVegan(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void meniu() {
        System.out.println("Tipul meniului este non vegan");
    }

    @Override
    public void servireBurger() {
        System.out.println("La acest restaurant se serveste burger vegan");
    }

    @Override
    public void servireHumus() {
        System.out.println("La restaurant se serveste humus");
    }
}
