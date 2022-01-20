package com.company.vehical;

public abstract class vehical {
    String color;
    private int maxSpeed;

    public  vehical(int MaxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
    public abstract boolean isMotorized();
    public abstract String getComany();

    public void print()
    {
        System.out.println("Vehicle Color:"+color);
        System.out.println("Vehicle Speed:"+maxSpeed);
    }
}
