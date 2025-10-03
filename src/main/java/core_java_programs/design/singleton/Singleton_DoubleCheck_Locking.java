package com.example.design.singleton;

public class Singleton_DoubleCheck_Locking
{
    public static void main(String[] args)
    {
        Thread t1=new Thread(new Runnable()
        {
            public void run()
            {
                Pqr obj1=Pqr.getInstance();
                System.out.println(obj1+"Thread "+Thread.currentThread().getName());
            }
            });
        t1.start();
        Thread t2=new Thread(new Runnable()
        {
            public void run()
            {
                Pqr obj2=Pqr.getInstance();
                System.out.println(obj2+"Thread "+Thread.currentThread().getName());

            }
        });
        t2.start();
    }
}

class Mno
{
    static Mno obj=null;
    private Mno()
    {
        System.out.println("Instance Created");
    }
    public static Mno getInstance()
    {
        if(obj==null)
        {
            synchronized (Mno.class)
            {
                if(obj==null)
                {
                    obj=new Mno();
                }
            }
        }
        return obj;
    }
}
