package com.example.algo;
//find the nonrepeated maximum length of substring

import java.util.HashSet;
import java.util.Set;

public class BruteForceSearchAlgo
{


    private static String getNonRepeatedSubstring(String str, int min, int max)
    {
        int i=0,j=0;
        int maxcount=0;
        Set set=new HashSet<Character>();
        while(i<max && j<max)
        {
            if(!set.contains(str.charAt(j)))
            {
                set.add(str.charAt(j));
                j++;
                maxcount=Math.max(maxcount,(j-i));
            }else
            {
                set.remove(str.charAt(i));
                i++;
            }
        }
        return maxcount+" "+i+" "+j;
    }


    public static void main(String[] args) {
        String str="abcbcdefbcaf";
        int min=0;
        int max=str.length()-1;
        String result=getNonRepeatedSubstring(str,min,max);
        String arr[]=result.split(" ");
        System.out.println("Length= "+arr[0]+"Substring= "+str.substring(new Integer(arr[1]),new Integer(arr[2])));

    }
}
