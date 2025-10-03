package com.example.design.builder;

public class PhoneBuilder
{
    private String name;
    private String processor;
    private long screenSize;
    private int battery;
    private int camera;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(long screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone( name,  processor,  screenSize,  battery,  camera);
    }
}
