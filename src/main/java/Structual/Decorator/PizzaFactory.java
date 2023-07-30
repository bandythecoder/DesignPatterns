package Structual.Decorator;

public class PizzaFactory {
    public static Pizza createPizza(String input)
    {
        if(input.equals("Veg"))
        {
            return new VegPizza();
        }
        else
        {
            return new NonVegPizza();
        }
    }

    public static Pizza addToppings(String input, Pizza pizza)
    {
        if(input.equals("Cheese"))
        {
            return new ExtraCheese(pizza);
        }
        else if (input.equals("Mashroom"))
        {
            return new ExtraCheese(pizza);
        }
        else
        {
            return pizza;
        }
    }
}
