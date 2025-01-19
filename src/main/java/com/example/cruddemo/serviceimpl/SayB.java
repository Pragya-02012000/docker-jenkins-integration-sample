package com.example.cruddemo.serviceimpl;

import com.example.cruddemo.service.EmployeeFuncInterface;

public class SayB implements EmployeeFuncInterface {

//    static final int value =1;
    @Override
    public void say() {
        System.out.println("Hi B");

    }
}