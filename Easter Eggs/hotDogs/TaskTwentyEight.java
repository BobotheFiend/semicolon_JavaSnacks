import java.util.Scanner;

public class TaskTwentyEight{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter side one: ");
        int a = inputNum.nextInt();

        System.out.print("Enter side two: ");
        int b = inputNum.nextInt();

        System.out.print("Enter side three: ");
        int c = inputNum.nextInt();
        
        if (a+b > c && a+c > b && c+b > a){ 
        System.out.print("It is a valid triangle");
        }    else { System.out.print("It is not a valid triangle"); 
            }


        if (a == b && b == c){
        System.out.printf(" = Your triangle is an Equilateral%n");
        }

        else if (a == b){
        System.out.printf(" = Your triangle is an Isoceles%n");
        } else if (b == c){
            System.out.printf(" = Your triangle is an Isoceles%n");
            }   else if (c == a){
                System.out.printf(" = Your triangle is an Isoceles%n");
                }

        else if (a != b && b != c){
        System.out.printf(" = Your triangle is Scalene%n");
        }
    }
}
