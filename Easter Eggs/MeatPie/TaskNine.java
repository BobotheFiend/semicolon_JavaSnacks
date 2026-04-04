import java.util.Scanner;

public class TaskNine{

    public static void main(String[] args){

        Scanner inputColour = new Scanner(System.in);

        System.out.print("What's your Favourite colour: ");
        String fav = inputColour.nextLine();

        System.out.printf("%s%s%n","Your Favourite colour is: ", fav);

    }

}
