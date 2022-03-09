package classwork;

import org.junit.jupiter.api.*;

public class FirstJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("This method is executed before all tests");
    }

    @BeforeEach
    void openBrowser() {
        System.out.println("This method is executed before each test.");
    }

    @AfterEach
    void after() {
        System.out.println("This method is executed after every test.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This method is executed after all tests.");
    }

    @Test
    void textTest() {
        // поиск по тексту
        System.out.println("              This is the first test");
    }

    @Test
    void videoTest() {
        // поиск видео
        System.out.println("              This is the second test");
    }
}
