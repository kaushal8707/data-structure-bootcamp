package com.java.core.selfdeveloped.strings;

public class RepeatedandNonRepeatedCharacter {

	public static void main(String[] args) {
        String str="kaushal kumar singh";
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length-1;i++) {
        	int count=1;
           for(int j=i+1;j<arr.length;j++) {
        	   if(arr[i]==arr[j]) {
        		   count++;
        		   arr[j]='@';
        	   }
           }
           if(count>1 && arr[i]!='@') {
        	   System.out.print(arr[i]+" ");
           }
           if(count==1 && arr[i]!='@') {
        	   System.out.print(arr[i]+" ");
           }
        }

	}

}
