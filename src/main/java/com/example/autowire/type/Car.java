package com.example.autowire.type;

public class Car {

    private Specification specification;

    public void setJJSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car details: " + specification);
    }
}
