package Lesson05.online;

public class Employee {

    String firstNameSurname;
    String position;
    String eMail;
    long phoneNumber;
    int salary;
    int age;



        public Employee () {

        System.out.println("Это конструктор Задание 2");
        this.firstNameSurname = "Иванов Иван";
        this.position = "Тестировщик";
        this.eMail = "my@e.mail";
        this.phoneNumber = 88002000000L;
        this.salary = 1000;
        this.age = 40;
        //System.out.println(" First & Last Name: " + firstNameSurname + "; Position: " + position +
        //          "; E-mail: " + eMail + "; Phone number: " + phoneNumber + "; Salary: " + salary + "; Age: " + age);

    }

                public Employee(String firstNameSurname, String position, String eMail, long phoneNumber, int salary, int age) {

                    if ( age > 40 ) {
                    System.out.println(" First & Last Name: " + firstNameSurname + "; Position: " + position +
                            "; E-mail: " + eMail + "; Phone number: " + phoneNumber + "; Salary: " + salary + "; Age: " + age);
                }
    }


    void outPut (String firstNameSurname, String position, String eMail, long phoneNumber, int salary, int age) {
        System.out.println(" First & Last Name: " + firstNameSurname + "; Position: " + position +
                "; E-mail: " + eMail + "; Phone number: " + phoneNumber + "; Salary: " + salary + "; Age: "
                + age);
    }
}
