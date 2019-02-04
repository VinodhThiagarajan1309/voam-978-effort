package voam.arrays;

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
public class TwiceAsBigTest {

    @InjectMocks
    TwiceAsBig twiceAsBig;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * This will return 1 as all the numbers * 2 is not greater than 6
     */
    @Test
    public void positive_test_case() {

        int nums[] = new int[4];
        nums[0] = 3;
        nums[1] = 6;
        nums[2] = 1;
        nums[3] = 0;

        int result = twiceAsBig.dominantIndex(nums);

        assertThat(result,equalTo(1));

    }

    /**
     * This will return -1 as 3 * 2 is 6 and
     * 4 being largest, it wont work.
     */
    @Test
    public void negative_test_case() {

        int nums[] = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;

        int result = twiceAsBig.dominantIndex(nums);

        assertThat(result,equalTo(-1));

    }

    /**
     * Custom Input
     */
    @Test
    public void Custom_test_case_1() {

        int nums[] = new int[4];
        nums[0] = 0;
        nums[1] = 0;
        nums[2] = 1;
        nums[3] = 2;

        int result = twiceAsBig.dominantIndex(nums);

        assertThat(result,equalTo(-1));

    }
}