// TO COLLECT THE ORDER
// KNOW THE TYPE OF PIZZA THEY WANT. FROM THE TYPE, THE NUMBER OF BOXES TO BE REQUESTED. THE NUMBER OF SLICES IN EACH BOXES. ASSUMING THEY ARE HOSTING A BIG PARTY OF ABOUT 20 - 30 GUESTS, AT LEAST EACH GUESTS SHOULD TAKE A MINIMUM OF 1 PIXXA SLICE

import java.util.Scanner;
public class PizzaWahala{
    public static void main(String[] args){
        Scanner accessMenu = new Scanner(System.in);
        displayMenu();
        
        System.out.print("Enter the number of guest: ");
        int numberOfPeople = accessMenu.nextInt();

        System.out.print("Select the Pizza Type you want: ");
        int choiceOfPizzaType = accessMenu.nextInt();

        collectsCustomerOrder(numberOfPeople, choiceOfPizzaType);
        //double pricePerBox;
        //int numberOfSLices;



    }


    public static void displayMenu(){
    System.out.printf(""" 
            ***WELCOME TO IYA ARAMIDE PIZZA JOINT***
=========================================================================
                        PIZZA MENU OPTION
-------------------------------------------------------------------------
       Pizza Type       Number of Slices         Price per box

       1.Sapa Size            4                    N 2,500
       2.Small Money          6                    N 2,900
       3.BIG Boys             8                    N 4,000
       4.ODOGWU               12                   N 5,200
-------------------------------------------------------------------------
""" 
                                                               );
    
    }
    
    public static String pizzaType(int pizzaMenu){
        switch (pizzaMenu){
        case 1: return "Sapa Size";
        case 2: return "Small Money";
        case 3: return "Big Boys";
        case 4: return "Odogwu";
        default: return "Not a menu option";
        }
    }
    public static int numberOfSlices(int numberOfPizzaSLicesInEachBox){
        
        switch (numberOfPizzaSLicesInEachBox){
        case 1: return 4;
        case 2: return 6;
        case 3: return 8;
        case 4: return 12;
        default: return 0;
        }
    }

      
    public static double pricePerBox(int cost){
        switch(cost){
        case 1: return 2500;
        case 2: return 2900;
        case 3: return 4000;
        case 4: return 5200;
        default: return 0;
        }
    }
     public static void collectsCustomerOrder(int numberOfPeople, int choiceOfPizzaType){
        String pizzaTypeMenu = pizzaType(choiceOfPizzaType);
        int costOfBoxes = (int)pricePerBox(choiceOfPizzaType);
        int pizzaSlices = numberOfSlices(choiceOfPizzaType);
        int howManyBoxes = (numberOfPeople / pizzaSlices) +1;
        int totalAmountOfPizzaSLicesOrdered = howManyBoxes * pizzaSlices;
        int totalPriceForCustomerToPay =  howManyBoxes * costOfBoxes;
        int leftoverSlices = Math.abs(numberOfPeople - totalAmountOfPizzaSLicesOrdered);

        System.out.printf("%nThe number of boxes of pizza to buy = %d boxes(%s size contains %d slices per box, %d boxes should be sufficent for %d persons as it would contain %d slices in all)%n", howManyBoxes,pizzaTypeMenu,pizzaSlices,howManyBoxes,numberOfPeople,totalAmountOfPizzaSLicesOrdered);

        System.out.printf("%nThe Number of left over slices after serving = %d slices (explanation: After serving %d slices, you should have %d slices left)%n",leftoverSlices, numberOfPeople, leftoverSlices);

        System.out.printf("%nPrice = N %d (explanation: %d per box for %d boxes)%n", totalPriceForCustomerToPay, costOfBoxes, howManyBoxes);
        }
}
        
