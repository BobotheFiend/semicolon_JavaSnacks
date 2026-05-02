import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PizzaWahalaTest{

	@Test
	public void testThattheNumberofBoxesareSUFFICENT(){
		//Given
		int numberOfPeople = 45;
		
		//When
		int expectedAmountOfBoxesToBeGiven = PizzaWahalaTest.collectsCustomerOrder(numberOfPeople);

		//check
		int actualAmountOfBoxesToBeGiven = 4;
		assertEquals(actualCount, expectedCount);
	}
