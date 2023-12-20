package ru.mirea.lab28;
import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be specified in the arguments of the command line*/
    class Task3 {
        public static Map<Double, Integer> hashMap = new HashMap<Double,Integer>();

        public static class MyHashMap {
            public static void main (String[] args){
                Integer n = 0;
                for(double i = 0.0; i <= 10.0; ++i) {
                    hashMap.put(i, n);
                    n = n + 1;
                }

                for(Map.Entry<Double, Integer> entry : hashMap.entrySet()){
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }
        }
}
