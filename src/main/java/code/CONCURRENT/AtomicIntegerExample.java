package com.java.core.selfdeveloped.CONCURRENT;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class A implements Runnable
{
    @Override
    public void run()
    {
       System.out.println(Thread.currentThread().getName()+"start");
       System.out.println(AtomicIntegerExample.num.getAndIncrement());
       System.out.println(Thread.currentThread().getName()+"end");
    }
}

public class AtomicIntegerExample
{
 static AtomicInteger num=new AtomicInteger();
    public static void main(String[] args)
    {
       int no_of_threads=3;
       ExecutorService service= Executors.newFixedThreadPool(no_of_threads);
       for(int i=1;i<=15;i++)
       {
           service.execute(new A());
       }
    }


}
