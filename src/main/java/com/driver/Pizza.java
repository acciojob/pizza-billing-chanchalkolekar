package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    // taking some boolean variables
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    private int Toopings;
    private int base;
    private int cheese;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.bill = "";
        // your code goes here
        // if user select veg pizza the it vegpizza variable become true
        // if it gets true then the pizza value will be 300 and toopings 70
        // if it is non veg then pizza price is 400 and topping 120
        if (isVeg) {
            this.price = 300;
            this.Toopings = 70;
        } else {
            this.price = 400;
            this.Toopings = 120;
        }
        isExtraCheeseAdded = false;
        isExtraToppingAdded = false;
        isBillCreated = false;
        isTakeAway = false;
        this.cheese = 80;
        // whatever the user selected add that price in bill
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";

    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!isExtraCheeseAdded) {
            this.price += cheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!isExtraToppingAdded) {
            this.price = this.price + this.Toopings;
            isExtraToppingAdded = true;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (!isTakeAway) {
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill() {
        // your code goes here
        // now checking if bill is not generated then adding expensis in the bill
        if (!isBillCreated) {
            // checking if user is added chesse
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            // checking if user added toopings
            if (isExtraToppingAdded) {
                this.bill += "Extra Toppings Added: " + this.Toopings + "\n";
            }
            // checking iff user take away the item
            if (isTakeAway) {
                this.bill += "Paperbag Added: " + "20" + "\n";
            }
            // final adding the total price in bill
            this.bill += "Total Price: " + this.price + "\n";
            this.isBillCreated = true; // now bill is generated so we will change the status of genratebill variable to
                                       // true
            return this.bill;
        }
        return "";
    }

}
