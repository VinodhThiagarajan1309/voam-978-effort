package voam.towd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DiagonalTraverseTest {

    @InjectMocks
    DiagonalTraverse diagonalTraverse;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Plain Call
     */
    @Test
    public void findDiagonalOrder() {

        int[][] sampleInput = new int[3][3];
        sampleInput[0][0] = 1;
        sampleInput[0][1] = 2;
        sampleInput[0][2] = 3;

        sampleInput[1][0] = 4;
        sampleInput[1][1] = 5;
        sampleInput[1][2] = 6;

        sampleInput[2][0] = 7;
        sampleInput[2][1] = 8;
        sampleInput[2][2] = 9;


        diagonalTraverse.findDiagonalOrder(sampleInput);

    }

    /**
     * Plain Call
     */
    @Test
    public void findDiagonalOrder_2() {

        int[][] sampleInput = new int[3][3];
        sampleInput[0][0] = 1;
        sampleInput[0][1] = 2;
        sampleInput[0][2] = 3;

        sampleInput[1][0] = 4;
        sampleInput[1][1] = 5;
        sampleInput[1][2] = 6;

        sampleInput[2][0] = 7;
        sampleInput[2][1] = 8;
        sampleInput[2][2] = 9;


        diagonalTraverse.findDiagonalOrder(sampleInput);

    }

    /**
     * Just Column Matrix
     */
    @Test
    public void justColumnMatrixTest() {

        int[][] sampleInput = new int[3][1];
        sampleInput[0][0] = 1;

        sampleInput[1][0] = 4;

        sampleInput[2][0] = 7;


        diagonalTraverse.findDiagonalOrder(sampleInput);

    }

    /**
     * Just Row Matrix
     */
    @Test
    public void justRowMatrixTest() {

        int[][] sampleInput = new int[1][3];
        sampleInput[0][0] = 1;

        sampleInput[0][1] = 4;

        sampleInput[0][2] = 7;


        int[] output = diagonalTraverse.findDiagonalOrder(sampleInput);
        System.out.println("Test");

    }
}