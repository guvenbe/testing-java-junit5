package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1l,"Joe", "Black");
        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName(), "first name failed"),
                () -> assertEquals("Black", person.getLastName(),"lastn name failed")

        );

    }
}