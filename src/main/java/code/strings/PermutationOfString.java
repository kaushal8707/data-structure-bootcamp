package com.java.core.selfdeveloped.strings;
/*In order to recover our original combination that the the original permutation that we had we will again use the swap operation which will cancelled out our original swap operation.

for Ex-
if you have ABC
you swapped A with C
then what would be result it would be CBA
and again if you performed same swap operation then it will be ABC 
so to recover our original string i am performing 2nd swap operation called BackTracking

*/

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
				str=swap(str,i,l);        //for permutation
				permutation(str,l+1,h);
				str=swap(str,i,l);         //To recover our original string (Back Tracking)
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
