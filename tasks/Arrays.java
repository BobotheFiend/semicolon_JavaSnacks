
public class Arrays{
    public static void main(String[] args){


        int [] scores;
        scores = new int [4];
        scores[0] = 2;
        scores[2] = 66;
        scores[3] = 22;
        scores[1] = 6;

        //System.out.print(scores);
        int out = 0;
        for (; out < scores.length; out++){
            System.out.print(scores[out] + " ");
        }
    }
}
