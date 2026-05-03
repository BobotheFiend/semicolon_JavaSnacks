public class DisplayStringCount{
    public static void main(String[] args){

    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a letter: ");
    String letter = input.nextLine();
    
    int letterLength = countLetters(letter);
    int count = 1;
        for(;count <= letterLength; count++){
            System.out.printf("%d%n",count);
         }
    }
    public static int countLetters(String letter){

        return letter.length();
        
    }
}
