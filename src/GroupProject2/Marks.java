package GroupProject2;
/*
   2. We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
    */
abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks {
    double math, history, piano;
    StudentA (double math, double history, double piano) {
        this.math = math;
        this.history = history;
        this.piano = piano;
    }
    @Override
    double getPercentage() {
        return (math+history+piano)/3;
    }
}
class StudentB extends Marks{
    double math,history,piano,science;
    StudentB (double math, double history, double piano, double science) {
        this.math = math;
        this.history = history;
        this.piano = piano;
        this.science=science;
    }
    @Override
    double getPercentage() {
        return (math+history+piano+science)/4;
    }
}
class MarksTester {
    public static void main(String[] args) {
        StudentA student1=new StudentA(8.9,7.5,9.8);
        System.out.println("Average score for student A is: "+student1.getPercentage());

        StudentB student2=new StudentB(10,9.8,10,7.5);
        System.out.println("Average score for student B is: "+student2.getPercentage());

    }
}

