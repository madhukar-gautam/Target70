package leetcode;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private String getConsoleOutput(Runnable function) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            function.run();
        } finally {
            System.setOut(originalOut);
        }

        return outContent.toString().trim().replace("\r\n", "\n");
    }
    @Test
    void testFizzBuzz_1To15() {
        String expectedOutput = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz";
        String actualOutput = getConsoleOutput(() -> FizzBuzz.printFizzBuzz(16));
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void testFizz() {
        // Fizz cases: multiples of 3 that are not multiples of 5
        String actualOutput = getConsoleOutput(() -> FizzBuzz.printFizzBuzz(7));
        String[] output = actualOutput.split("\n");

        assertEquals("Fizz", output[2]);  // i = 3
        assertEquals("Fizz", output[5]);  // i = 6
    }
}