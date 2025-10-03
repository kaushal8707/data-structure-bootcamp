package com.java.core.selfdeveloped.strings;

public class abbbccddddToPrinta1b3c2d4
{
	public static void main(String[] args) {
		String str = "abbbccdddd";
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='0';
					
				}
			}
			if(count>0 && arr[i]!='0') {
				System.out.print(arr[i]+""+count);
			}
			
		}
	}

}
