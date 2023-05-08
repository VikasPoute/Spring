package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{1+2+3+4+5+6+7+8+9+10}")
    private int x;

    @Value("#{1*2*3*4*5}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;

    @Value("#{T(java.lang.Math).PI}")
    private double PI;

    @Value("#{new java.lang.String('Vikas Poute')}")
    private String name;

    @Value("#{ 8 > 3}")
    private boolean isActive;

    public double getPI() {
        return PI;
    }

    public void setPI(double pI) {
        PI = pI;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", PI=" + PI + ", name=" + name + ", isActive=" + isActive
                + "]";
    }

}
