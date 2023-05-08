package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> cources;

    public Employee() {
        super();
    }

    public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> cources) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.cources = cources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCources() {
        return cources;
    }

    public void setCources(Map<String, String> cources) {
        this.cources = cources;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", cources=" + cources
                + "]";
    }
}
