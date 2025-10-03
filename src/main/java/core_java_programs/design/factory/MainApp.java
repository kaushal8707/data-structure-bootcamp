package com.example.design.factory;

public class MainApp
{
    public static void main(String[] args)
    {
        FactoyOS fos=new FactoyOS();
        OS os1=fos.getOSInstance("closed");
        os1.spec();
        OS os2=fos.getOSInstance("open");
        os2.spec();
    }
}
