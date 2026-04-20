import java.util.Random;
public class CoinFlipHeadTails{
    public static void main(String[] args){

    Random flip = new Random();
    
        int head = 0;
        int tail = 0;
        int count = 0;
        for (;count <= 1000000;count++){
            int coin = flip.nextInt(2);
            if (coin == 0){
            head++;
                }
            else if (coin == 1){
                tail++;
                }
        }
                        System.out.printf("%s%d%n%s%d%n", "Heads are : ", head, "Tails are: ",tail);
    }
}
