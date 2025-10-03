package com.example.recursive;

public class PalindromeTest
{
    public static void main(String[] args) {

        String str="madam";
        boolean status=checkPalindromeCondition(str);
        if(status)
        {
            System.out.println(str+" is Palindrome");
        }else
        {
            System.out.println(str+" is not a palindrome");
        }
    }

    private static boolean checkPalindromeCondition(String str)
    {
     if(str.length()==0 || str.length()==1)
     {
         return true;
     }
     if(str.charAt(0)==str.charAt(str.length()-1))
     {
         return checkPalindromeCondition(str.substring(1,str.length()-1));
     }
     return false;
    }
}
