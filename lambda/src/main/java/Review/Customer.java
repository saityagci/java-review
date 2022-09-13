package Review;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String confirmEmail;
    private String address;
    private String zipCode;
    private String city;
    private String phone;
}
