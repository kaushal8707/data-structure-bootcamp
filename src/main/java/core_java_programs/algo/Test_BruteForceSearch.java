package com.example.algo;
import java.util.Set;
import java.util.HashSet;

public class Test_BruteForceSearch {

	public static void main(String[] args) 
	{
		String str="auiopkmbcbcdefabdfce";
		int min=0,max=str.length()-1;
		String response=getNonRepeatedMaxLengthString(str,min,max);
		String arr[]=response.split(" ");
		int length=new Integer(arr[0]);
		int j=new Integer(arr[1]);
		int i=new Integer(arr[2]);
		System.out.print("Length = "+length+"  V a l u e : "+str.substring(i, j)); 
		
	}
 
	private static String getNonRepeatedMaxLengthString(String str, int min, int max)
	{
		Set<Character> set=new HashSet<Character>();
		int i=0,j=0;
		int maxCount=0;
		while(i<max && j<max)
		{
			if(!set.contains(str.charAt(j)))
			{
				set.add(str.charAt(j));
				j++;
				maxCount=Math.max(maxCount, (j-i)); 
				
			}else
			{
				set.remove(str.charAt(i));
				i++;
			}
		}
		return maxCount+" "+j+" "+i;
	} 

}
