package com.javarush.task.task19.task1905;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA","Ukraine");
        countries.put("RU","Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {

        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() {
            String s = "";
            for (Map.Entry<String, String> m : countries.entrySet()) {
                if (m.getValue().equals(customer.getCountryName()))
                    s = m.getKey();
            }
            return s;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] s = contact.getName().trim().split(",");
            String ss = s[1].trim();
            return ss;
        }

        @Override
        public String getContactLastName() {
            String[] s = contact.getName().trim().split(",");
            return s[0];
        }

        @Override
        public String getDialString() {
            String callTo = "callto://+";
            String n = contact.getPhoneNumber();
            String number = "";
            for (int i = 0; i < n.length(); i++) {
                if (Character.isDigit(n.charAt(i))) {
                    number += n.charAt(i);
                }
            }
            return callTo+number;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}