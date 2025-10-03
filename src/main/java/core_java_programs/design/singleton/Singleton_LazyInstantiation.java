package com.example.design.singleton;

public class Singleton_LazyInstantiation
{
    public static void main(String[] args)
    {
        Xyz abc1= Xyz.getInstance();
        Xyz abc2= Xyz.getInstance();
        System.out.println(abc1+"=="+abc2);
        System.out.println(abc1==abc2);
    }
}

class Xyz
{
    static Xyz obj;
    private Xyz()
    {
        System.out.println("Instance Created");

    }
    public static Xyz getInstance()
    {
        if(obj==null)
        {
            obj=new Xyz();
        }
        return obj;
    }
}