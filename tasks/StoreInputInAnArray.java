// Write a progam that collects 10 inputs, store it in an array;

import java.util.Scanner;
public class StoreInputInAnArray{
    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    
    int [] collections;
    collections = new int [10];
    
    int count = 0;
    for(;count < 10; count++){
   
        System.out.print("Enter number ");
        int numbers = inputCollector.nextInt();
        
        //System.out.print(numbers + " ");
        collections[count] = numbers;
        }
        //for(int store = 0; store < collections.length; store++){
        
        //System.out.print(collections[store] + " ");
        //}
            System.out.println(java.util.Arrays.toString(collections));
        //System.out.print(collections[count] + " ");
    
    //int [] array = new int [10]

    //array[0] = 2;
    //array[1] = 3;
    //array[2] = 4;
    //array[3] = 6;
    //array[4] = 77;
    //array[5] = 44;
    //array[6] = 66;
    //array[7] = 99;
    //array[8] = 65;
    //array[9] = 60;

    //for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");

    int a[], b, c;
        a = new int [4];
        b = 44;
        c = 66; 

      
    for (int counter = 0; counter < a.length; counter++) {
        a[counter] = counter*10;
        System.out.printf("%5d%8d%n", counter, a[counter]);
    }
    System.out.print(b + " " + c);

    }
}
