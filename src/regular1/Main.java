package regular1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1.	Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
//        – пример правильных выражений: 25.98 USD.
//        – пример неправильных выражений: 44 ERR, 0.004 EU.


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rgx = "\\d+[.]\\d{2}\\s(USD|EU|RUB)";
        Pattern pt = Pattern.compile(rgx);
        Matcher mt = pt.matcher(s);
        while (mt.find()) {
            System.out.println("Список цен: " + mt.group());
        }
    }
}
