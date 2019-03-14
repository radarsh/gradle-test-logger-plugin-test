package com.adarshr.test;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("This should print before all");

    }

    @AfterAll
    public static void afterAll() {
        System.out.println("This should print after all");
    }

    @BeforeEach
    public void before() {
        System.out.println("This should print before each test");
        System.exit(5);

    }

    @AfterEach
    public void after() {
        System.out.println("This should print after each test");
    }

    @Test
    public void thisTestShouldPass() {
        Assertions.assertEquals(1, 1);
    }

//    @Test
//    @DisplayName("this test should fail")
//    public void thisTestShouldFail() {
//        Assertions.assertEquals(1, 2);
//    }

    @Test
    @Disabled
    public void thisTestShouldBeSkipped() {
        Assertions.assertEquals(1, 1);
    }
}
