package ru.mirea.lab25;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task2 {
    public static boolean isThatStr(String s){
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }

    public static boolean hasDigitPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }

    public static boolean isDate(String s){
        Matcher m = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+"
                //"(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)])"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }
    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }

    public static void main(String[] args) {
        //ex2
        System.out.println("Strring");
        System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatStr("abcdefghijklmnoasdfaspqrstuv18340"));
        System.out.println();
        //ex3
        System.out.println("RUB EU USD");
        System.out.println(findRubEurUsd("25.98 USD"));
        System.out.println(findRubEurUsd("44 ERR"));
        System.out.println(findRubEurUsd("0.004 EU"));
        System.out.println();
        //ex4
        System.out.println("+");
        System.out.println(hasDigitPlus("(1+8)-9/4"));
        System.out.println(hasDigitPlus("6/5-2*9"));
        System.out.println();
        //ex5
        System.out.println("DATE");
        System.out.println(isDate("30/04/2003"));
        System.out.println(isDate("29/02/2000"));
        System.out.println(isDate("29/02/2001"));
        System.out.println(isDate("30/04/2003"));
        System.out.println(isDate("29/02/2001"));
        System.out.println(isDate("01/01/2003"));
        //ex6
        System.out.println("MAIL");
        System.out.println();
        System.out.println(checkEmail("user@example.com"));
        System.out.println(checkEmail("root@localhost"));
        System.out.println(checkEmail("myhost@@@com.ru"));
        System.out.println(checkEmail("@my.ru"));
        System.out.println(checkEmail("Julia String"));
        //ex7
        System.out.println("PASSWORD");
        System.out.println();
        System.out.println(checkPass("F032_Password"));
        System.out.println(checkPass("TrySpy1"));
        System.out.println(checkPass("smart_pass"));
        System.out.println(checkPass("A007"));
    }
}
