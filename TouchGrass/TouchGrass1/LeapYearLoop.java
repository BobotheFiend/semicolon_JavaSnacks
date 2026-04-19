public class LeapYearLoop{
    public static void main(String[] args){


        int year = 2000;
     
        for (;year <= 2100; year++){

        if (year % 4 == 0 || year % 400 == 0)
            System.out.printf("%d%s%n",year, " is a Leap Year!");
        }
    }
}
