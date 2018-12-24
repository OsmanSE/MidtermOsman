package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String s1="madam", s2 = "";
        for(int i=s1.length()-1;i>=0;i--) {
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
        if(s1.equalsIgnoreCase(s2)==true)
        {
            System.out.println(s1+ " is a palindrome.");
        }
        else {System.out.println(s1+ " is NOT a palindrome.");}

    }
}
