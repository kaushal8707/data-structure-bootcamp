package com.example.algo;

public class PermutationSeries
{

    private static void getPermutattion(String str, String result)
    {
        if(str.length()==0)
        {
            System.out.println(result);
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);
            getPermutattion(res,ch+result);
        }
    }

    public static void main(String[] args) {
        String str="abcd";
        String result="";
        getPermutattion(str,result);
    }
}
