package com.example.multithreading;

public class RunnableAtomic implements Runnable
{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() +"  ");


        System.out.println(AtomicIntegerExample.sharedAtomicInteger.getAndIncrement());
    }
}
