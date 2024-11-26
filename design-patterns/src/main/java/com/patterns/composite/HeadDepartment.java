package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
    private String id;
    private String name;
    private List<Department> departments;

    HeadDepartment(String id, String name){
        this.id= id;
        this.name= name;
        this.departments = new ArrayList<>();
    }

    public void  addDepartment(Department department){
        departments.add(department);
    }

    public void  removeDepartment(Department department){
        departments.remove(department);
    }
    @Override
    public void printDepartment() {
        departments.forEach(Department::printDepartment);
    }
}
