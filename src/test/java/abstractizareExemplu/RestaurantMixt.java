package abstractizareExemplu;

public class RestaurantMixt extends Restaurant implements RestaurantVeganInterface,RestaurantNonVeganInterface{
    public RestaurantMixt(String nume, String adresa) {
        super(nume, adresa);
    }

    @Override
    public void meniu() {
        System.out.println("In restaurant se serveste meniu vegan si non vegan");
    }

    @Override
    public void servireBurger() {
        System.out.println("Se serveste burger vegan si non vegan");
    }

    @Override
    public void servireHumus() {
        System.out.println("Se serveste humus");
    }
}
