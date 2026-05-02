
public class ArraysTicTacToe{
    public static void main(String[] args){


        char [][] shar;
        shar = new char [3][3];
        shar[0][0] = 'X';
        shar[0][1] = 'O';
        shar[0][2] = 'X';
        shar[1][0] = 'O';
        shar[1][1] = 'O';
        shar[1][2] = 'O';
        shar[2][0] = 'X';
        shar[2][1] = 'X';
        shar[2][2] = 'O';

        //System.out.print(scores);

        int out = 0;
        for (; out < shar.length; out++){
            for(int thirdOut = 0; thirdOut < shar[0].length; thirdOut++){
            if (shar[out][thirdOut] == 'X') System.out.print(1 + " ");
            else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
