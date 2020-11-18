package Problem9;
import java.util.regex.Pattern;
public class SentenceMatch {
    public static boolean checkSentence(String input){

        return Pattern.matches("^[A-Z].*?[.]$",input);
    }
    public static void main(String args[]){
        System.out.println(checkSentence("abc."));
        System.out.println(checkSentence("Hello everyone."));
    }

}
