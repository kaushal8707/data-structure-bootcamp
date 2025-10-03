package com.java.core.selfdeveloped.strings;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestString {
	public static void main(String[] args) {
        String str="kaushal got a good platform to enhance his skill ";
        Map<String,Integer> wordsLength = new HashMap<String,Integer>();
        int j=0;
        int i=0;
        while(i<str.length()) {
        	if(str.charAt(i)==' ') {
        		wordsLength.put(str.substring(j, i), (i-j));
        		j=i+1;
        	}
    		i++;
        }
        wordsLength.entrySet().stream().sorted(Map.Entry.comparingByValue())
        			.collect(Collectors.toList()).forEach(System.out::println);
	}
}
