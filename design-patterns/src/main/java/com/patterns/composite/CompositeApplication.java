package com.patterns.composite;

public class CompositeApplication {
    public static void main(String[] args) {
        Department finance = new FinanceDepartment();
        Department slaes= new SalesDepartment();
        HeadDepartment head = new HeadDepartment("head", "Praneeth");

        head.addDepartment(finance);
        head.addDepartment(slaes);

        head.printDepartment();

    }
}
