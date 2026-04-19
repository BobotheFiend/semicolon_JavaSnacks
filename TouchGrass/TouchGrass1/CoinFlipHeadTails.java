import java.util.Random;
public class CoinFlipHeadTails{
    public static void main(String[] args){

    Random flip = new Random();
        int coin = flip.nextInt(1,2);
        int head = 1;
        int tail = 2;
        int count = 0;
        for (;count <= 1000000;count++){
            if (coin == head){
                System.out.printf("Heads%n");
                }
            else if (coin == tail){
                System.out.printf("Tails%n");
                }
        }
    }
}
