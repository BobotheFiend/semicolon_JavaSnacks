import java.util.Random;

public class CoordinateDisplay{

    public static void main(String[] args){


        Random generate = new Random();

        int height = generate.nextInt(150) + 1;
        int width = generate.nextInt(50) + 1;
        
        System.out.printf(" %d, %d%n", width, height);

    }
}
