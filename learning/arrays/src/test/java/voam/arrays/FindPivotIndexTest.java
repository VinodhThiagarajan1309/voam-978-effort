package voam.arrays;

import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FindPivotIndexTest {

    @InjectMocks
    FindPivotIndex findPivotIndex;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test for Array with 1 item
     */
    @Test
    public void testForSingleElementArray() {

        int[] arrWithOneElement = new int[1];
        arrWithOneElement[0] = 1;

        int result = findPivotIndex.findPivotIndex(arrWithOneElement);
        assertThat(0, Is.is(equalTo(result)) );

    }

    /**
     * Test for Array with 1 item
     */
    @Test
    public void testFor2ElementsElementArray() {

        int[] arrWithOneElement = new int[2];
        arrWithOneElement[0] = 1;
        arrWithOneElement[1] = 2;

        int result = findPivotIndex.findPivotIndex(arrWithOneElement);
        assertThat(-1, Is.is(equalTo(result)) );

    }

    /**
     * Pivot in the 3rd index ( 4th element )
     */
    @Test
    public void test_for_elements_where_pivot_is_possible() {

        int[] arrWithOneElement = new int[6];
        arrWithOneElement[0] = 1;
        arrWithOneElement[1] = 7;
        arrWithOneElement[2] = 3;
        arrWithOneElement[3] = 6;
        arrWithOneElement[4] = 5;
        arrWithOneElement[5] = 6;

        int result = findPivotIndex.findPivotIndex(arrWithOneElement);
        assertThat(3, Is.is(equalTo(result)) );


    }

    /**
     * Pivot in the 3rd index ( 4th element ) and 5th element
     * Still return 3rd index
     */
    @Test
    public void test_for_elements_where_2_pivot_is_present() {

        int[] arrWithOneElement = new int[7];
        arrWithOneElement[0] = 1;
        arrWithOneElement[1] = 7;
        arrWithOneElement[2] = 3;
        arrWithOneElement[3] = 6;
        arrWithOneElement[4] = 5;
        arrWithOneElement[5] = 6;
        arrWithOneElement[6] = 22;

        int result = findPivotIndex.findPivotIndex(arrWithOneElement);
        assertThat(3, Is.is(equalTo(result)) );


    }

    /**
     * Very Specific Input
     */
    @Test
    public void test_For_bunch_of_negatives() {
        int[] arrWithOneElement = new int[6];
        arrWithOneElement[0] = -1;
        arrWithOneElement[1] = -1;
        arrWithOneElement[2] = -1;
        arrWithOneElement[3] = 0;
        arrWithOneElement[4] = 1;
        arrWithOneElement[5] = 1;

        int result = findPivotIndex.findPivotIndex(arrWithOneElement);
        assertThat(3, Is.is(equalTo(result)) );
    }

}