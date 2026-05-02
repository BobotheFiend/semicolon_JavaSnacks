import org.junit.jupiter.api.Test;
import java.time.*;
//import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.*;

public class mensturalAppTest{
    //DateTimeFormatter formatToDate = DateTimeFormatter.ofPattern(" EEE, MMMM d, yyyy");
    @Test
    public void testThattheNextPeriodOccurenceWillBePredictedSuccesfully(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodCycle = 29;
		
		//When
		LocalDate expectedDate = mensturalApp.nextPeriodOccurence(previousDate, periodCycle);

		//check
		LocalDate actualDate = LocalDate.parse("2026-05-11");
		assertEquals(actualDate, expectedDate);
	}
    @Test
    public void testThattheOvulationDateWillBePredictedSuccesfully(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodCycle = 29;
		
		//When
		LocalDate expectedDate = mensturalApp.ovulationDate(previousDate, periodCycle);

		//check
		LocalDate actualDate = LocalDate.parse("2026-04-27");
		assertEquals(actualDate, expectedDate);
	}
    @Test
    public void testThatTheFirstDateOfThefertilePeriodWillBePredictedSuccesfully(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodCycle = 29;
		
		//When
		LocalDate expectedDate = mensturalApp.fertilePeriodStart(previousDate, periodCycle);

		//check
		LocalDate actualDate = LocalDate.parse("2026-04-22");
		assertEquals(actualDate, expectedDate);
    }

    @Test
    public void testThatTheLastDateOfThefertilePeriodWillBePredictedSuccesfully(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodCycle = 29;
		
		//When
		LocalDate expectedDate = mensturalApp.fertilePeriodEnd(previousDate, periodCycle);

		//check
		LocalDate actualDate = LocalDate.parse("2026-04-27");
		assertEquals(actualDate, expectedDate);
    }


    @Test
    public void testThatTheEndOfPeriodBleedingWillBePredictedSuccesfullyAfterGettingAStartDate(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodTime = 5;
		
		//When
		LocalDate expectedDate = mensturalApp.endOfPeriod(previousDate, periodTime);

		//check
		LocalDate actualDate = LocalDate.parse("2026-04-16");
		assertEquals(actualDate, expectedDate);
    }

    @Test
    public void testThatTheTheFirstSafeDayAfterBleedingStartsWillBePredictedSuccesfully(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodTime = 5;
		
		//When
		LocalDate expectedDate = mensturalApp.safePeriodAfterBleedingStarts(previousDate, periodTime);

		//check
		LocalDate actualDate = LocalDate.parse("2026-04-17");
		assertEquals(actualDate, expectedDate);
    }

    @Test
    public void testThatTheTheLastSafeDayAfterBleedingStartsWillBePredictedSuccesfully(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodCycle = 29;
		
		//When
		LocalDate expectedDate = mensturalApp.safePeriodAfterBleedingEnds(previousDate, periodCycle);

		//check
		LocalDate actualDate = LocalDate.parse("2026-04-21");
		assertEquals(actualDate, expectedDate);
    }

    @Test
    public void testThatTheFirstDateDuringEndOfFertilityWillBePredictedSuccesfully(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodCycle = 29;
		
		//When
		LocalDate expectedDate = mensturalApp.startOfSafePeriodAfterFertilty(previousDate, periodCycle);

		//check
		LocalDate actualDate = LocalDate.parse("2026-04-28");
		assertEquals(actualDate, expectedDate);
    }

    @Test
    public void testThatTheLastDateDuringEndOfFertilityBeforeTheNextPeriodWillBePredictedSuccesfully(){
		//Given that
		LocalDate previousDate = LocalDate.parse("2026-04-12");
        int periodCycle = 29;
		
		//When
		LocalDate expectedDate = mensturalApp.endOfSafePeriodAfterFertilty(previousDate, periodCycle);

		//check
		LocalDate actualDate = LocalDate.parse("2026-05-10");
		assertEquals(actualDate, expectedDate);
    }
}
