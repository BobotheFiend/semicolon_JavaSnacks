
public class MatrixAndTarget{
    public static void main(String... args){

        int [][] matrix = {{2,5,8}, {2,1,2}, {3,4,7}, {5, 3, 9}};

        System.out.println(java.util.Arrays.toString(getTheAnswer(matrix, 17)));

    }
    public static int [] getTheAnswer(int [][] collections, int target){

        for(int row = 0; row < collections.length; row++){
            
            int total = 0;
            int inner;
            for(inner = 0;inner < collections[0].length; inner++){
                total+=collections[row][inner];
            }
            if(total == target)
                return collections[row];
//                return new int [] {collections[row][0], collections[row][1], collections[row][2]};
            
        }

        int [] answer = new int [collections.length];
        for(int column = 0; column < collections[0].length; column++){

            int total = 0;
            for(int inner = 0; inner < collections.length; inner++){
                total+=collections[inner][column];
                answer[inner] = collections[inner][column];
            }

            if (total == target)
                return answer;
//                return new int [] {collections[0][column], collections[1][column], collections[2][column]};
        }

    
        int [] verticalAnswer = new int [collections.length];
        int total = 0;
        for(int vertical = 0; vertical < collections.length; vertical++){
            
            total += collections[vertical][vertical];
            verticalAnswer[vertical] = collections[vertical][vertical];
        }
        if(total ==  target){
            return verticalAnswer;
//            return new int [] {collections[0][0], collections[1][1], collections[2][2]};
        }            

//        if ((collections[0][0] + collections[1][1] + collections[2][2]) == target){
//            return new int [] {collections[0][0], collections[1][1], collections[2][2]};
//        }

        int [] answerFromRight = new int [collections.length];
        int swappedTotal = 0;
        for(int verticalRight = 0; verticalRight < collections.length; verticalRight++){
            total += collections[verticalRight][collections.length-1 -verticalRight];
            answerFromRight[verticalRight] = collections[verticalRight][collections.length-1 -verticalRight];
        }
        if(swappedTotal == target){
            return answerFromRight;
        }
//            if((collections[0][2] + collections[1][1] + collections[2][0]) == target){
//              return new int [] {collections[0][2], collections[1][1], collections[2][0]};
//              }
        else
            return new int [] {collections.length};
    }

}
