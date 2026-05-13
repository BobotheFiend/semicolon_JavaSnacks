import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void testThatTheMeanReturnSomething(){

        double [] collections = {10,20,20,40,50};
        double [] numbers = {100,100,100,100,100,100,100};

        double expectedMean = StandardDeviation.mean(collections);

        double actualMean = 28.00;

        assertEquals(actualMean, expectedMean);

        double expectedMeanTwo = StandardDeviation.mean(numbers);
        double actualMeanTwo = 100.0;
        assertEquals(actualMeanTwo, expectedMeanTwo);

    }

    @Test
    public void testThatTheVarianceReturnsSomething(){
        double [] collections = {10,20,20,40,50};
        double expectedMean = StandardDeviation.variance(collections);
        double actualMean = 216.00;
        assertEquals(actualMean, expectedMean);
    }

    @Test
    public void testThatTheStandarddeviationReturnsSomething(){
        double [] collections = {10,20,20,40,50};
        double expectedMean = StandardDeviation.standardDeviation(collections);
        double actualMean = 14.70;
        assertEquals(actualMean, expectedMean);
    }

}
