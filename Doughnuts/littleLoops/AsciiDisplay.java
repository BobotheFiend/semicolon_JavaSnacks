
public class AsciiDisplay{
    public static void main(String[] args){

        char alphabet = 'A';
        int number = 65;
        for (;number <= 90; number++){
        System.out.printf("%d is %s %n", number, alphabet++);
        }
    }
}
