public class HighestOccuringNumber{
    public static void main(String[] args){
    int [] numberOne = {2,1,2,5,2,4};
    
    int [] numberTwo = {3,4,3,4,1,5};

    System.out.println(numberOccurence(numberOne));
    System.out.println(numberOccurence(numberTwo));
}

public static int numberOccurence(int [] collections){

    int count = 0;
    int store = 0;
    for(;count < collections.length; count++){
        int counter;
        //int [] output = new int [counter.length];
        for (counter = count+1;counter < collections.length;counter++){
       // collections[count] = collections[counter];
        if (collections[count] == collections[counter])
            store = collections[counter];
        }
        if (count > 1);
        store = collections[count];
    }
    
    return store;  
    }
}  
