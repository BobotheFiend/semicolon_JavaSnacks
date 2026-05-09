public class HighestRecurringCount{
    public static void main(String[] args) {
        int[] numbers = {1,2,2,2,3};
        int [] secondNumbers = {1,5,5,6,4};
    
        System.out.printf("It occurs %d times%n",  reoccurring(numbers));
        System.out.printf("It occurs %d times%n", reoccurring(secondNumbers));



}


    public static int reoccurring(int [] collections){
    
        int frequentCount = collections[0];
        int highestCount = 0;
        int count = 0;
        for (;count < collections.length; count++) {
            int increase = 0;

            for (int counterTwo = 0; counterTwo < collections.length; counterTwo++) {
                if (collections[count] == collections[counterTwo]) {
                    increase++;
                }
            }
                if (increase > highestCount) {
                    highestCount = increase;
                    frequentCount = collections[count];
                }
        }
        return highestCount;
        //System.out.printf("The frequent number = %d and it occurs %d times ", frequentCount, highestcount);
    }
}

