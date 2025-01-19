package com.example.cruddemo.service;

@FunctionalInterface
public interface EmployeeFuncInterface {

    void say();
    static void help(){
        System.out.println("Calling help method");
    };

    default void call(){
        System.out.println("Calling call method");
    };


}
