import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonValidatorTest {

    private PersonValidator personValidator;

    @BeforeEach
    public void setUp(){
        personValidator = new PersonValidator();
    }

    @Test
    public void personShouldHaveName (){
        // kiedy spełnione są warunki
        Person osoba = new Person("",1.8,25);
        //wtedy
        boolean personValid = personValidator.isPersonValid(osoba);
        assertThat(personValid).isFalse();
    }

}
