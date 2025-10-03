package com.example.algo;

public class QuickSort
{
    public static void main(String[] args)
    {
        int arr[]={7,1,6,2,4,3,5,11};
        int min=0,max=arr.length-1;
        quicksort(arr,min,max);
        for(int a=0;a<arr.length;a++)
        {
            System.out.print(a+" ");
        }
    }

    private static void quicksort(int[] arr, int min, int max)
    {
        if(min<max)
        {
            int partition=partition(arr,min,max);
            quicksort(arr,min,partition-1);
            quicksort(arr,partition+1,max);
        }
    }

    private static int partition(int[] arr, int min, int max)
    {
        int i=min-1;
        int pivot=arr[max];
        for(int j=min;j<=max-1;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,max);
        return (i+1);

    }

    private static void swap(int[] arr, int i, int j)
    {
        if(arr[i]<arr[j])
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
