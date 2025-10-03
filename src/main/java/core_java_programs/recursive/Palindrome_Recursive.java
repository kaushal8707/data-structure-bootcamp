package com.example.recursive;

public class Palindrome_Recursive
{
    public static void main(String[] args) {
        String str="abba";
        boolean flag=checkCondition(str);
        if(flag)
        {
            System.out.println(str+" is a Palindrome");
        }else{
            System.out.println(str+" is not a Palindrome'");
        }
    }

    private static boolean checkCondition(String str)
    {
        if(str.length()==0 || str.length()==1)
            return true;

        if(str.charAt(0)==str.charAt(str.length()-1))
            return checkCondition(str.substring(1,str.length()-1));

        return false;
    }
}
