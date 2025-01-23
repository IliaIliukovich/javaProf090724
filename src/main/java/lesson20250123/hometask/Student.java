package lesson20250123.hometask;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Student {

    private String name;
    private String surname;
    private int groupNumber;
    private boolean isOnline;

}
