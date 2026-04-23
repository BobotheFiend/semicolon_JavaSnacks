
public class TabularOutput{
    public static void main(String[] args){

        int number = 5;
        int count = 1;

        for(; count <= number; count++){
            //System.out.printf("N%d%n", count);
            for(int power = 1; power <= number; power++){
                System.out.printf("N%d", count);
                System.out.print(" ");
                System.out.print(power*count);
            }
            System.out.printf("%n");
        }
    }
}
    
