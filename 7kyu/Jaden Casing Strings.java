import java.util.*;
import java.util.stream.Collectors;

public class JadenCase {

  public static String toJadenCase(String phrase) {

        String out = null;

        if (phrase == null || phrase == "") return null;
        else {
            String[] str = phrase.split(" ");
            for (int i = 0; i <= str.length - 1; i++) {
                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1, str[i].length());
                out = Arrays.stream(str).collect(Collectors.joining(" "));
            }
        }

        return out;
    }

}
