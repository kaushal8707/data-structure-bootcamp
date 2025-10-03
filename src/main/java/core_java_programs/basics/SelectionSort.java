package com.example.basics;

public class SelectionSort
{
    static int arr[]={7,1,5,2,4,3,9};
    public static void main(String[] args)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int x : arr)
        {
            System.out.print(x+" : ");
        }

    }
}
