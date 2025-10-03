package com.example.algo;
public class PermutationPro
{
    public static void main(String[] args) {

        String str="abc";
        String result="";
        doArrangements(str,result);
    }

    private static void doArrangements(String str,String result)
    {
        if(str.length()==0)
        {
            System.out.println(result);
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);
            doArrangements(res,result+ch);
        }
    }
}
