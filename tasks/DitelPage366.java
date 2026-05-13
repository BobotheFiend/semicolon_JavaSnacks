public class DitelPage366{
    public static void main(String [] args){

    java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        int [] collections = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};   
        int index = 0;     
        int count = 1;
        for(;count < collections.length; count++){
            System.out.print("Enter a score from [10 - 100]: ");
            int userInput = inputCollector.nextInt();

            if (userInput >= 10 && userInput <= 100){
                collections[index++] = userInput;

                for (int sameNumber = count; sameNumber < collections.length; sameNumber++){ 
                    if (collections[sameNumber] == userInput){
                        continue;
                    }
                    else{
                        collections[index++] = userInput;
                    }
                }
                
            }
            

            else{
                System.out.print("Invalid! score must be either [10 - 100]\nInput a score from [10 to 100]: ");
                userInput = inputCollector.nextInt();
  
            }
        }
        for (int collectionsCount = 0; collectionsCount < collections.length; collectionsCount++){
        
        //System.out.print(collections[collectionsCount]);
        }
        System.out.print(java.util.Arrays.toString(collections));
    }
}
