import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","Mike@cydeo.com", Arrays.asList("2022232322","2023343212")),
                new Employee(101,"Ozzy","Ozzy@cydeo.com", Arrays.asList("3072232322","3073343212")),
                new Employee(102,"Peter","Peter@cydeo.com", Arrays.asList("3082232322","4423343212"))
        );
    }
}
