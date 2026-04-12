public class TaskSeven{
    public static void main(String[] args){

    int i = 4;
    int result = 1;
    for (; i<= 10; i++){
    int sum = 0;
    if ( i % 4 == 0) 
    for (; result <=5; result++)
     sum += (int)Math.pow(i,result);
    //System.out.printf("%d %d %d %d %d ", i*1, i*i+i*1, i*i*i+(i*i+i*1), i*i*i*i+(i*i*i+(i*i+i*1)), i*i*i*i*i+(i*i*i*i+(i*i*i+(i*i+i*1)))," %n");  
     System.out.printf("%d", sum);
     }
    
    }
}
