package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users= new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(User.builder().firstName("Tom").lastName("Hanks").age(65).build());
        users.add(User.builder().firstName("Adam").lastName("Evan").age(33).build());
        users.add(User.builder().firstName("Nick").lastName("Patrick").age(28).build());
        //Print all elements in the list
         printName(users,p->true);
        System.out.println("*************************************************");
        // Print all users that last name starts with E
        printName(users,p-> p.getLastName().startsWith("E"));
        System.out.println("*************************************************");
        printName(users,user -> user.getAge()<30);
    }
    private static void printName(List<User> users, Predicate<User>p){
        for (User user : users) {
            if (p.test(user)){
                System.out.println(user.toString()  );
            }

        }
    }
}
