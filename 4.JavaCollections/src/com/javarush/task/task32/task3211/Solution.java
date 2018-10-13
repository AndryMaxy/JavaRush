package com.javarush.task.task32.task3211;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;

/* 
Целостность информации
*/

public class Solution {
    public static void main(String... args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(new String("test string"));
        oos.flush();
        System.out.println(compareMD5(bos, "5a47d12a2e3f9fecf2d9ba1fd98152eb")); //true

    }

    public static boolean compareMD5(ByteArrayOutputStream byteArrayOutputStream, String md5) throws Exception {

        if (md5 == null || md5.trim().length() == 0) {
            return false;
        }
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(byteArrayOutputStream.toByteArray());
        byte[] q = md.digest();
        String s = new BigInteger(1,q).toString(16);
        while (s.length() < 32) {
            s = "0" + s;
        }
        System.out.println(s);
        System.out.println(Arrays.toString(md5.getBytes()));
        System.out.println(Arrays.toString(s.getBytes()));
        if (s.compareTo(md5) == 0) {
            return true;
        }
        return false;
    }
}
