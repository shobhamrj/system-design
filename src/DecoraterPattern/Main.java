package DecoraterPattern;

import DecoraterPattern.Decorator.ExtraCheese;
import DecoraterPattern.Decorator.Mushroom;

public class Main {

    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(pizza.cost());
    }
}
