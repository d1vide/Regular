package regular2;

//	2.	Написать регулярное выражение, определяющее является ли данная строка строкой
// "abcdefghijklmnopqrstuv18340" или нет.
//a)	пример правильных выражений: abcdefghijklmnopqrstuv18340
//b)	пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuv18340";
        String rgx = "^abcdefghijklmnopqrstuv18340$";
        Pattern pt = Pattern.compile(rgx);
        Matcher mt = pt.matcher(s);
        String str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(s + ": " + mt.matches());


    }
}
