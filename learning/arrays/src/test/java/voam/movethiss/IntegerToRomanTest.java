package voam.movethiss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class IntegerToRomanTest {

    @InjectMocks
    IntegerToRoman integerToRoman;

    @Test
    public void testSampleFlow() {
        integerToRoman.intToRoman(3936);
    }

    @Test
    public void testSampleFlow2() {
        integerToRoman.intToRoman(58);
    }

    @Test
    public void testSampleFlow3() {
        integerToRoman.intToRoman(8);
    }
}