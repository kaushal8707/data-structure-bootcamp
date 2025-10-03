package com.example.collection_framework;

import java.util.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashTable5 {

	public static void main(String[] args) throws InterruptedException
	{
       Map<Integer,String> map=new Hashtable();
       Thread t1=new Thread(new Runnable()
       {
		@Override
		public void run() 
		{
			System.out.println("Thread:  "+Thread.currentThread().getName());
			for(int i=0;i<3;i++)
			{
				map.put(i, "Temp"); 
//				try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			} 
		}
    	   
       },"Thread1");
       Thread t2=new Thread(new Runnable()
       {
		@Override
		public void run()
		{
			System.out.println("Thread:  "+Thread.currentThread().getName());
			Iterator<Entry<Integer,String>> itr=map.entrySet().iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next().getKey()); 
//				try {
//					Thread.sleep(200);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}

			} 
			

		} 
    	   
       },"Thread2");
       t1.start();
       t2.start();
	}

} 
