package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) throws Exception {
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student("Max",101));
        studentList.add(new Student("Adam",102));
        studentList.add(new Student("Angela",103));
        studentList.add(new Student("Malek",104));
        studentList.add(new Student("Mel",105));
        studentList.add(new Student("Hagrid",106));

        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(new Teacher("Joe",201));
        teacherList.add(new Teacher("Alicia",202));
        teacherList.add(new Teacher("Mark",203));
        teacherList.add(new Teacher("Ozzy",204));

//        printInfo(studentList);
//        infoPrint(teacherList);
//        infoPrint(studentList);
//        System.out.println(getLastItem(studentList).getName());
//        System.out.println(getLastItem(teacherList).getName());


        MyUtils<Student> obj1=new MyUtils<>();
        System.out.println(obj1.getLastItem(studentList).getName());
        obj1.getLastItem(studentList);
        System.out.println(obj1.getLastItemName(studentList));

        MyUtils<Teacher> obj2= new MyUtils<>();
        System.out.println( obj2.getLastItem(teacherList).getName());
       obj2.infoPrint(teacherList);


    }
    // write a method takes list of student, print each student and total count
    public static void printInfo (List<Student> students){
        for (Student student : students) {
            System.out.println(student);
            
        }
        System.out.println("Total count= "+students.size());
    }
    //write a method that takes list and print each item and total count
    public static <T> void infoPrint(List<T> info){
        for (T t : info) {
            System.out.println(t);

        }
        System.out.println("Total count= "+info.size());


    }
    // write a method that take a list, and return the list item of the list
    public static <T> T getLastItem(List<T> list){
        return list.get(list.size()-1);
    }
}
