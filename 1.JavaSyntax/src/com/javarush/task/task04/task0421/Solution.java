package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        int name1_l = name1.length();
        int name2_l = name2.length();

        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else
            if (name1_l == name2_l)
                System.out.println("Длины имен равны");

    }
}
