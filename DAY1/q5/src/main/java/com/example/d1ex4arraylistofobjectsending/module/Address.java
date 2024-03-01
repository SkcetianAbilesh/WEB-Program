package com.example.d1ex4arraylistofobjectsending.module;

public class Address {
    String name;
    String dep;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDep() {
        return dep;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    public Address(String name, String dep) {
        this.name = name;
        this.dep = dep;
    }
    
}
