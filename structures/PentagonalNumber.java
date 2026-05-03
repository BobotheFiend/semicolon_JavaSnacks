public class PentagonalNumber{
    public static void main(String[] args){

        //java.util.Scanner input = new java.util.Scanner(System.in);
        
        getPentagonalNumber(100);

    }

    public static int getPentagonalNumber(int n){

        int count;
        int nth = 0;
        for(count = 1; count <= n; count++){
          nth = (count*((3*count) -1))/2;  
            if (count % 10 == 0)  System.out.printf("%n");

            System.out.printf("%7d", nth);
        }
        return nth;
    }

    
}
