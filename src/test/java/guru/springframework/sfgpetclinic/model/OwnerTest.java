package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    public void dpendentAssertions() {
        Owner owner = new Owner(1L, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("123123132");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Joe", owner.getFirstName(), "First Name did not match"),
                        () -> assertEquals("Buck", owner.getLastName(), "Last Name did not match")),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West", owner.getCity(),"City did not match"),
                        () -> assertEquals("123123132", owner.getTelephone(), "Phone  did not match")
                ));


    }

}
