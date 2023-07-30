package Structual.Decorator;

public class ExtraCheese extends Toppings {
    public ExtraCheese(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
