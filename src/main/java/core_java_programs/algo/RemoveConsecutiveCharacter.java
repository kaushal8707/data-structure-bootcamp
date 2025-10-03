package com.example.algo;

public class RemoveConsecutiveCharacter
{
    public static void main(String[] args) {

       String str="aabbbccdddd";
       char prev=' ';
       String newstr="";
       for(int i=0;i<str.length();i++)
       {
           if(prev!=str.charAt(i))
           {
               prev=str.charAt(i);
               newstr=newstr+str.charAt(i);
           }
       }
        System.out.println(newstr);

    }

}
