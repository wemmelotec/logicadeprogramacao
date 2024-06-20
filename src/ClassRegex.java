import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRegex {
    public static void main(String[] args) {
        String input = "123456789";
        String regex = "\\d+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("A string contém apenas dígitos.");
        } else {
            System.out.println("A string não contém apenas dígitos.");
        }
    }
}
