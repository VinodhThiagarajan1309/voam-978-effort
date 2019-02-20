package voam.movethiss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FindTheTripletsTest {


    @InjectMocks
    FindTheTriplets findTheTriplets;

    @Test
    public void sampleFlow() {

        int[] inputArr = new int[6];
        inputArr[0] = -1;
        inputArr[1] = 0;
        inputArr[2] = 1;
        inputArr[3] = 2;
        inputArr[4] = -1;
        inputArr[5] = -4;


        //findTheTriplets
    }


}