package com.example.collection_framework;
import java.util.Iterator; 
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
 
public class CopyOnWriteArrayListSynchronizationSucceedsExample {
    public static void main(String[] args) {
    	final List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<Integer>();
  
           //Thread 1 will add elements in CopyOnWriteArrayList
           Thread t1 = new Thread(new Runnable()
           {
                  public void run() 
                  { 
                        for (int i = 0; i <= 3; i++) 
                        {
                               copyOnWriteArrayList.add(i);
//                               try {
//                                      Thread.sleep(100);
//                               } catch (InterruptedException e) {
//                                      e.printStackTrace();
//                               }
                        }
                  }
           }, "thread-1");
           
           t1.start();
 
           //Thread 2 will iterate on CopyOnWriteArrayList
           Thread t2 = new Thread(new Runnable() 
           { 
                  public void run() {
                        Iterator<Integer> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                               try {
                                      Thread.sleep(100);
                               } catch (InterruptedException e) {
                                      e.printStackTrace();
                               }
                               System.out.println(it.next());
                        }
 
                  }
           }, "thread-2");
           t2.start();
 
    }
}
 