package com.example.sorting;

public class InsertionSort
{
    public static void main(String[] args) {

        int arr[]={5,4,3,2,1,9,8,7,6};
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int k:arr)
        {
            System.out.print(k+": ");
        }
    }
}
