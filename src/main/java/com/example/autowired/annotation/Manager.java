package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

//     Autowired annotation can also be used here. (aka field injection, which is not recommended.)
    /*
    @Autowired
    @Qualifier("employee")*/
    private Employee employee;
    @Autowired
    public Manager(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
