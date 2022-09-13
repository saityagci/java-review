import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        // Creating Stream from Array
        String[] course={"Java","JS","TS"};
        Stream<String> courseStream=Arrays.stream(course);

        //Creating Stream from Collection
        List<String> courseList=Arrays.asList("Java","DS","Spring");
        Stream<String> courseStream2=courseList.stream();

        List<Course> myCourses=Arrays.asList(
                 new Course("Java",100),
                 new Course("DS",101),
                 new Course("Spring",102),
                 new Course("MicroServices",103));


        Stream<Course> myCourseStream=myCourses.stream();


        // Creating stream form Value
        Stream<Integer>stream=Stream.of(1,2,3,4,5);


    }
}
