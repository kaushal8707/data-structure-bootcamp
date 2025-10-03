package com.example.strings;
public class ReverseString
{
    public static void main(String[] args)
    {
        String name="kaushal is working in sapient";
        String reverseName=doReverse(name);
        System.out.println("Reverse Name : = "+reverseName);
        System.out.println("********* Check Palindrome***********");
        String str="madaa";
        String temp=str;
        boolean b=checkPalindrome(str,temp) ? true :  false;
        if(b)
        {
            System.out.println(temp+"    i s   P a l i n d r o m e");
        }else
        {
            System.out.println(temp+"    i s   n o t   P a l i n d r o m e");

        }
    }

    private static boolean checkPalindrome(String str,String temp)
    {
        char chArray[]=str.toCharArray();
        for(int i=0,j=chArray.length-1;i<chArray.length/2;i++,j--)
        {
            char tmp=chArray[i];
            chArray[i]=chArray[j];
            chArray[j]=tmp;
        }
        if(temp.equalsIgnoreCase(new String(chArray)))
        {
            return true;
        }
        return false;
    }

    private static String doReverse(String name)
    {
        char chArray[]=name.toCharArray();
        for(int i=0,j=name.length()-1;i<name.length()/2;i++,j--)
        {
            char temp=chArray[i];
            chArray[i]=chArray[j];
            chArray[j]=temp;
        }
        return new String(chArray);
    }
}
