package com.java.core.selfdeveloped.strings;

public class AllPossibleSubStringInGivenString_banana_b_ba_ban_bana_banan_banana_a_an {

	public static void main(String[] args) {
		String str="banana";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.print(str.substring(i, j)+"_");
			}
		}
	}
}
