import coffee.Americano;
import coffee.Cappuccino;
import coffee.Coffee;
import coffee.Espresso;

public class CoffeeFactory {

    Coffee coffee = null;
    public Coffee getCoffee(CoffeeType type) {
        switch (type) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            default:
                throw new RuntimeException("Something wrong with coffee type.");
        }
        return coffee;
    }
}
