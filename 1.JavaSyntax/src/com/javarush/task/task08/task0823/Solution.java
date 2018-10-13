package com.javarush.task.task08.task0823;

import javafx.beans.binding.StringBinding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
     //   String ss = s.trim();
        char[] chars = s.toCharArray();
      /*  StringBuffer sBuf = new StringBuffer(s);
        StringBuilder sBuild = new StringBuilder();
        String str = "";*/
        char c = ' ';
        for (int i = 0; i < chars.length-1; i++) {
            if (i == 0 && chars[i] != c) {
                char k = Character.toUpperCase(chars[i]);
                chars[i] = k;
            }
            if (chars[i] == c) {
                //System.out.println("sosat");
                char k = Character.toUpperCase(chars[i+1]);
                chars[i+1] = k;
             //   sBuild.append(chars[i+1])
             //   sBuild.setCharAt(l,Character.toUpperCase(sBuild.charAt(l)));
              //  str = str.concat(S.substring(0,1).toUpperCase() + S.CharAt(i).substring(1) + " ");
            }
          //  str = str.concat(gg[i].substring(0,1).toUpperCase() + gg[i].substring(1) + " ");
           // stringBuilder.append(str);
        }
        String gg = new String(chars);
      //  System.out.println(stringBuilder.append(str));
        System.out.println(gg);
        //напишите тут ваш код
    }
}
