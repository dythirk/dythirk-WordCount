
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int spaces = 0;
        for (int i = 0; i < in.length(); i++){
            if (in.charAt(i) == " ")
                spaces++;
        }
        if (spaces == 0)
            return 0;
        else
            return spaces+1;
    }
}
