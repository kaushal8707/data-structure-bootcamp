package com.example.basics;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[]={7,1,4,2,3,6,5,10};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int m:arr)
        {
            System.out.print(m+" ");
        }

    }
}
