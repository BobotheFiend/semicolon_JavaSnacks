public class Greetings{
  
    public static String greet(String name){
        String shoutOut = String.format("""
         'Hello,%s!'"""
                         ,name);
                
    return shoutOut;
    }
}
