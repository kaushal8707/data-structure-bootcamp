package com.java.core.selfdeveloped.strings;

public class CountWord_and_ItsLengthInSentence {

	public static void main(String[] args) {
        String name="sapient is the best organization";
        name=name+" ";
        int j=0;
        for(int i=0;i<name.length();i++) {
        	if(name.charAt(i)==' ') {
        		System.out.println(name.substring(j, i)+" "+(i-j));
        		j=i+1;
        	}
        }
       

	}

}
