package Structual.Decorator;

public class Masroom extends Toppings {
    public Masroom(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 50;
    }
}
