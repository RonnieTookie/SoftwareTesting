import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calTest{
   @Test
void testJanuaryFirstToJanuarySecond() {
    assertEquals(1, Cal.cal(1, 1, 1, 2, 2024));
}
}