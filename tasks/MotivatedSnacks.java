public class MotivatedSnacks{
    public static void main(String[] args){
        String words = "Hello --90909009&&^^^  World";
        MotivatedSnacks getMethod = new MotivatedSnacks();
        System.out.println(java.util.Arrays.toString(getMethod.getWords(words)));

        String wordss = "      \t\t        ";
        System.out.println(getMethod.getAnswer(wordss));
    }
    

    public int [] getWords(String words){
        int vowelCount = 0;
        int consonantCount = 0;
        
        for(int count = 0; count < words.length(); count++){
            char letter = words.charAt(count);
//            String word = letter + "";

            switch(Character.toLowerCase(letter)){
                case 'a': 
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default: if (!Character.isDigit(letter) && Character.isLetter(letter)) consonantCount++;
            }
        }
        return new int [] {vowelCount, consonantCount};
    }


    public boolean getAnswer(String words){
        
        String items = "";
        for(int count = 0; count < words.length(); count++){
            char letter = words.charAt(count);
            items = letter + "";
        
        }

        if (items.isEmpty()) return true;
        else return false;
    }


}
