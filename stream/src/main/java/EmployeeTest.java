import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        //print all emails- one employee has one email -One to One
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);
        System.out.println("==================================");
        //Print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
        System.out.println("==================================");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
        System.out.println("==================================");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
