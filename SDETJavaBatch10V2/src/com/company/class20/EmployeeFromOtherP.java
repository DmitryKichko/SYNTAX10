package com.company.class20;

import com.company.class2120.Person;

public class EmployeeFromOtherP extends Person{
    String empId;
    double salary;
    void work(){
        System.out.println("Employee "+empId+" having height "+height+" is working");
    }
    void getPaid(){
        System.out.println(empId+" is paid "+salary);
    }
    public static void takeLeaves(){
        System.out.println("Employees can take leaves");
    }
}
