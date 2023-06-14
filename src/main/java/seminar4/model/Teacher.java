package seminar4.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
@EqualsAndHashCode(callSuper = true)
@Getter
public class Teacher extends User {

    private String sciense;

    public Teacher(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
        this.sciense = sciense;
    }
}
