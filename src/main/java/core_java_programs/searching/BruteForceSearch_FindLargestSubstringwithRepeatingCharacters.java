package com.example.searching;

import java.util.HashSet;
import java.util.Set;

public class BruteForceSearch_FindLargestSubstringwithRepeatingCharacters
{
    public static void main(String[] args) {

        String str="abcabcdbcdfegab";
        int min=0,max=str.length()-1;
        Set<Character> set=new HashSet<Character>();
        int i=0,j=0,maxCount=0;
        while(i<max && j<max)
        {
            if(!set.contains(str.charAt(j)))
            {
                set.add(str.charAt(j));
                j++;
                maxCount=Math.max(maxCount,(j-i));
            }else
            {
                set.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println(maxCount+"    "+str.substring(i,j));
    }
}
