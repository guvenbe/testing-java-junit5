package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;


@Tag("model")
class OwnerTest {
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");

        assertAll("Properties Test",
            () -> assertAll("Person Properties",
                    () -> assertEquals("Joe", owner.getFirstName(), "Failed on first name"),
                    () -> assertEquals("Buck", owner.getLastName(), "Failed on last name")),
            ()->  assertAll("Owner Properties",
                    () -> assertEquals("Key West", owner.getCity(), "Failed on city"),
                    () -> assertEquals("1231231234", owner.getTelephone(), "Failed on Telephone")
            ));

        assertThat(owner.getCity(), is("Key West"));

    }



}