package ru.mirea.lab2;
import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author k1 = new Author("name","email",'g');
        k1.setName("Daniil\n");
        k1.setEmail("mr.sharko2015@mail.ru\n");
        k1.setGender('m');
        System.out.println("name:"+ k1.getName()+"email:" + k1.getEmail() + "gender:" + k1.getGender());
    }
}
