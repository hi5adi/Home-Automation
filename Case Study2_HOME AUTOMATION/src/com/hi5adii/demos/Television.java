package com.hi5adii.demos;public class Television extends Device{    int screenSize;    String screenType;    public Television(String name, boolean on, String color, String brand, String model, int screenSize, String screenType) {        super(name, on, color, brand, model);        this.screenSize = screenSize;        this.screenType = screenType;    }    public int getScreenSize() {        return screenSize;    }    public void setScreenSize(int screenSize) {        this.screenSize = screenSize;    }    public String getScreenType() {        return screenType;    }    public void setScreenType(String screenType) {        this.screenType = screenType;    }}