//Author: Gil Silva
// Assignment from Java Boot Camp
// Programming objective: declare variables and use them as input in a letter
//Letter content already provided by the instructor.

public class Letter {
    public static void main(String[] args){
        //Declare a variable for the country been visited
        String country = "Kenya";

        //Declare a variable and assign population
        double population = 49.7;
        //Declare a variable and assign the capital of the country
        String capital = "Nairobi";
        //Declare a variable for exchange value
        double currencyAmount = 103.84;

        //Declare a string and assign the name of the currency
        String currencyName = "Kenyan Shillings";

        // Display letter
        System.out.println("Hey Mom and Dad \n" +
        "Here are some interesting details about the first country I'm visiting.\n"+
        "Name: " + country +
        "\nPopulation Size: "+ population + " million\n" +
        "Capital: " + capital +
        "\nCurrency: One U.S. Dollar equals $" + currencyAmount + " " + currencyName + "!!");
        System.out.println("I'm so excited to visit the Nairobi Park and feel the giraffes?? Talk later.");

    }
}
