package com.example.searching;

public class BinarySearch
{
    public static void main(String[] args)
    {
           int arr[]={1,2,3,4,5,6,7,8,9};
           int min=0,max=arr.length-1;
           int key=8;
           while(min<=max)
           {
               int mid=(min+max)/2;
               if(key<arr[mid])
               {
                   max=mid-1;
               }else if(key==arr[mid])
               {
                   System.out.println(key+" found at position : "+(mid+1));
                   break;
               }else
               {
                   min=mid+1;
               }
           }

    }
}
