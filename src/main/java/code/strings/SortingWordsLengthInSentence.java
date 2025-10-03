package com.java.core.selfdeveloped.strings;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingWordsLengthInSentence {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
        String str="kaushal got a good platform to enhance his skill ";
        char arr[]=str.toCharArray();
        int j=0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==' ') {
        		map.put(str.substring(j, i),(i-j));
        		j=i+1;
        	}
        }
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
        	.collect(Collectors.toList()).forEach(System.out::println);
        			

	}

}
