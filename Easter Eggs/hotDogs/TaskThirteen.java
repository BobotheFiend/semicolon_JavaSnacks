import java.util.Scanner;

public class TaskThirteen{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter the amount you would like to save monthly: ");
        int amount = inputNum.nextInt();

        double monthOne = (1+0.003125)*amount;       
        double monthTwo = (1+0.003125)*monthOne;
        double monthThree = (1+0.003125)*monthTwo;    
        double monthFour = (1+0.003125)*monthThree;        
        double monthFive = (1+0.003125)*monthFour;       
        double monthSix = (1+0.003125)*monthFive;

        System.out.printf("The account after six months is %.0f%n", monthSix);

        String reciept = String.format("""
"For the first month the intrest rate was %.0f"
"For the second month the balance was %.0f"
"Month three the balance was %.0f"
"Month Four the balance was %.0f"
"Month Five the balance was %.0f"
"Month Six the balance was %.0f"

        , monthOne, monthTwo, monthThree, monthFour, monthFive, monthSix""");
        
        System.out.print(reciept);
    }
}
