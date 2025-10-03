package com.java.core.selfdeveloped.strings;

import java.util.HashSet;
import java.util.Set;

//https://www.youtube.com/watch?v=jHj13UHURr8

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s="GEEKSFORGEEKS";
		 Set<Character>set=new HashSet<>();
	        int maxLength=0;
	        int r=0;
	        int left=0;
	        for(int right=0;right<s.length();right++){
	           
	            if(!set.contains(s.charAt(right))){
	                set.add(s.charAt(right));
	                maxLength=Math.max(maxLength,right-left+1);
	                r=right;
	                
	            }else{
	                while(s.charAt(left)!=s.charAt(right)){
	                    set.remove(s.charAt(left));
	                    left++;
	                }
	                set.remove(s.charAt(left));left++;
	                set.add(s.charAt(right));
	            }
	        	System.out.println(right-left+1+"   "+s.substring(left, right+1));

	        }

	}

}
