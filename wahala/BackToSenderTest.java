import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

	@Test
	public void testThatRidersWagesAreReturned(){
		//Given
		int diliveryNumber = 80;
		
		//When
		int actualWageForTheDay = BackToSender.ridersPayment(diliveryNumber);

		//check
		int expectedWageForTheDay = 45000;
		assertEquals(actualWageForTheDay, expectedWageForTheDay);
	}
}
