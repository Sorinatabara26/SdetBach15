package class29HomeWork;

import java.util.HashMap;
public class Task2 {
        /*Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
         Each student object should have name and studentID. Display name of each student.*/
        public static void main(String[] args) {
            HashMap<String,Integer> studentInfo=new HashMap<>();
            studentInfo.put("Sorina",167);
            studentInfo.put("Miha",123);
            studentInfo.put("Alex",234);
            studentInfo.put("john",9877);

            System.out.println(studentInfo.keySet());

        }
    }
