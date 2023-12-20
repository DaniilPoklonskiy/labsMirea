package ru.mirea.lab28;
//HashSet ---->> Treeset

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(7);
        hashSet.add(3);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
