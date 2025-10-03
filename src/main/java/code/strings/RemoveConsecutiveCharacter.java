package com.java.core.selfdeveloped.strings;

public class RemoveConsecutiveCharacter {

	public static void main(String[] args) {
		String str="aaabbcccddeeee";
		char lastIndex=' ';
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1) && lastIndex!=str.charAt(i)) {
				System.out.print(str.charAt(i)+" ");
				lastIndex=str.charAt(i);
			}
		}
		
	}

}
