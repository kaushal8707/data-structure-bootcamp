package com.example.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abbcfda";
        int min = 0, max = str.length() - 1;
        getSubString(str, min, max);
    }

    private static void getSubString(String str, int min, int max)
    {
        int i=0,j=0,maxCount=0;
        Set set=new HashSet();
        while(i<str.length() && j<str.length())
        {
            if(!set.contains(str.charAt(j)))
            {
                set.add(str.charAt(j));
                j++;
                maxCount=Math.max(maxCount,j-i);
            }else
            {
                set.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println(maxCount+str.substring(i,j));
    }
}