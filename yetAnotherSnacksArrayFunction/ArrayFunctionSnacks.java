

public class ArrayFunctionSnacks{
    public static void main(String[] args){

       
        int [] collections = {25,30,10,23,2001,48,312,234};


        System.out.println(java.util.Arrays.toString(collections));
        System.out.printf("The largest number in the array is = %d%n", largestNumber(collections));
        System.out.print("The reverse of the Array is =" ); reverse(collections);

        int element = 7;
        System.out.printf("The element %d in the array is = %b%n",element,elementOccurence(collections, element));

        System.out.print("The odd position of elements in the array is = " ); oddPosition(collections);
        System.out.println();
        System.out.print("The even position of elements in the array is = "); evenPosition(collections);
         System.out.println();
        System.out.printf("The running total of the array is = %d%n",runningTotal(collections));

        System.out.printf("The sum of the array numbers are = %d%n", sumArrayNumbers(collections));
    
        
        int [] scores = {10, 50, 80};
        char [] grades = {'F','C','A'};
        joinArrays(scores, grades);
        System.out.printf("The combined arrays = %d%n",combinesArrays(grades, scores));
        

}

        public static int largestNumber(int [] collections){
            int largest = collections[0];
            int index = 0;
            for(;index < collections.length; index++){
            
            if (collections[index] > largest) {largest = collections[index];}
            }
            return largest;
             //System.out.println(java.util.Arrays.toString(collections));
             //System.out.printf("The largest number in the array list is %d%n", largest);
        }

        public static void reverse(int [] numbers){

             //for(int indexDescend = collections.length-1; indexDescend >= 0; indexDescend--){
             //return collections[indexDescend];
            //System.out.print(collections[descend] + " ");
             //System.out.println(java.util.Arrays.toString(collections));
                //}
                int swap = numbers[0];
                int firstElement = 0;
                int lastElement = numbers.length-1;
                for(;firstElement < lastElement; firstElement++){
                    swap = numbers[firstElement];
                    numbers[firstElement] = numbers[lastElement];
                    numbers[lastElement] = swap;
                lastElement--;
                }
                System.out.println(java.util.Arrays.toString(numbers));
        }

        public static boolean elementOccurence( int [] collections, int element){
        
            int index = 0;
            for(;index < collections.length; index++){
               if (element == collections[index]){ 
                    return true;
                }
                else if (element != collections[index]){ 
                }
            } return false;

        }

        public static void oddPosition(int [] collections){
        
            int index = 0;
            for(;index < collections.length; index++){
                if (index %  2 != 0){  
                    System.out.printf("%d ",collections[index]);
                }
            }
             
            //return collections[index];
        }

        public static void evenPosition(int [] collections){
                
             int index = 0;
             for(;index < collections.length; index++){
                 if (index  %  2 == 0){
                    System.out.printf("%d ",collections[index]);
                    }
             }
                
                //return collections[index];
        }
        public static int runningTotal(int [] collections){
        
            int index = 0;
            int total = 0;
            for(;index < collections.length; index++){
               total += collections[index];    
            }
            return total;
        }
        //public static void stringIsPalindrome(String words){
        //String name = "NNAMDI";
        //nam
        
        
        public static int sumArrayNumbers(int [] collections){
            
            int sum = 0;
            int index = 0;
            for(;index < collections.length; index++){
                sum += collections[index] + collections[index];
                //System.out.print(collections[index]);
                }
            return sum;
        }       

        public static void joinArrays(int [] scores, char [] grades){

                int [] coJoin = new  int [ scores.length + grades.length];

                int index = 0;
                for(;index < scores.length; index++){
                     coJoin[index] = scores[index];  
                }
                for(int indexTwo = index; indexTwo < grades.length; indexTwo++){
                     coJoin[index] = grades[index];
                }
                System.out.println(java.util.Arrays.toString(coJoin));
        }
        


        public static int combinesArrays(char [] characters, int [] numbers){

            int [] combines = new int [ characters.length + numbers.length];

            int indexForJoint = 0;
            int indexForArrays = 0;
            for(;indexForJoint < characters.length; indexForJoint++){
                 if (indexForJoint % 2 == 0)
                 combines[indexForJoint] = characters[indexForArrays++];
                }
            for(;indexForJoint < numbers.length; indexForJoint++){
                if (indexForJoint % 2 != 0)
                combines[indexForJoint] = numbers[indexForArrays++];
            }
            System.out.println(java.util.Arrays.toString(combines));
        return (combines[indexForJoint]);
        }
        
        //public static int arrayOfDigits(int []digits){
         //   int count = 0;
          //  int indexCounter = 0;   
          //  int [] remainders = new int [digits.length];
          //  for(;count > digits.length; count++){
           //     while(digits != 0){
            //        int extract = digits % 10;
             //       digits = digits 10;
                    
              //      remainders[count++] = extract; 
                //}

            //}

    
        //}
}
