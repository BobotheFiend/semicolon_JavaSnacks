public class Factorial{
  
    public static int factorial(int number){
        int store = 1;
        int count = number;
        for(;count >= 1;count--){
            store *= count; 
        }            
        return store;
    }
}
