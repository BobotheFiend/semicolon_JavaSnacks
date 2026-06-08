import java.time.*;
import java.time.format.DateTimeFormatter;
public class SemicolonStore{

    public static void main(String[] args){

    DateTimeFormatter formatDateNdTime = DateTimeFormatter.ofPattern(" dd-MMM-YY H:mm:ss a");

    LocalDate todaysDate = LocalDate.now();
    LocalTime theCurrentTime = LocalTime.now();

    LocalDateTime todaysDateNdTime = LocalDateTime.of(todaysDate, theCurrentTime);
    
    
    String dateTime = todaysDateNdTime.format(formatDateNdTime);
    
    java.util.ArrayList<String> collectNames = new java.util.ArrayList<String> ();
    java.util.ArrayList<Integer> collectAmount = new java.util.ArrayList<Integer> ();

        String theCustomersName = customerName();
         int total = 0;
    String addingItems = "Yes";
    while(!addingItems.replace(" ","").equalsIgnoreCase("no")){
        
        String userItems = whatUserBought();
        collectNames.add(userItems);
        int numberOfItems = howManyItems();
        collectAmount.add(numberOfItems);
        int costPerUnit = howMuch();
        collectAmount.add(costPerUnit);
        total =  costPerUnit * numberOfItems;
        collectAmount.add(total);
        addingItems = addMoreToCart();
//        System.out.printf("%7s%7d%3d%7d",userItems, numberOfItems,costPerUnit,total);
    }

        double subTotal = total;
        double discount = 0.08*(float)total;
        double vat = 0.175 * total;

        double billTotal = (total - discount) + vat;
        
        double amountPaid =  amountToPay();
        double balance = amountPaid - billTotal;
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

                    """
                        ,dateTime,cashier(),theCustomersName);

        for(int count = 0; count < collectAmount.size(); count++){

            System.out.printf("""

              ITEM        QTY       PRICE              TOTAL(NGN)  
     
-------------------------------------------------------------------
           %s          %d%n     

            """
                      ,collectNames.get(count), collectAmount.get(count)); 
            
        }

    
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
    System.out.print(" Add more items[Yes/No]?...  ");
    String moreItemsToAdd = input.nextLine();

    return moreItemsToAdd;
    }

    public static double amountToPay(){
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print(" How much is the total bill to pay...  ");
    double whatToPay = input.nextDouble();

    return whatToPay;
    }
    //public static int 
    //public static int cart(String item, int quantity, int price)
    
}
