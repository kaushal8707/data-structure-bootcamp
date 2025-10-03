package com.java.core.selfdeveloped.strings;

public class CountingVowelsAndConsonentInString {
	//count vowels & consonants & numbers & s symbols(including spaces)
		public static void main(String[] args) {
			String str="Hi 123 How Are You Guys!! How is the JOSH188?";
			int vCount=0;
			int cCount=0;
			int iCount=0;
			int sCount=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
				str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
					vCount++;
				}else if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)) {
					cCount++;
				}else if(str.charAt(i)>=48 && str.charAt(i)<=57) {
					iCount++;
				}else {
					sCount++;
				}
			}
			System.out.println("Vowels = "+vCount);
			System.out.println("Consonants = "+cCount);
			System.out.println("Numbers = "+iCount);
			System.out.println("Special Symbols = "+sCount);

		}		
	}