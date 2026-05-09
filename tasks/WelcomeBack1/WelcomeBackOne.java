public class WelcomeBackOne{
    public static void main(String[] args){

    String name = "NNAMDI";
    System.out.println(length(name));
    System.out.print("Reverse is");reverse(name);

    //java.util.Scanner input = new java.util.Scanner(System.in);
    //System.out.print("Enter the minute time: ");
    //double minutes = input.nextInt();
    //time(minutes);
}

    public static int length(String name){

        int nameLength = name.length();
    return nameLength;
    }

    public static void reverse(String name){
        //String space = " ";
        
        int length = length(name);
        int count = length -1;
        for(;count >= 0; count--){
            //space = name.charAt(index)+space;
        System.out.printf("%c", name.charAt(count));
        }
        System.out.println();
    //return space;
    }
    public static void time(double minutes){
        int minToSeconds = (int)minutes*60;

        double minToHour = minutes/60;

        System.out.printf("%.0f mins in sec = %dsecs%n%f mins in Hours = %.1fhrs%n", minutes, minToSeconds, minutes,minToHour);
        
    }

    //public static int primeNumber(int number){
        
      //}
}
