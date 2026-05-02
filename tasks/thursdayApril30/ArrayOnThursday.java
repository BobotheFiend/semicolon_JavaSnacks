public class ArrayOnThursday{
    public static void main(String[] args){

    int [] numberCollectionOne = {2,5,7,9,20};
    System.out.printf("Output = %d%n",subtitutionOfLargestnSmallest(numberCollectionOne));

    int [] numberCollectionTwo = {2,3,1,4,6};
    System.out.printf("Output = %d%n",subtitutionOfLargestnSmallest(numberCollectionTwo));


        

    }

        public static int largestArrayOfNumbers(int [] numbers){

            int largest = numbers[0];
            int count = 0;

            for(;count < numbers.length; count++){
                if (numbers[count] > largest) largest = numbers[count];
            }
        return largest;
        }

        public static int smallestArrayOfNumbers(int [] numbers){
            int smallest = numbers[0];
            int count = 0;
            for (;count < numbers.length;count++){
                if (numbers[count] < smallest)  smallest = numbers[count];
            }
        return smallest;
        }

        public static int subtitutionOfLargestnSmallest(int [] numbers){
       
          int minus = largestArrayOfNumbers(numbers) - smallestArrayOfNumbers(numbers);

        return minus;
        }
}
