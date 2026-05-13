import java.util.Arrays;

public class DuplicateNumber{

    public static void main(String [] args){


        int [] collections = {22,44,55,66,33,22,44,3,4,2,4,3,1,2,3,6};
        int index = 0;
        int count = 0;
        for(; count < collections.length; count++){
            int indexes;
            for(indexes = 0; indexes < index; indexes++){
                if (collections[indexes] == collections[count]){
                     break;
                }
            }
            
            if (indexes == index){
                collections[index++] = collections[count];
            }
        }    
        int indexCount = 0;
        for(; indexCount < index; indexCount++){
            System.out.print(collections[indexCount] + " ");
        }

        System.out.println(Arrays.toString(collections));
    }
}

//if the count = 0 it uses that to check the array at index zero, if the array at index 0 holds the element 22, you will want to now check if that number appears more than once in the array, so you create another loop than runs throught it, so you create a variable and use it to check through the array index
//
//the inner cloop starts and counts at 0 and uses the element that the outter loop has, array[inneerloop++] = array[outterloop]; so when the inner loop runs throught the first index at 0, it holds the elemnt 22, is 22 equals to 22 yes it ends cause the inner loop checks through the condition of if the inner loop is , than the index variable out side; so 0 is only checks once and when it wants to increament it ends... then the if statement outside the loop states that if the inner loop count didnt  break its count is == to the index count which is currently both at 0 it adds 22 to the first index, 
//
//the second run comes, it checks when the outter loop is at 1, index 1, then the inner loop checks round, startoing from 0, when count is 1; so index 0 and index 1, is 22 == 44, no is is 44 == 44 yes, the loop ends the condition is false it didnt break,so the array at index 1 == 44;
//
//the third comes, at index 2 , the inner loop starts from index 0 and it checks, 22 != 55, it increaments, 44 != 55, 55 == 55, the loop reaches its condition, then it stops at 2 ==2 so it adds 55 to the array, 
//
//fourth one ask increaments, where it is 66, 22 != 66 ...  66 == 66, loops ends, new array adds 66
//
//fifth = 33, strats, 22 != 33, 44 != 33, 55!=33 66!=33, 33==33 the loopcondition ends, it adds 33 to the array
//
//sixth = 22, starts at 0, is 22 == 22 yes, it breaks, is 0 = 5 no, it doesnt add
//seventh = 44, starts at 0, 22 != 44, 44 == 44 it breaks, 2 == 5 no!, it doesnt add
//eight = 3, start = 0, is 22 != 3, 44,55,66,33, != 3, 3 == 3, index 5 == 5, it adds 3.... ands so o...
