package com.example.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_SynchronizationTest 
{
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> synchronizedList=Collections.synchronizedList(list);
		System.out.println(Thread.currentThread().getName()+"    running");
		Thread t1=new Thread(new Runnable()
		{
		   public void run() 
		   {
			   System.out.println(Thread.currentThread().getName()+"    running");
			  for(int i=0;i<5;i++)
			  {
				  synchronizedList.add(i);
				  try {
					Thread.sleep(100); 
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			  }
		   }	
		},"Thread 1");
		t1.start();
		Thread t2=new Thread(new Runnable()
		{
		   public void run()
		   {
			   System.out.println(Thread.currentThread().getName()+"    running");
//			   synchronized (list)
//			   {
				   Iterator<Integer> itr=synchronizedList.iterator();
					try {
						Thread.sleep(100); 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				   while(itr.hasNext())
				   {
					   System.out.println(itr.next()); 
				   } 
 
		   }	//}
		},"Thread 2");
		t2.start();

		
	}

}
