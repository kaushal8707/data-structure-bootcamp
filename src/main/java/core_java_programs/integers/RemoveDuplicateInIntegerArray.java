package com.example.integers;
public class RemoveDuplicateInIntegerArray
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,4,5,6,5,6,7,8};
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }
            }
            if(arr[i]!=0)
            {
                System.out.print(arr[i]);
            }
        }

    }
}
