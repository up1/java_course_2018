package com.example.demo;

abstract class Employee {  
    String id;
    String name;
    
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 0;
    }   
}

abstract class Report {
    abstract void genHeader();
    abstract void genBody();
    abstract void genFooter();
    
    public void generate() {
        genHeader();
        genBody();
        genFooter();
    }
}

class Report1 extends Report {

    @Override
    void genHeader() {
    }

    @Override
    void genBody() {
    }

    @Override
    void genFooter() {
    }
    
}

interface IReport {
    void genHeader();
    void genBody();
    void genFooter();
}

class Report2 implements IReport {

    @Override
    public void genHeader() {
    }

    @Override
    public void genBody() {
    }

    @Override
    public void genFooter() {
    }
    
}

class GenerateReport {
    
    void generate(IReport report) {
        report.genHeader();
        report.genBody();
        report.genFooter();
    }
}





public class DemoInheritance {

    public static void main(String[] args) {
        // Interface
        IReport report2 = new Report2();
        GenerateReport generateReport = new GenerateReport();
        generateReport.generate(report2);
        
        // Abstract
        Report1 report1 = new Report1();
        report1.generate();

    }

}
