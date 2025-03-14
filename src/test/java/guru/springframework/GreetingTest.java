package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - only called once!");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After - only called once!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each...");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each...");
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());

    }

    @Test
    void helloWorldName() {
        System.out.println(greeting.helloWorld("Alex"));
    }
}