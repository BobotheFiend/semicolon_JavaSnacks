// write a program that simulates the catching of a thief, what the progam should do; the program ends when "I shout thief!"

public class ThiefCatcher{
    public static void main(String[] args){

    catchThief();
    
    }
    //public static int catchThief(int number){
        //java.util.Random randomize = new java.util.Random();

        //int simulating = 0;
        
        //while(simulating == 0){
          //  simulating = randomize.nextInt(number);
            //if (simulating == 5){
              //System.out.print("Thief!"); break;
            //}
            
        //}
        //return simulating;
    //}
    public static void catchThief(){
    
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.println("There's a Thief on the lookout, lets apprehend him");
     System.out.print("Who is the Thief: ");
      String userInput = input.nextLine();
  
    while(!userInput.replace(" ","").equalsIgnoreCase("Thief")){
        System.out.print("Who is the Thief?: ");
        userInput = input.nextLine();
    
        }
    }
}
