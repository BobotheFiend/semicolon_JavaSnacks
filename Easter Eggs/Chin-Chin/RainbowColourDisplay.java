import java.util.Random;

public class RainbowColourDisplay{

    public static void main(String[] args){

        Random numColour = new Random();

        int number = numColour.nextInt(7) +1;

        if (number == 1){
        System.out.printf(" Violet is %d", number);
        } else if (number == 2){
          System.out.printf(" Blue is %d", number);
          }  else if (number == 3){
             System.out.printf(" Orange is %d", number);
             } else if (number == 4){
               System.out.printf(" Green is %d", number);
               }  else if (number == 5){
                  System.out.printf(" Yellow is %d", number);
                  }  else if (number == 6){
                     System.out.printf(" Red is %d", number);
                     }  else if (number == 7){
                        System.out.printf(" Indigo is %d", number);
                        }
    }
}
