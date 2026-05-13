import java.time.*;
import java.time.format.DateTimeFormatter;
public class OshoFreePromo{
    public static void main(String [] args){
    
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.println("""

-----------------------WELCOME TO LABKE'S HOUSE OF FASHION-----------------------
    
          Cost Total   |    Discount   |               Promo Code              |
                       |               |                                       |
   Less that N5,000    |      0%       |  STARTER10(not applicable below N5k)  |
   N5,000 - N14,999    |     10%       |             STARTER10                 |
   N15,000 - N29,999   |     20%       |              BIGBOY20                 |
   N30,000 - N29.990   |     35%       |             OSHOFREE35                |
________________________________________________________________________________"""
       );

    System.out.print("How much is the Total cost of Items: ");
    int price = input.nextInt();

    System.out.println();
    
    System.out.print("What is the Promo code for items around the price: ");
    String promoCode = input.next();

     int getDiscount = discountPriceRange(price, promoCode);
     float totalBalance = customerSubTotal(price, promoCode);

     System.out.println();

     System.out.print("How much was payed?... ");

     float amountPayed = input.nextInt();        
     float receipt = amountPayed - totalBalance;


     String dayTime = dateToday();
     String namesOfCashier = names();

    System.out.printf("""
--------------------------------------------------------------------
LABAKE HOUSE NIGERIA                                                 
MAIN BRACH                                                         
LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.              
TEL: 0329828343                                                    
Date: %s                                                        
Cashier: %s                                                        
=============================================================================

              Total Amount = %d


              Promo = %s


              Discount = %d

=============================================================================

              Sub-Total = %.2f

              Paid = %.2f
              
              Change = %.2f

------------------------------------------------------------------------------

             THANK   YOU   FOR   PATRONIZING   LABAKE   NIGERIA

==============================================================================
    """
    ,dayTime,namesOfCashier,price, promoCode, getDiscount, totalBalance, amountPayed, receipt);

}


    public static int discountPriceRange(int price, String promoCode){

       switch(promoCode){

            case "STARTER10": if (price >= 5000 && price < 15000) return 10;
                            break;
            case "BIGBOY20": if (price >= 15000 && price < 30000) return 20;
                            break;
            case "OSHOFREE35": if (price >= 30000) return 35;
                            break;
            default: return 0;
        }
        return 0;
    }

    public static float customerSubTotal(int price, String promoCode){
        int discountPercentage = discountPriceRange(price, promoCode);
        int discount = price * discountPercentage / 100;
        int amountToPay = price - discount;
        return (float)amountToPay;
    }

    public static String dateToday(){

        DateTimeFormatter formatDateNdTime = DateTimeFormatter.ofPattern(" dd-MMM-YY H:mm:ss a");

        LocalDate todaysDate = LocalDate.now();
        LocalTime theCurrentTime = LocalTime.now();

        LocalDateTime todaysDateNdTime = LocalDateTime.of(todaysDate, theCurrentTime);
        
        String dateTime = todaysDateNdTime.format(formatDateNdTime);
    
        return dateTime;
    }

    public static String names(){
    java.util.Random shuffle = new java.util.Random();

    String [] cashierNames = {"Tosin", "CJ", "Grace", "Azzez", "Timo", "Odie"};
    int index = shuffle.nextInt(cashierNames.length);

    return cashierNames[index];
    }
}
