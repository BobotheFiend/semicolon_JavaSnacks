public class PhoneNumber{
    public static void main (String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("""

        ______________________
        |         @          |
        |                    |
        |____________________|
        |                    |
        |                    |
        |                    |
        |     N O K I A      |
        |                    |
        |                    |
        |                    |
        |____________________|
        | option       <  >  |
        |        MENU        |
        |                    |
        |  1              3  |
        |          2     DEF |
        |         ABC        |
        |  4              6  |
        | GHI      5     MNO |
        |         JKL        |
        |  7              9  |
        | PQRS     8    WXYZ |
        |         TUV        |
        |  *              #  |
        |          0         | 
        |____________________|
            
        """
                                );
        System.out.print("Enter a Letter in uppercase to input a number: ");
        char userInput = input.next().charAt(0);

        System.out.printf("%s%n",getNumber(userInput));
        
    }

    public static int getNumber(char uppercaseLetter){
         switch(uppercaseLetter){
            case 'A': return 2;
            case 'B': return 2;
            case 'C': return 2;

            case 'D': return 3;
            case 'E': return 3;
            case 'F': return 3;

            case 'G': return 4;
            case 'H': return 4;
            case 'I': return 4;

            case 'J': return 5;
            case 'K': return 5;
            case 'L': return 5;

            case 'M': return 6;
            case 'N': return 6;
            case 'O': return 6;
            case 'P': return 7;
            case 'Q': return 7;
            case 'R': return 7;
            case 'S': return 7;

            case 'T': return 8;
            case 'U': return 8;
            case 'V': return 8;

            case 'W': return 9;
            case 'X': return 9;
            case 'Y': return 9;
            case 'Z': return 9;
        
            default: return 0;
        }
    }
}
