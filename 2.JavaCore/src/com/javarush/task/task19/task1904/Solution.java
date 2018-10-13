package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(new PersonScannerAdapter(new Scanner(new File("F:\\txt.txt"))).read());
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
//            fileScanner = new Scanner(new File(""));
            SimpleDateFormat sd = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            String s = "";
           // while (filescanner.hasNextLine()) {
                s = fileScanner.nextLine();
           // }
            String[] split = s.split(" ");
            String ln = split[0];
            String fn = split[1];
            String mn = split[2];
            Date dr = null;
            try {
                dr = sd.parse(split[3] + " " + split[4] + " " + split[5]);
            } catch (ParseException e) { }
            return new Person(fn,mn,ln,dr);
            //return new Person(s);



        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
