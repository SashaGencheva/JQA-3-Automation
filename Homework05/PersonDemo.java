package Homework05;

public class PersonDemo {
    public static void main(String[] args) {

        Person[] arr = new Person[10];
        arr[0] = new Person("John", 23, true);
        arr[1] = new Person("Jenny", 24,false);
        arr[2] = new Person("Joe", 20, true);
        arr[3] = new Student("Kathy", 16, false, 5.5);
        arr[4] = new Student("Mike", 18, true, 4.5);
        arr[5] = new Student("Emily", 17, false, 6.0);
        arr[6] = new Employee("Smith", 30, true,40.00);
        arr[7] = new Employee("Monica", 32, false, 50.00);
        arr[8] = new Employee("Samuel", 35, true, 70.00);
        arr[9] = new Employee("Ross", 35, true, 60.00);

        arr[3].setName("Emo"); //changing name from Kathy to Emo
        arr[3].setMan(true);  //changing gender from woman to man
        ((Student) arr[3]).setScore(1.0);  //changing student's score from 5.5 to 1.0 (invalid score)

        arr[9].setAge(17);  //changing employee's age from 35 to 17 => overtimeMoney = 0$
        ((Employee) arr[9]).setDaySalary(10);  //changing employee's daily salary from 60.00$ to 10.00$

        for (Person person : arr) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if(person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
            } else {
                person.showPersonInfo();
            }
        }

        //calculating payment for 2 hours overtime
        for (Person person : arr) {
            if(person instanceof Employee) {
                ((Employee) person).calculateOvertime(2.0);
            }
        }
    }
}