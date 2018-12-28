package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Anagram an = new Anagram();
        String s1 = "ARMY";
        String s2 = "Mary";
        System.out.println("Is " + s1 + " and " + s2 + " are anagram :" + an.isAnagram(s1, s2));

    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        s1.toUpperCase();
        s2.toUpperCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);


    }
}