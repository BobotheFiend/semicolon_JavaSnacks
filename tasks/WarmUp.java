public class WarmUp{
    public static void main(String[] nnamdi){
        String word = "Cohort     30 is called Horizons";
        System.out.println(getFirstLetter(word));
        
        String secondWord = "Hello   I need  a ffriend  t    Musa";
        System.out.println(getFirstLetter(secondWord));
        


    }
        static String getFirstLetter(String words){
            String newWord = "";
            String [] splitWord = words.split(" ");
            
            for(String letter : splitWord){
                String gettingWords = letter.strip();
                String [] getLetter = gettingWords.split("");
                int index = 0;
                while(index < getLetter.length){
                    if (getLetter[index] == " "){
                        index++;
                    }
                    else{
                        newWord += getLetter[index];
                        index = getLetter.length;
                    }
                }
            }
            String finalWord = newWord;

            return finalWord;
        }

}
