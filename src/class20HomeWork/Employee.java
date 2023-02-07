package class20HomeWork;

public class Employee {

    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    void employeeInf(){
        System.out.println("Employee name is" + name + " and  age " + age);
    }
}
class FullTime extends Employee{
    int salary;
     FullTime(String name,int age,int salary){
         super(name,age);
         this.salary=salary;
     }
     void fullTime(){
             System.out.println("My salary is  " + salary );
         }
}
class PartTime extends FullTime{
    int days;
    PartTime(String name,int age,int salary,int days){
        super(name,age,salary);
        this.days=days;
    }
        void PartTime(){
            System.out.println("i have" + days + "off");
        }
    }

