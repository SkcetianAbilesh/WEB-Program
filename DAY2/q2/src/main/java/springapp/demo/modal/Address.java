package springapp.demo.modal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    @JsonProperty("Student Name: ")
    public String name;
    @JsonProperty("Student Age: ")
    public int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Address(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}
