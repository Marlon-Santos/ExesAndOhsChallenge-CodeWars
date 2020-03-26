package com.challenges.codeWars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodeWarsApplicationTests {
    @Test
    public void testSomething1() {
        assertEquals(true, CodeWarsApplication.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, CodeWarsApplication.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, CodeWarsApplication.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, CodeWarsApplication.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, CodeWarsApplication.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, CodeWarsApplication.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, CodeWarsApplication.getXO("Xxxxertr34"));

    }

}
