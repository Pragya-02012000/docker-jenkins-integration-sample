package com.example.cruddemo.serviceimpl;

import com.example.cruddemo.service.EmployeeFuncInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {

    public static void main(String[] args){

        System.out.println("Strting......");

        EmployeeFuncInterface dun = () -> {
            System.out.println("lambgsf");
        };

        dun.say();


        List<String> employees = Arrays.asList("a","n","dajk","kdkd");
        List<String> result = employees.stream().filter(emp -> !"n".equals(emp))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
