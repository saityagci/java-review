import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // Create ArrayList and a class
        List<Student> students=new ArrayList<>();
        // Add Elements to ArrayList
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));
        System.out.println(students);
        //Iteration on ArrayLists
        //1.For Loop with get (index)
        for (int i=0; i< students.size();i++)
            System.out.println(students.get(i));
       // 2. Iterator
        //Forward Iteration
        System.out.println("Printing with Iterator Forward.....................");
        Iterator iter= students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        //Backward Iteration
        System.out.println("Printing with Iterator Backward.....................");

        while(((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());

        }
        //3. For each Loop
        System.out.println("Printing For Each Loop.............................");
        for (Student student : students) {
            System.out.println(student);

        }
        // 4. Lambda
        System.out.println("Lambda...........................................");
        students.forEach(student -> System.out.println(student));
        //5. Sorting Elements in List
        System.out.println("Printing with sorted List by comp..............................");
        Collections.sort(students,new sortById());
        System.out.println(students);
        Collections.sort(students, new sortByName());
        System.out.println(students);

    }
    static class sortById implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id- o1.id;
        }
    }
    static class sortByName implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
