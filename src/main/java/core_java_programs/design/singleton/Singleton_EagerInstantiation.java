package com.example.design.singleton;

public class Singleton_EagerInstantiation
{
    public static void main(String[] args)
    {
        Abc abc1= Abc.getInstance();
        Abc abc2= Abc.getInstance();
        System.out.println(abc1==abc2);
    }
}

class Abc
{
    static Abc obj=new Abc();
    private Abc()
    {
        System.out.println("Instance Created");
    }
    public static Abc getInstance()
    {
        return obj;
    }
}
