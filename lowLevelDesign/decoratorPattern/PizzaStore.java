import java.util.*;

public class PizzaStore {
    public static void main(String args[]) {

        System.out.println("Pizza\n-----\nFarmHouse: 200\nMarghretta: 100\nVegDelight: 120\n\nToppings\n--------\nMushroom: 20\nExtraCheese: 10\n");

        // Marghretta + Extracheese
        BasePizza pizza = new ExtraCheese(new Marghretta());
        System.out.println("Pizza cost for Marghretta and ExtraCheese: "+pizza.cost());

        // Marghretta + Extracheese + Mushroom
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new Marghretta()));
        System.out.println("Pizza cost for Marghretta, Mushroom and ExtraCheese: "+pizza1.cost());
    }
}
