

import java.util.Scanner;
public class ReverseNumberInAnArray{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    
    
    
    int [] collections;
    collections = new int [10];
    
    int count = 0;
    for(;count < 10; count++){
   
        System.out.print("Enter number ");
        int numbers = inputCollector.nextInt();
        
        
        collections[count] = numbers;
        }

        for(int store = collections.length-1; store >= 0; store--){
        
        System.out.print(collections[store] + " ");
         //System.out.println(java.util.Arrays.toString(collections));
         }

    }
}
