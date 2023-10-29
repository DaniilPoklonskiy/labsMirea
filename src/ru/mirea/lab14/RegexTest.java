package ru.mirea.lab14;

import java.util.regex.Pattern;

public class RegexTest {
public static void main(String[] args) {
String input = "abcdefghijklmnopqrstuv18340";
String regex = "^[a-z0-9]+$";git

boolean isMatch = Pattern.matches(regex, input);
System.out.println(isMatch); // true
 }
}

