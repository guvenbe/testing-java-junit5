package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("model")
class PersonTest {
    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l,"Joe", "Black");
        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName(), "first name failed"),
                () -> assertEquals("Black", person.getLastName(),"last name failed")

        );

    }
}