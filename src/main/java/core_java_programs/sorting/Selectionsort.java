package com.example.sorting;

public class Selectionsort
{
    public static void main(String[] args) {

        int arr[]={5,4,3,2,1,9,8,7,6};

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
        for(int t:arr)
        {
            System.out.print(t+" ");
        }

    }
}
