package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        String arg = args[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        BufferedReader r = new BufferedReader(new FileReader(filename));
        String s = "";
        String html = "";
        while ((s = r.readLine()) != null) {
            html +=s;
        }
        r.close();
        Document d = Jsoup.parse(html, "", Parser.xmlParser());
        Elements e = d.select(arg);
        System.out.println(e.toString());


    }
}
