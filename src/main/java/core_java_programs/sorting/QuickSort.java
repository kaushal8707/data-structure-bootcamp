package com.example.sorting;

public class QuickSort
{
    public static void main(String[] args) {

        int arr[]={15,4,3,2,1,9,8,7,11};
        int min=0,max=arr.length-1;
        quicksort(arr,min,max);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
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
        for(int j=min;j<arr.length;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,max);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
