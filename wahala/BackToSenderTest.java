import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

	@Test
	public void testThatRidersWagesAreReturned(){
		//Given
		int number = 80;
		
		//When
		int expectedWageForTheDay = BackToSender.ridersPayment(number);

		//check
		int actualWageForTheDay = 45000;
		assertEquals(actualWageForTheDay, expectedWageForTheDay);
	}
}
