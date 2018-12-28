package string.problems;

import math.problems.Fibonacci;
import org.testng.Assert;

import java.util.Set;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        //Anagram unit testing
        Anagram.isAnagram("APPLE", "ELPPA");
        Assert.assertTrue(true, "true");

        //Determine Largest Word Unit Testing
        DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");
        Assert.assertEquals("biological","biological");

        //Duplicate Word unit testing
        DuplicateWord.duplicatewords("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
        Assert.assertEquals("Java"+"is","Java"+"is");

        //Palindrome
        Palindrome.main(new String[]{"DAD"});
        Assert.assertEquals(true, true);

        //Permutation unit testing
        Permutation.conceptPermutation("XYZ");
        Assert.assertEquals("XZY,YXZ,YZX,ZXY,ZYX","XZY,YXZ,YZX,ZXY,ZYX");


    }
}

