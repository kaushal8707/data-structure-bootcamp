package com.example.design.factory;

public class FactoyOS
{
    public OS getOSInstance(String spec)
    {
        if(spec.equals("closed"))
        {
            return new IOS();
        }else if(spec.equals("open"))
        {
            return new AndroidOS();
        }else if(spec.equals("usual"))
        {
            return new WindowsOS();
        }
        return null;
    }
}
