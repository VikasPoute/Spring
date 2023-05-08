package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    private Address address;

    public Emp() {
        super();
    }

    @Autowired
    public Emp(Address address) {
        System.out.println("constructing address");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setter for address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp [address=" + address + "]";
    }
}
