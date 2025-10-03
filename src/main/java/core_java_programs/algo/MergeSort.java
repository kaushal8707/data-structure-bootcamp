package com.example.algo;

public class MergeSort {
    static int tempArr[];

    public static void main(String[] args) {
        int arr[]={12,6,3,4,2,9,8,7};
        int min = 0;
        int max = arr.length-1;
        tempArr = new int[arr.length];
        firstdivide(arr, min, max);
        for (int k : arr) {
            System.out.print(k + "  ");
        }

    }

    private static void firstdivide(int[] arr, int min, int max) {
        if (min < max) {
            int mid = (min+max)/2;
            firstdivide(arr,min,mid);
            firstdivide(arr,mid + 1,max);
            mergeSort(arr,min,mid,max);
        }
    }

    private static void mergeSort(int[] arr, int min, int mid, int max) {
        for (int i = min; i <= max; i++) {
            tempArr[i] = arr[i];
        }
        int i = min;
        int j = mid + 1;
        int k = min;
        while (i <= mid && j <= max) {
            if (tempArr[i] < tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = tempArr[i];
            i++;
            k++;
        }
        while (j <= max) {
            arr[k] = tempArr[j];
            j++;
            k++;
        }
    }
}

