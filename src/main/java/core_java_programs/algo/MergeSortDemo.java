package com.example.algo;

public class MergeSortDemo
{
   static int tempArr[];
    private static void doCompareAndMerger(int[] arr, int min, int mid, int max) {
        for(int i=min;i<=max;i++)
        {
            tempArr[i]=arr[i];
        }
        int i=min;
        int j=mid+1;
        int k=min;
        while(i<= mid && j<=max)
        {
            if(tempArr[i]<tempArr[j])
            {
                arr[k]=tempArr[i];
                i++;
            }else
            {
                arr[k]=tempArr[j];
                j++;
            }
            k++;
        }
        while(i<= mid) {
            arr[k] = tempArr[i];
            i++;
            k++;
        }
        while(j<= max) {
            arr[k] = tempArr[j];
            j++;
            k++;
        }
    }

    private static void divideArr(int[] arr, int min, int max) {
        if(min<max)
        {
            int mid=(min+max)/2;
            divideArr(arr,min,mid);
            divideArr(arr,mid+1,max);
            doCompareAndMerger(arr,min,mid,max);

        }
    }

    public static void main(String[] args) {
        int arr[]={7,1,6,2,4,3,5,10};
        int min=0;
        int max=arr.length-1;
        tempArr=new int[arr.length];
        divideArr(arr,min,max);
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
    }


}
