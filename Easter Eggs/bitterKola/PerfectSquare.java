import java.util.Scanner;

public class PerfectSquare{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        double perfSq = Math.sqrt(num);

        if (perfSq % perfSq == 0){
        System.out.printf("%d is a perfect square", num);
        }   else{
            System.out.printf("%d NOT a perfect square", num);
            }
        
        
    }
}
