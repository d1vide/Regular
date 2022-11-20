package regular4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "dgfdg@yandex.com";
        String rgx = "\\w{3,}@\\w+.\\w{2,3}";
        Pattern pt = Pattern.compile(rgx);
        Matcher mt = pt.matcher(s);
        System.out.println(s + ":" + mt.matches());
    }
}
