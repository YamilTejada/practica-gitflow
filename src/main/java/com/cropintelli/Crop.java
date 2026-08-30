package com.cropintelli;

// Release V.1.0.0

public class Crop {

    // Attributes

    private String name;
    private int age;

    // Constructor

    public Crop(String name, int age){

        this.name = name;
        this.age = age;
    }

    // Methods

    public void infoCrop(){

        System.out.println("Name: " + name + " - Age: " + age );
    }

    // Getters and Setters


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
}
