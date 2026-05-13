import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoTest{

    @Test
    public void testThatChecksThePricesConditionsMatchTheDiscountPromoWhenItsSTARTER10(){

        String dicountChoice = "STARTER10";
        int lessThanFiveThousand = 5000;
        int lessThanFiveThousandIsSevenFive = 7500;
        int lessThanFiveThousandIsSixThousand = 6999;
        int lessThanFiveThousandIsNineNine = 9999;
        int lessThanFiveThousandIsTenThousand = 10000;
        int lessThanFiveThousandIsTWelveThousand = 12000;
        int lessThanFiveThousandIsThirteenThousand = 13500;
        int lessThanFiveThousandIsFourteenNineNineNine = 14999;

        int expectedPriceRangeOne = OshoFreePromo.discountPriceRange(lessThanFiveThousand, dicountChoice);
    
        int actualPriceRange = 10;
        assertEquals(actualPriceRange, expectedPriceRangeOne);

        int expectedPriceRangeTwo = OshoFreePromo.discountPriceRange(lessThanFiveThousandIsSevenFive, dicountChoice);
        assertEquals(actualPriceRange, expectedPriceRangeTwo);


        int expectedPriceRangeThree = OshoFreePromo.discountPriceRange(lessThanFiveThousandIsSixThousand, dicountChoice);
        assertEquals(actualPriceRange, expectedPriceRangeThree);

        int expectedPriceRangeFour = OshoFreePromo.discountPriceRange(lessThanFiveThousandIsNineNine, dicountChoice);
        assertEquals(actualPriceRange, expectedPriceRangeFour);

        int expectedPriceRangeFive = OshoFreePromo.discountPriceRange(lessThanFiveThousandIsThirteenThousand, dicountChoice);
        assertEquals(actualPriceRange, expectedPriceRangeFive);

        int expectedPriceRangeSix = OshoFreePromo.discountPriceRange(lessThanFiveThousandIsTWelveThousand, dicountChoice);
        assertEquals(actualPriceRange, expectedPriceRangeSix);


        int expectedPriceRangeSeven = OshoFreePromo.discountPriceRange(lessThanFiveThousandIsThirteenThousand, dicountChoice);
        assertEquals(actualPriceRange, expectedPriceRangeSeven);


        int expectedPriceRangeEight = OshoFreePromo.discountPriceRange(lessThanFiveThousandIsFourteenNineNineNine, dicountChoice);
        assertEquals(actualPriceRange, expectedPriceRangeEight);
        
    }

    @Test
    public void testThatChecksThePricesConditionsMatchTheDiscountPromoWhenItsBIGBOY20(){

    int price = 15000;
    int priceTwo = 17500;
    int priceThree = 29999;
    String promoCodes = "BIGBOY20";
    int actualDiscountPrice = 20;

    int expectedDiscountOne = OshoFreePromo.discountPriceRange(price, promoCodes);
    assertEquals(actualDiscountPrice, expectedDiscountOne);

    int expectedDiscountTwo = OshoFreePromo.discountPriceRange(priceTwo, promoCodes);
    assertEquals(actualDiscountPrice, expectedDiscountTwo);
    
    int expectedDiscountThree= OshoFreePromo.discountPriceRange(priceThree, promoCodes);
    assertEquals(actualDiscountPrice, expectedDiscountThree);

    }

        @Test
    public void testThatChecksThePricesConditionsMatchTheDiscountPromoWhenItsOSHOFREE35(){

    int firstPrice = 30000;
    int secondPrice = 50000;
    int thirdPrice = 2994899;
    String promo = "OSHOFREE35";
    int actualDiscount = 35;
    int expectedDiscountAmountOne = OshoFreePromo.discountPriceRange(firstPrice, promo);
    assertEquals(actualDiscount, expectedDiscountAmountOne);

    int expectedDiscountAmountTwo = OshoFreePromo.discountPriceRange(secondPrice, promo);
    assertEquals(actualDiscount, expectedDiscountAmountTwo);
    
    int expectedDiscountAmountThree= OshoFreePromo.discountPriceRange(thirdPrice, promo);
    assertEquals(actualDiscount, expectedDiscountAmountThree);
    }


}
