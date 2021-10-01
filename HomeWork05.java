package Lesson05.online;

public class HomeWork05 {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        //employee1.firstNameSurname="Петр Семипалов";
        //employee1.position="Ведущий инженер" ;
        //employee1.eMail="petr@privet.ru";
        //employee1.phoneNumber=88009000000L;
        //employee1.salary=1000;
        //employee1.age=56;

              /*    System.out.println(" First & Last Name: " + employee1.firstNameSurname + "; Position: " + employee1.position +
                          "; E-mail: " + employee1.eMail + "; Phone number: " + employee1.phoneNumber + "; Salary: " + employee1.salary +
                          "; Age: " + employee1.age);*/
        employee1.outPut(employee1.firstNameSurname, employee1.position, employee1.eMail, employee1.phoneNumber, employee1.salary, employee1.age);
        System.out.println(" ***** Задание 1,3 ***** ");
        employee1.firstNameSurname = "Петр Семипалов";
        employee1.position = "Ведущий инженер";
        employee1.eMail = "petr@privet.ru";
        employee1.phoneNumber = 88009000000L;
        employee1.salary = 1000;
        employee1.age = 56;

        employee1.outPut(employee1.firstNameSurname, employee1.position, employee1.eMail, employee1.phoneNumber, employee1.salary, employee1.age);


        System.out.println(" ***** Задание 4,5 ***** ");

        Employee[] employeeBlock = new Employee[5];

        employeeBlock[0] = new Employee("Гончар Игорь", "Разработчик", "gonchar@mail.ru", 8800234002311L, 2000, 28);
        employeeBlock[1] = new Employee("Гончаров Петр", "Тестировщик", "goncharov@mail.ru", 8800234002322L, 1000, 38);
        employeeBlock[2] = new Employee("Мамонов Николай", "Разработчик", "mamonov@mail.ru", 8800234002333L, 2500, 58);
        employeeBlock[3] = new Employee("Федорчук Евгений", "Администратор", "phedorchuk@mail.ru", 8800234002344L, 800, 40);
        employeeBlock[4] = new Employee("Гончарова Наталья", "Тестировщик", "goncharova@mail.ru", 8800234002355L, 1500, 48);

        for (int i = 0; i < employeeBlock.length; i++) {

                    }

       /* for (int i = 0; i < employeeBlock.length; i++) {



            }*/


        }

    }



