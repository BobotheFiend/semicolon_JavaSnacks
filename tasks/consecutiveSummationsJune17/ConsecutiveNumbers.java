import java.util.Arrays;

public class ConsecutiveNumbers{

    public static int [] getLargestSum(int [] collections){
    
        int [] sumElements = new int [3];
        int largest = Integer.MIN_VALUE;
        for(int count = 0; count < collections.length - 2; count++){
            int answer = collections[count] + collections[count+1] + collections[count+2];
            if(answer > largest){
                largest = answer;
                sumElements[0] = collections[count];
                sumElements[1] = collections[count+1];
                sumElements[2] = collections[count+2];
            }
        }   
        return sumElements;
    }

}
