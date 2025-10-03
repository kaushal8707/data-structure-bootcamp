package com.example.sorting;

public class BubbleSort
{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,9,8,7,6};
        for(int i=0;i<arr.length;i++)
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
        for(int m:arr) {
            System.out.print(m+" ");
        }

    }
}
