package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
            public void groupedAssertions(){
        Person person = new Person(1L, "Joe", "Buck");
        //given

        //then
        assertAll("Test Props Set",
                ()->assertEquals("Joe", person.getFirstName(),"First name fialed"),
                ()->assertEquals("Buck", person.getLastName(),"Last name fialed")
                );
    }



}