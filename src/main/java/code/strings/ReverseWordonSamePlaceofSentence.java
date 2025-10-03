package com.java.core.selfdeveloped.strings;

public class ReverseWordonSamePlaceofSentence 
{
	public static void main(String[] args) {
		String sentence="Sapient is the Best Organization Compare to other Org";
		sentence=sentence+" ";
		int j=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				
				for(int k=i;k>=j;k--) {
					System.out.print(sentence.charAt(k)); 
				}
				j=i+1;
			}
		}
	}
}
