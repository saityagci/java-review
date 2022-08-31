package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student("Max",101));
        studentList.add(new Student("Adam",102));
        studentList.add(new Student("Angela",103));
        studentList.add(new Student("Malek",104));
        studentList.add(new Student("Mel",105));

        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(new Teacher("Joe",201));
        teacherList.add(new Teacher("Alicia",202));
        teacherList.add(new Teacher("Mark",203));
        printInfo(studentList);


    }
    // write a method takes list of student, print each student and total count
    public static void printInfo (List<Student> students){
        for (Student student : students) {
            System.out.println(student);
            
        }
        System.out.println("Total count= "+students.size());
    }
}
