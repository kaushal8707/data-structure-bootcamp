package com.example.design.singleton;

public class Singleton_InCaseOf_ThreadSafe
{
    public static void main(String[] args)
    {
//      Pqr obj1=Pqr.getInstance();
//      Pqr obj2=Pqr.getInstance();
//      System.out.println(obj1+"---"+obj2);
      Thread t1=new Thread()
      {
          public void run()
          {
              Pqr obj1=Pqr.getInstance();
              System.out.println(obj1+"Thread "+Thread.currentThread().getName());
          }
      };
      t1.start();
        Thread t2=new Thread()
        {
            public void run()
            {
                Pqr obj2=Pqr.getInstance();
                System.out.println(obj2+"Thread "+Thread.currentThread().getName());

            }
        };
      t2.start();
    }
}

class Pqr
{
    static Pqr obj=null;
    private Pqr()
    {
      System.out.println("Instance Created");
    }
    public static synchronized Pqr getInstance()
    {
        if(obj==null)
        {
            obj=new Pqr();
        }
        return obj;
    }
}