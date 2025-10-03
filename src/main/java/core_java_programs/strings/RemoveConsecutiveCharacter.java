package com.example.strings;

public class RemoveConsecutiveCharacter
{
    public static void main(String[] args) {

        String str="aaabbcccddeeee";
        char ch=' ';
        String newString="";
        for(int i=0;i<str.length();i++)
        {
            if(ch!=str.charAt(i))
            {
                ch=str.charAt(i);
                newString+=str.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
