import java.util.Scanner;

public class TaskTwo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Month: ");
        String month = input.nextLine();
        System.out.print("Enter Year: ");
        int year = input.nextInt();

        if (month == "January" && month == "january"){
        System.out.printf("%s, %d has 31 days%n", month, year);
        }
        else if (month == "February" && month == "february"){
        System.out.printf("%s, %d has 28 days%n", month, year);
        }
        else if (month == "February" && month == "february" && year % 4 == 0){
        System.out.printf("%s, %d has 29 days, A leap year!%n", month, year);
        }
        else if (month == "March" && month == "march"){
        System.out.printf("%s, %d has 31 days%n", month, year);
        }
        else if (month == "April" && month == "april"){
        System.out.printf("%s, %d has 30 days%n", month, year);
        }
        else if (month == "May" && month == "may"){
        System.out.printf("%s. %d has 31 days%n", month, year);
        }
        else if (month == "June" && month == "june"){
        System.out.printf("%s, %d has 30 days%n", month, year);
        }
        else if (month == "July" && month == "july"){
        System.out.printf("%s, %d has 31 days%n", month, year);
        }
        else if (month == "August" && month == "august"){
        System.out.printf("%s, %d has 31 days%n", month, year);
        }
        else if (month == "September" && month == "september"){
        System.out.printf("%s, %d has 30 days%n", month, year);
        }
        else if (month == "October" && month == "october"){
        System.out.printf("%s, %d has 31 days%n", month, year);
        }
        else if (month == "November" && month == "november"){
        System.out.printf("%s, %d has 30 days%n", month, year);
        }
        else if (month == "December" && month == "december"){
        System.out.printf("%s, %d has 31 days%n", month, year);
        }
    }
}

