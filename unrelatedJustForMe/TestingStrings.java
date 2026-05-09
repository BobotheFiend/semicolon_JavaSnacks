public class TestingStrings{
    public static void main(String[] args){

    java.util.Scanner input = new java.util.Scanner(System.in);
    java.util.Random shuffle = new java.util.Random();

    System.out.print("Enter a Fruit: ");
    String name = input.nextLine();

    String [] names = {"Nnamdi","Tosin","CJ","Kenny","Dike","Pankeys", "Rhema","Isreal","Aisosa","Grace"};

    int shuffleName = shuffle.nextInt(names.length);
    String namesAtRandom = names[shuffleName];

    int letterLength = letterLength(name);
    String reverse = reverse(name);
//    int shuffleNameLength = letterLength(names);
    System.out.printf("The length of the word %s = %d%n%s is %s's favourite fruit%nThe reverse of %s is %s%n", name, letterLength, name, namesAtRandom, name, reverse);
    
}

    public static int letterLength(String letter){

        int count = 0;
        for(char counter : letter.toCharArray())
        count++;

    return count;
    }
    
    public static String reverse(String name){
       char[]names = name.toCharArray();
        StringBuilder store = new StringBuilder();

        int count = names.length-1;
        for(;count >= 0;count--)
            store.append(names[count]);
     return store.toString();
    }       
    
}
