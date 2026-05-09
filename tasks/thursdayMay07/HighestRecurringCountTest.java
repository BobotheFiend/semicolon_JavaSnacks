import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HighestRecurringCountTest{

    @Test
    public void thatTheNumberReturnsTheHighestCount(){

    int [] numbers = {5,6,5,9,0,2,5,7,6,8,2,6,7,5};
    
    int expectedCountTotal = HighestRecurringCount.reoccurring(numbers);

    int actualCountTotal = 4;

    assertEquals(actualCountTotal, expectedCountTotal);
    }


}
