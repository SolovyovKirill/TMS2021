import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";

    private Address address;
    private int age;
    private String name;
    private String sex = FEMALE;

    public Person() {
    }

    public Person(Address address, int age, String name, String sex) {
        this.address = address;
        this.age = age;
        this.name = name;
        if (MALE.equals(sex) || FEMALE.equals(sex)) {
            this.sex = sex;
        }
    }
}