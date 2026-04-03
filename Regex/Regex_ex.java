import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_ex{
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+"); //pattern is a compile regex.it stores the regex rule
        Matcher matcher = pattern.matcher("12345"); // matcher check input text against the regex.it perform match operation.
        
        if(matcher.matches()){
            System.out.println("Only digits.");
        }else{
            System.out.println("Not only digits.");
        }
    }
}