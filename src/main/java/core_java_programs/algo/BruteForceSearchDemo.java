package com.example.algo;

import java.util.HashSet;
import java.util.Set;

public class BruteForceSearchDemo
{
    public static void main(String[] args) {
        String str="abcbcdefbcaf";
        int min=0;
        Set<Character> set=new HashSet<Character>();
        int i=0,j=0,maxCount=0;
        while(i<str.length()-1 && j<str.length()-1)
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
        System.out.println(maxCount+"   "+str.substring(i,j)+"   "+i+"   "+j);
    }
}
