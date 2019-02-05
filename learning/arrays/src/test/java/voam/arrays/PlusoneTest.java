package voam.arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.hamcrest.MockitoHamcrest.*;


import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PlusoneTest {

    @InjectMocks
    Plusone plusone;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Carry Over Use Case - Ripple Effect
     */
    @Test
    public void plusOne_Print_Numbers_In_Reverse_Iteration1() {
        int digits[] = new int[3];
        digits[0] = 9;
        digits[1] = 9;
        digits[2] = 9;
        int[] result = plusone.plusOne(digits);

        assertThat(result[0],is(equalTo(1)));
    }

    /**
     * Carry Over Use Case - Just last number
     */
    @Test
    public void plusOne_Print_Numbers_In_Reverse_Iteration2() {
        int digits[] = new int[3];
        digits[0] = 9;
        digits[1] = 9;
        digits[2] = 8;
        int[] result = plusone.plusOne(digits);

        assertThat(result[2],is(equalTo(9)));
    }

    /**
     * Carry Over Use Case - Just last number
     */
    @Test
    public void plusOne_Print_Numbers_In_Reverse_Iteration3() {
        int digits[] = new int[4];
        digits[0] = 0;
        digits[1] = 0;
        digits[2] = 0;
        digits[3] = 9;
        int[] result = plusone.plusOne(digits);

        assertThat(result[2],is(equalTo(1)));
        assertThat(result[3],is(equalTo(0)));
    }
}