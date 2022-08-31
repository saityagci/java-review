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

        List<Teacher> teacherList= new ArrayList<>();
        studentList.add(new Student("Joe",201));
        studentList.add(new Student("Alicia",201));
        studentList.add(new Student("Mark",201));


    }
}
