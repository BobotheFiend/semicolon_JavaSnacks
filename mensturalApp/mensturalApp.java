import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class mensturalApp {
    public static void main(String[] args){

    java.util.Scanner inputCollector = new java.util.Scanner(System.in);
    DateTimeFormatter formatToDate = DateTimeFormatter.ofPattern(" EEE, MMMM d, yyyy");
    //DateTimeFormatter formatForTheLocalDate = DateTimeFormatter.ofPattern(" dd/MM/yyyy");
    System.out.print(""" 
-------------------------------------------------------------------------------
      Hello! Welcome to the MensturalApp Calculator.
-------------------------------------------------------------------------------
               May I know your Name:  """
                                                );
    String name = inputCollector.nextLine();

    System.out.printf("""
__________________________________________________________________________ 
          
           WELCOME TO YOUR MESTURAL CALANEDER APPLICATION [*%s*]
          ___________________________________________________               %n"""
                           ,name  );

    System.out.print("When was the last time you saw you period(i.e Year-Month-Date 2026-04-26): ");
    String lastMensturalPeriod = inputCollector.nextLine();
    LocalDate ofLastPeriodDate = LocalDate.parse(lastMensturalPeriod);

    System.out.print("How long does it take until your next cycle starts: ");
    int cycleLength = inputCollector.nextInt();

    System.out.print("How many days does the bleeding last: ");
    int bleedingPeriod = inputCollector.nextInt();

    System.out.println();


    LocalDate headsUp = nextPeriodOccurence(ofLastPeriodDate,cycleLength);
    System.out.printf("Hello %s, Here's a Heads Up your next Period Occurence is on %s be safe :) %n", name, headsUp.format(formatToDate));

    LocalDate ovulation = ovulationDate (ofLastPeriodDate, cycleLength);
    System.out.printf("Hello %s, Your Ovulation Day is on %s :> %n", name, ovulation.format(formatToDate));

    LocalDate yourFlowDate = endOfPeriod (ofLastPeriodDate, bleedingPeriod);
    System.out.printf("Hello %s your flow starts from %s and ends on %s :( %n", name, ofLastPeriodDate.format(formatToDate),yourFlowDate.format(formatToDate));

    LocalDate fertileStartDay = fertilePeriodStart (ofLastPeriodDate, cycleLength);
    LocalDate fertileEndDay = fertilePeriodEnd(ofLastPeriodDate, cycleLength);
    System.out.printf("Hello %s from %s - %s you're most fertile ;> %n", name, fertileStartDay.format(formatToDate),fertileEndDay.format(formatToDate));


  
 LocalDate firstEndOfBleeding = safePeriodAfterBleedingStarts(ofLastPeriodDate, bleedingPeriod);
    LocalDate lastDayOfNoBleeding = safePeriodAfterBleedingEnds(ofLastPeriodDate, cycleLength);
    System.out.printf("Hello %s from %s - %s your period ends and youre in the safe zone' ;) %n'", name, firstEndOfBleeding.format(formatToDate),lastDayOfNoBleeding.format(formatToDate));


 LocalDate firstDayEndOfFertility = startOfSafePeriodAfterFertilty(ofLastPeriodDate, cycleLength);
    LocalDate lastDayEndOfFertility = endOfSafePeriodAfterFertilty(ofLastPeriodDate, cycleLength);
    System.out.printf("Hello %s from %s - %s you're are not fertile ;o %n'", name, firstDayEndOfFertility.format(formatToDate),lastDayEndOfFertility.format(formatToDate));
    
    }

    public static LocalDate nextPeriodOccurence(LocalDate previousDate, int howLongitTakesBeforeItStarts){
    
      return  previousDate.plusDays(howLongitTakesBeforeItStarts);
        
    }

    public static LocalDate ovulationDate (LocalDate previousDate, int howLongItTakesBeforeItStarts){
        return previousDate.plusDays(howLongItTakesBeforeItStarts - 14);
        }

    public static LocalDate fertilePeriodStart(LocalDate previousDate,int howLongItTakesBeforeItStarts){
        return ovulationDate (previousDate, howLongItTakesBeforeItStarts).minusDays(5);
        }

    public static LocalDate fertilePeriodEnd(LocalDate previousDate, int howLongItTakesBeforeItStarts){
        return  previousDate.plusDays(howLongItTakesBeforeItStarts -14);
        }

    public static LocalDate endOfPeriod (LocalDate previousDate, int periodTime){
        return  previousDate.plusDays(periodTime -1);
     
    }
    
    public static LocalDate safePeriodAfterBleedingStarts(LocalDate previousDate, int periodTime){
        return endOfPeriod (previousDate, periodTime).plusDays(1);
         
    }
    
    public static LocalDate safePeriodAfterBleedingEnds(LocalDate previousDate, int howLongItTakesBeforeItStarts){
       return  fertilePeriodStart(previousDate,howLongItTakesBeforeItStarts).minusDays(1);
         
    }
    
    public static LocalDate startOfSafePeriodAfterFertilty(LocalDate previousDate, int howLongItTakesBeforeItStarts){
        return fertilePeriodEnd(previousDate, howLongItTakesBeforeItStarts).plusDays(1);
       
    }

    public static LocalDate endOfSafePeriodAfterFertilty(LocalDate previousDate, int howLongItTakesBeforeItStarts){
        return nextPeriodOccurence(previousDate, howLongItTakesBeforeItStarts).minusDays(1);
    }
}
