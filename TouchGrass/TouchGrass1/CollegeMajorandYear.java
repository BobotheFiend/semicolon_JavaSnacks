import java.util.Scanner;
public class CollegeMajorandYear{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        System.out.print("""        
                  I = Information Management
                  C = COmputer Science
                  A = Accounting
                    Enter any of the alphabeth in CapitalLetters: """
                            );
        String letters = input.nextLine();

        switch(letters){
            case "I": System.out.printf("""
                            Information Management
                        1. Freshman
                        2. Sophomore
                        3. Junior
                        4. Senior 
                        Enter your year: """
                                        );
                      int yearforIM = input.nextInt();
                      switch(yearforIM){
                        case 1: System.out.printf("%s%n","Your major is Information Management and you're a Freshman");
                            break;
                        case 2: System.out.printf("%s%n","Your major is Information Management and you're a Sophomore");
                            break;
                        case 3: System.out.printf("%s%n","Your major is Information Management and you're a Junior");
                            break;
                        case 4: System.out.printf("%s%n","Your major is Information Management and you're a Senior");
                            break;
                        default: System.out.printf("%s%n","%s%n","Invalid Response");
                        }
                break;
            case "C": System.out.printf("""
                            Computer Science
                        1. Freshman
                        2. Sophomore
                        3. Junior
                        4. Senior 
                        Enter your year: """
                                        );
                      int yearforCS = input.nextInt();
                      switch(yearforCS){
                        case 1: System.out.printf("%s%n","Your major is Computer Science and you're a Freshman");
                            break;
                        case 2: System.out.printf("%s%n","Your major is Computer Science and you're a Sophomore");
                            break;
                        case 3: System.out.printf("%s%n","Your major is Computer Science and you're a Junior");
                            break;
                        case 4: System.out.printf("%s%n","Your major is Computer Science and you're a Senior");
                            break;
                        default: System.out.printf("%s%n","Invalid Response");
                        }
                break;
            case "A": System.out.printf("""
                            Accounting
                        1. Freshman
                        2. Sophomore
                        3. Junior
                        4. Senior 
                        Enter your year: """
                                        );
                      int yearforAccounting = input.nextInt();
                      switch(yearforAccounting){
                        case 1: System.out.printf("%s%n","Your major is Accounting and you're a Freshman");
                            break;
                        case 2: System.out.printf("%s%n","Your major is Accounting and you're a Sophomore");
                            break;
                        case 3: System.out.printf("%s%n","Your major is Accounting and you're a Junior");
                            break;
                        case 4: System.out.printf("%s%n","Your major is Accounting and you're a Senior");
                            break;
                        default: System.out.printf("%s%n","Invalid Response");
                        }
                break;

            default: System.out.printf("%s%n","Invalid input");
        }    
    }
}
