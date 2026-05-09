import java.time.*;
import java.time.format.DateTimeFormatter;
public class SemicolonStore{

    public static void main(String[] args){

    DateTimeFormatter formatDateNdTime = DateTimeFormatter.ofPattern(" dd-MMM-YY H:mm:ss a");

    LocalDate todaysDate = LocalDate.now();
    LocalTime theCurrentTime = LocalTime.now();

    LocalDateTime todaysDateNdTime = LocalDateTime.of(todaysDate, theCurrentTime);
    
    
    String dateTime = todaysDateNdTime.format(formatDateNdTime);
    
    java.util.ArrayList<String> collect = new java.util.ArrayList<>();
    String customersName = customerName();
        String userItems = whatUserBought();
        int numberOfItems = howManyItems();
        int costPerUnit = howMuch();
        String addingItems = addMoreToCart();
//    String addingItems = ignoresCase("yes");
    while(!addingItems.replace(" ","").equalsIgnoreCase("no")){
//        customersName = customerName();
        userItems = whatUserBought();
        collect.add(userItems);
        numberOfItems = howManyItems();
        costPerUnit = howMuch();
        addingItems = addMoreToCart();
    }
    //int discount = 
 
    for (String items: collect){
        if (items % 4 == 0)
        System.out.print(items);        
        }
    System.out.printf("""   
--------------------------------------------------------------------
SEMICOLOCN STORES                                                  
MAIN BRACH                                                         
LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.              
TEL: 0329828343                                                    
Date: %s                                                        
Cashier: %s                                                        
Customer Name: %s                                                  
                                                                   
===================================================================
                                                                   
             ITEMS       QTY       PRICE       TOTAL(NGN)          
                                                                   
-------------------------------------------------------------------
   %s         %d         %d                                        
                                                                   
                                                                   
                                                                   
                                                                   
                                                                   
                                                                   
                                                                                                                                    
                                                                   
                                                               
                                                                                                                               
                                                                   
                                                                   
                                                                   
--------------------------------------------------------------------
                    """
                        ,dateTime,cashier(),customersName,userItems,numberOfItems,costPerUnit);

    }

    public static String cashier(){
    java.util.Random shuffle = new java.util.Random();
    String [] names = {"Timothy", "Kay", "ChiFunds", "BigVans", "Keem", "EOB", "S-Kay", "Ash", "Sam"};
    
    int shufleIndex = shuffle.nextInt(names.length);
    
    return names[shufleIndex];
    }
    public static String customerName(){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print(" What is the customers name...  ");
    String name = input.nextLine();

    return name;
    } 
    public static String whatUserBought(){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print(" What did the user buy?...  ");
    String items = input.nextLine();

    return items;
    }

    public static int howManyItems(){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print(" How many pieces?...  ");
    int countOfItems = input.nextInt();

    return countOfItems;
    }
    public static int howMuch(){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print(" How much per unit?...  ");
    int costOfItems = input.nextInt();

    return costOfItems;
    }
    public static String addMoreToCart(){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print(" Add more items?...  ");
    String moreItemsToAdd = input.nextLine();

    return moreItemsToAdd;
    }
    //public static int 
    //public static int cart(String item, int quantity, int price)
    
}
