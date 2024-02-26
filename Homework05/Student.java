package Homework05;

public class Student extends Person {
    private double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        setScore(score);

    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if ((score >= 2.0) & (score <= 6.0)) {
            this.score = score;
        } else {
            System.out.println("Invalid score for " + getName() + "! Student's score should be between 2 and 6!");
        }
    }

    public void showStudentInfo() {
        System.out.print("\nStudent's information");
        showPersonInfo();
        System.out.println("Score: " + getScore());

    }
}