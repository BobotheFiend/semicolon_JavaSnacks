import java.util.Scanner;

public class TaskEleven{

    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("""

        "Welocome to the American population Census!!!

"The following years contain a population census for each year! 

        "2027" "2028" "2029" "2030" "2031"

        """);
        

        float acceleration = inputNum.nextFloat();
        int population = 312032486;
        int birthRate = 31536000/7;
        int deathRate = 31536000/13;
        int immigrationRate = 31536000/45;
        int total = ((birthRate-deathRate)+immigrationRate);
        
        int year2027 = population+total;        
        System.out.printf("The current population in the year 2027 is %d", year2027);

        int year2028 = year2027+total;
        System.out.printf("The current population in the year 2028 is %d", year2028);

        int year2029 = year2028+total;
        System.out.printf("The current population in the year 2029 is %d", year2029);

        int year2030 = year2029+total;
        System.out.printf("The current population in the year 2030 is %d", year2030);
       
        int year2031 = year2030+total;
        System.out.printf("The current population in the year 2031 is %d", year2031);
    
        System.out.print("Select a year, 2027, 2028, 2029, 2030, 2031 : ");
        double 2027 = inputNum.nextDouble();
        double year2 = inputNum.nextDouble(year2028);
        double year3 = inputNum.nextDouble(year2029);
        double year4 = inputNum.nextDouble(year2030);
        double year5 = inputNum.nextFDouble(year2031);
    }
}
