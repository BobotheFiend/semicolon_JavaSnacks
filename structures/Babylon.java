public class Babylon{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
    
        System.out.print("Enter the side length of the pentagon: ");
        long userInput = input.nextLong();
        
        System.out.printf("%.2f",sqrt(userInput), Math.sqrt(userInput));
        System.out.printf("%.2f",);
    }
  
    public static double sqrt(long number){
        
        long lastGuess = 1;
        long nextGuess = (lastGuess + number / lastGuess) / 2;
        int count = 1
        while(Math.abs(nextGuess - lastGuess) >= 0.0001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + number / lastGuess) / 2;
        }
    return nextGuess;
    }
}
        double areaOfPentagon = (5 * Math.pow(side,2)) / (4 * Math.tan(3.14/5));
    return areaOfPentagon;
    }
}
