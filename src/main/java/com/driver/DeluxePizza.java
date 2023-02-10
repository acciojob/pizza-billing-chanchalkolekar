package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        // calling the two methods from parent class using super
        // super is useed to call things from parent class
        addExtraCheese();
        addExtraToppings();
    }
}
