import java.time.*;
import java.time.format.DateTimeFormatter;
public class NumberOfDaysDisplay{
    public static void main(String[] args){
    DateTimeFormatter justYearFormat = DateTimeFormatter.ofPattern("yyyy");

    int year = 2014;
    numberOfDaysInAYear(year);
    int count = year;
        for(; year <= 2034; year++){
    LocalDate days = LocalDate.of(year,1,1);
    System.out.printf("%s ----> %5s days%n", days.format(justYearFormat), numberOfDaysInAYear(year));
        }
    
    }

    public static int numberOfDaysInAYear(int year){
    
        LocalDate days = LocalDate.of(year,1,1);
        
        //int count = year;
        //for(; year <= 2034; year++){
          //  days = LocalDate.of(year,1,1);
        //}
        return days.lengthOfYear();
            //System.out.printf("" days
    }
}
