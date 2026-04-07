import java.util.Scanner;

public class AmountDisplay{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount 1$-10$ ");
        int num = input.nextInt();

        if (num == 1){
        System.out.printf("%d%s ----> one dollar%n", num, "$");
        } 
        if (num == 2){
        System.out.printf("%d%s ----> two dollars%n", num, "$");
        } 
        if (num == 3){
        System.out.printf("%d%s ----> three dollars%n", num, "$");
        }      
        if (num == 4){
        System.out.printf("%d%s ---->  four dollars%n", num, "$");
        }
        if (num == 5){
        System.out.printf("%d%s ----> five dollars%n", num, "$");
        }
        if (num == 6){
        System.out.printf("%d%s ----> six dollars%n", num, "$");
        }
        if (num == 7){
        System.out.printf("%d%s ----> seven dollars%n", num, "$");
        }
        if (num == 8){
        System.out.printf("%d%s ----> eight dollars%n", num, "$");
        }
        if (num == 9){
        System.out.printf("%d%s ----> nine dollars%n", num, "$");
        }
        if (num == 10){
        System.out.printf("%d%s ----> ten dollars%n", num, "$");
        }
    }
}

