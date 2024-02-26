package Homework05;

public class Person {
    private String name;
    private int age;
    private boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public void showPersonInfo() {
        System.out.println("\nName: " + getName() + "\nAge: " + getAge());
        if (isMan()) {
            System.out.println("Gender: man");
        } else {
            System.out.println("Gender: woman");
        }
    }
}