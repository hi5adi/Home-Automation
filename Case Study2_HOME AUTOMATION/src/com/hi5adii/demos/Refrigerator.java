package com.hi5adii.demos;public class Refrigerator extends Device{    int capacityLiters;    public Refrigerator(String name, boolean on, String color, String brand, String model, int capacityLiters) {        super(name, on, color, brand, model);        this.capacityLiters = capacityLiters;    }    public int getCapacityLiters() {        return capacityLiters;    }    public void setCapacityLiters(int capacityLiters) {        this.capacityLiters = capacityLiters;    }}