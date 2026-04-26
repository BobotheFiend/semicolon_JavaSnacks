
public class BackToSender{
    //public static void main (Strings[] args){

      public static int ridersPayment(int successfulDeliveries){
            int amountPerParcel = 0;
            int basePay = 5000;
            int wageForTheDay = 0;

                if (successfulDeliveries < 50){
                amountPerParcel = 160;
                successfulDeliveries *= amountPerParcel;
                wageForTheDay = successfulDeliveries + 5000;
                
                }else if (successfulDeliveries >= 50 && successfulDeliveries <= 59){
                amountPerParcel = 200;
                successfulDeliveries *= amountPerParcel;
                wageForTheDay = successfulDeliveries + 5000;
                }
                 
                
                else if (successfulDeliveries >= 60 && successfulDeliveries <= 69){
                amountPerParcel = 250;
                successfulDeliveries *= amountPerParcel;
                wageForTheDay = successfulDeliveries + 5000;
                }
                        
                else if (successfulDeliveries >= 70){
                amountPerParcel = 500;
                successfulDeliveries *= amountPerParcel;
                wageForTheDay = successfulDeliveries + 5000;
                }
                return wageForTheDay;
           }
                   
                
    }




    //}

