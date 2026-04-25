
public class CountdownToaThousand{
    public static void main(String[] args){

        int count = 0;
        
        for(count = 0;count <= 9;count++){
            int hundredth = 0;
            for(hundredth = 0; hundredth <= 9; hundredth++){
                int tens = 0;
                for(tens = 0; tens <= 9; tens++){
                    int units = 0;
                    for(units = 0;units <= 9; units++){
                        System.out.printf("%d%d%d%d%n",count,hundredth,tens,units);
                    }
                }
            }
        }
    }
}
