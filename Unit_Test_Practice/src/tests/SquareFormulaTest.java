package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareFormulaTest {

    @Test
    public void testAreaOfSquareWithSideLength5() {

        // Arrange

        int sideLength = 5;

        int expectedArea = 25;


        // Act

        int actualArea = SquareFormula.areaOfSquare(sideLength);


        // Assert

        assertEquals(expectedArea, actualArea);

    }

    
    @Test
    public void testAreaOfSquareWithSideLength16() {

        // Arrange

        int sideLength = 16;

        int expectedArea = 256;


        // Act

        int actualArea = SquareFormula.areaOfSquare(sideLength);


        // Assert

        assertEquals(expectedArea, actualArea);

    }


}
