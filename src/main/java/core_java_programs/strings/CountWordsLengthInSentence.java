package com.example.strings;

public class CountWordsLengthInSentence
{
    public static void main(String[] args) {

        String str="i am working in sapient currently";
        int start=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                System.out.println(str.substring(start,i)+"     "+(i-start));
                start=i+1;
            }
        }
    }
}
