package com.example.algo;

public class NonZeroFrontMoveZeroEndMaintainingOrder
{
    public static void main(String[] args) {

        int arr[]={6,3,0,7,8,0,22,1,13,0,};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<arr.length)
        {
            arr[count]=0;
            count++;
        }
        for(int l:arr)
        {
            System.out.print(l+" ");
        }
    }
}
