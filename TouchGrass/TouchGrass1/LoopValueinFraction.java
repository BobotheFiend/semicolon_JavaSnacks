public class LoopValueinFraction{
    public static void main(String[] args){


        int numerator = 1;
        int denominator = 3;
        double sum = 0;
        double count = 0;
     
        for (;count <= 48; count++){
         sum += numerator / denominator;
         numerator += 2;
         denominator += 2;
            System.out.printf("%d%s%d%s%.2f%n", numerator, "/", denominator, " = ", sum);
        }
      System.out.printf("%s%.2f%n", "The sum total is = ", sum);
    }
}
