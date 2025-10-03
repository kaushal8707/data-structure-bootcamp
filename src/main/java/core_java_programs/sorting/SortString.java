package com.example.sorting;

public class SortString
{
    public static void main(String[] args) {
        String str="kaushal kumar";
        char chArr[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(chArr[j]<chArr[i])
                {
                    char temp=chArr[j];
                    chArr[j]=chArr[i];
                    chArr[i]=temp;
                }
            }
        }
        System.out.println(new String(chArr));
    }
}
