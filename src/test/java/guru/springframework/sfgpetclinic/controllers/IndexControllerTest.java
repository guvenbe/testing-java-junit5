package guru.springframework.sfgpetclinic.controllers;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Tag("controllers")
class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test proper biew name is returned for index page")
    @Test
    void index() {
        assertEquals("index",controller.index());
        assertEquals("index",controller.index(),"wrong view returned");
        assertEquals("index",controller.index(),() ->"Another wrong view returned");
        assertThat(controller.index().equals("index"));
    }

    @Test
    @DisplayName("Test Exception")
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, () -> {
            controller.oupsHandler();
        });
        
//        assertTrue("notimplemented".equals(controller.oupsHandler()),() -> "This is some expensive" +
//                "Message to build" +
//                "for my test");
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100),
                () -> {Thread.sleep(2000);
                    System.out.println("I got here");
        });
    }

    @Disabled("Demo of timeout")
    @Test
    void testTimeOutPrempt() {
        assertTimeoutPreemptively(Duration.ofMillis(100),
                () -> {Thread.sleep(2000);
                    System.out.println("I got here xxxxx");
        });
    }

    @Test
    void testAssumptionTrue() {
        assumeTrue("GURU".equals(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionTrueAssumotionIsTrue() {
        assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS() {
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows() {
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8() {
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "guvenbe")
    @Test
    void testIfUserJT() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "fredBBBBBB")
    @Test
    void testIfUserFred() {
    }
}