package com.java.core.selfdeveloped.strings;

public class PermutationOfString {

	private static String swap(String str,int i, int j) {
		char A[]=str.toCharArray();
		
		char temp;
		temp=A[i];
		A[i]=A[j];
		A[j]=temp;
		
		return String.valueOf(A);
	}
	
	private static void permutation(String str, int l, int h) {
		if(l==h) {
			System.out.println(str);
		}else {
			
			for(int i=l;i<=h;i++) {
				str=swap(str,i,l);
				permutation(str,l+1,h);
				str=swap(str,i,l);
			}
		}
		

	}

	
	public static void main(String[] args) {
		String str="ABC";
		int l=0;
		int h=str.length()-1;
		permutation(str,l,h);
		

	}
}
