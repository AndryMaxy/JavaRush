package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("name", null);
        params.put("country", null);
        params.put("city", null);
        params.put("age", null);
        System.out.print(getQuery(params));

    }
    public static String getQuery(Map<String, String> params) {
        if (params.size() == 0) {
            return new String();
        }
        int i = 0;
        for (Map.Entry<String, String> map : params.entrySet()) {
            if (map.getKey() == null || map.getValue() == null){
                i++;
            }
            if (i == params.size()) {
                return new String();
            }
        }
        StringBuilder sb = new StringBuilder();

        params.forEach((s1,s2) -> {
            if (s1 != null && s2 != null) {
                sb.append(String.format("%s = '%s' and ",s1,s2));
            }
        });
        String s = sb.toString();
        return s.substring(0,s.length()-5);
    }
}
