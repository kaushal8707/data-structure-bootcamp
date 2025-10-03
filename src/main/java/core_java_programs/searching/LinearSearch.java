package com.example.searching;
public class LinearSearch
{
    public static void main(String[] args)
    {
        int arr[]={7,1,8,2,5,3,9,4};
        int key=3;
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println(key+"  found at position - "+(i+1));
            }
        }
    }
}