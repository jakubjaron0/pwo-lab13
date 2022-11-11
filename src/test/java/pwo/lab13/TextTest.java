/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pwo.lab13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Kuba
 */
public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5",
        "xx12x12x1x"})
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5",
        "xx1x12x1x"})
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5",
        "xx12x12x1x"})
    void isContainDigitTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.isContainDigit(str));
    }
    
@ParameterizedTest
    @ValueSource(strings = {"aabbsd", " ",
        "xxxxx"})
    void isContainDigitTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.isContainDigit(str));
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd",
        "xx12x12x1x"})
    void isNumeric1(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.isNumeric(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"23",
        "12", "-200"})
    void isNumeric2(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.isNumeric(str));
    }
}
