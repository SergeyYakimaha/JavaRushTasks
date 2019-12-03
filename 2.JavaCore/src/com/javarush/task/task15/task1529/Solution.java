package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufferedReader.readLine();

            if (str.equals("helicopter")) {
                result = new Helicopter();
            }
            if (str.equals("plane")) {
                result = new Plane();
            }

            bufferedReader.close();
        } catch (IOException e) {
        }
    }
}
