import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calTest{
   @Test
   void testJanuaryFirstToJanuarySecond() {
    assertEquals(1, Cal.cal(1, 1, 1, 2, 2024));
}
   @Test
   void testDifMonth() {
    assertEquals(122, Cal.cal(1,1,5,3,2023));
   }

    @Test
    void testSameDay() {
        assertEquals(0, Cal.cal(1, 1, 1, 1, 2024));
    }

    @Test
    void testJanuaryFirstToJanuaryThirtyFirst() {
        assertEquals(30, Cal.cal(1, 1, 1, 31, 2024));
    }

    @Test
    void testLeapYear() {
        assertEquals(60, Cal.cal(1, 1, 3, 1, 2024));
    }
    /** 
   @Test
   void invalidYear() {
    boolean isValid = Cal.cal(2,4,5,6,30000);
    assertFalse(isValid, "Invalid year");
   }

   @Test
   void largerMonth1() {
    assertFalse(Cal.cal(6,4,4,4,2002));
   }
   @Test
   void DayBiggerThanMonth(){
    assertfalse(Cal.cal(9,3,10,39,1973));
   }
}
 // Calculate the number of days between the two given days in
   // the same year in accordance with the Gregorian calendar.
   // Examples: January 1 to January 1 is 0 days
   //           January 1 to January 2 is 1 day
   //           January 1 to January 31 is 30 days
   // Preconditions:
   //   1. day1 and day2 must be in same year
   //   2. 1 <= month1, month2 <= 12
   //   3. 1 <= day1 <= maxDaysInMonth1
   //      where maxDaysInMonth1 is defined as the largest valid
   //      day in the specified month1 and year, including any
   //      leap year, as per the Gregorian calendar
   //   4. 1 <= day2 <= maxDaysInMonth2
   //      where maxDaysInMonth2 is defined as the largest valid
   //      day in the specified month2 and year, including any
   //      leap year, as per the Gregorian calendar
   //   5. month1 <= month2
   //   6. month1 == month2 implies day1 <= day2
   //   7. 1 <= year <= 10000 **/
}