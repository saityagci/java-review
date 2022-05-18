package task;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
@Builder
@Data
public class Apple {
    private int weight;
    private Color color;
}
// Builder  generates an @AllArgsConstructor unless there is another @XConstructor
