package Structual.Decorator;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please Select pizza Base - Veg/Non Veg");
        var input = scn.next();


        Pizza pizza = PizzaFactory.createPizza(input);
        System.out.print("Please Select topping - Cheese/Mashroom - ");
         input = scn.next();
         pizza = PizzaFactory.addToppings(input, pizza);
         System.out.println(pizza.cost());
    }
}
