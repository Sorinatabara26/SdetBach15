package class23;

public class Student {


    public void study(){
        System.out.println("studying....");
    }
    public void doHomeWork(){
        System.out.println("solving homeworks");
    }
}
class SyntaxStudents extends Student{
    public void study(){
        System.out.println(" Syntax students studying....");
    }
    public void doHomeWork(){
        System.out.println("Syntax students solving homeworks");
    }
}



class CollegeStudent extends Student{
    public void study(){
     System.out.println("College Student studying....");
 }
     public void doHomeWork(){
         System.out.println("College Student solving homeworks");
     }
 }


class SchoolStudent extends Student{
    public void study(){
        System.out.println("School Student studying....");
    }
    public void doHomeWork(){
        System.out.println("School Student solving homeworks");
    }
}
