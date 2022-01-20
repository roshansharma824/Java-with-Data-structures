package com.company.vehical;

public abstract class Car extends vehical {
    int numGears;
    boolean isCovertible;

    public Car(int MaxSpeed) {
        super(MaxSpeed);
    }

    public boolean isMotorized()
    {
        return true;
    }
    public void print()
    {
        System.out.println("car color:"+color);
        System.out.println("car numgear:"+numGears);
        System.out.println("car max speed:"+getMaxSpeed());
        System.out.println("car isConvertable:"+isCovertible);
    }
}
