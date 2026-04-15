public class TaskSix{
    public static void main(String[] args){

    int i = 1;
    for (; i<= 10; i++)
    
    if ( i % 4 == 0) 
    for (int result = 1; result <=5; result++)
    //System.out.printf("%d %d %d %d %d ", i*1, i*i, i*i*i, i*i*i*i, i*i*i*i*i);   
    System.out.print((int)Math.pow(i,result) + " ");
    
    }
}
