package Homework05;

public class Employee extends Person {
    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        setDaySalary(daySalary);
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        if (daySalary >= 0)
        this.daySalary = daySalary;
    }

    public void calculateOvertime(double hours) {
        double overtimeMoney;
        if (getAge() >= 18) {
            overtimeMoney = ((daySalary/8)*1.5)*hours;
        } else {
            overtimeMoney = 0;
        }
        System.out.println("\nEmployee's name: " + getName() + "\nOvertime (" + hours + "h): " + overtimeMoney +"$");
    }

    public void showEmployeeInfo() {
        System.out.print("\nEmployee's information");
        showPersonInfo();
        System.out.println("Daily salary: " + getDaySalary() + "$");
    }
}