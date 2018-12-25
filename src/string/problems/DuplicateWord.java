package string.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
Set<String>duplicates= duplicatewords(st);
        System.out.println("input : "+st);
        System.out.println("output :  "+duplicates);
    }
public static Set<String> duplicatewords(String input) {
    if (input == null || input.isEmpty()) {
        return Collections.emptySet();
    }
    Set<String> duplicates = new HashSet<>();
    String[] words = input.split(" ");
    double length = (double) input.length()/words.length;
    System.out.println("average length of word is : "+length);
    Set<String> set = new HashSet<>();
    ArrayList<String> arrayList = new ArrayList<>();
    for (String word : words){
        arrayList.add(word);
        if(!set.add(word)){duplicates.add(word);}
    }
    for (String count : arrayList){
        if(Collections.frequency(arrayList, count)>1){
            System.out.println("Number of occurence of : "+count+" is: "+Collections.frequency(arrayList,count));
        }

    }

    return  duplicates;
    }

}
