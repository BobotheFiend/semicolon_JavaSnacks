import java.util.Scanner;
public class PromptingLettersonPhone{
    public static void main(String[] args){
    Scanner inputWords = new Scanner(System.in);

        System.out.print("Enter an alphabeth in lower case: ");
        String letters = inputWords.nextLine();

        switch(letters){
            case "A": System.out.println("2");
            case "a": System.out.println("2");
                break;
            case "B": System.out.println("2");
            case "b": System.out.println("2");
                break;
            case "C": System.out.println("2");
            case "c": System.out.println("2");
                break;

            case "D": System.out.println("3");
            case "d": System.out.println("3");
                break;
            case "E": System.out.println("3");
            case "e": System.out.println("3");
                break;
            case "F": System.out.println("3");
            case "f": System.out.println("3");
                break;

            case "I": System.out.println("4");
            case "i": System.out.println("4");
                break;
            case "J": System.out.println("4");
            case "j": System.out.println("4");
                break;
            case "K": System.out.println("4");
            case "k": System.out.println("4");
                break;

            case "L": System.out.println("5");
            case "l": System.out.println("5");
                break;
            case "M": System.out.println("5");
            case "m": System.out.println("5");
                break;
            case "N": System.out.println("5");
            case "n": System.out.println("5");
                break;

            case "O": System.out.println("6");
            case "o": System.out.println("6");
                break;
            case "P": System.out.println("6");
            case "p": System.out.println("6");
                break;
            case "Q": System.out.println("6");
            case "q": System.out.println("6");
                break;

            case "R": System.out.println("7");
            case "r": System.out.println("7");
                break;
            case "S": System.out.println("7");
            case "s": System.out.println("7");
                break;
            case "T": System.out.println("7");
            case "t": System.out.println("7");
                break;

            case "U": System.out.println("8");
            case "u": System.out.println("8");
                break;
            case "V": System.out.println("8");
            case "v": System.out.println("8");
                break;
            case "W": System.out.println("8");
            case "w": System.out.println("8");
                break;

            case "X": System.out.println("9");
            case "x": System.out.println("9");
                break;
            case "Y": System.out.println("9");
            case "y": System.out.println("9");
                break;
            case "Z": System.out.println("9");
            case "z": System.out.println("9");
                break;

            default: System.out.println("Invalid input");
        }    
    }
}
