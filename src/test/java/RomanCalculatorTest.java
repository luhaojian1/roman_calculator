import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanCalculatorTest {

  @Test
  void should_return_II_when_calculate_given_both_two_numbers_are_I() {
    String firstNumeral = "I";
    String secondNumeral = "I";

    RomanCalculator romanCalculator = new RomanCalculator();
    String result = romanCalculator.calculate(firstNumeral, secondNumeral);

    assertEquals("II", result);
  }


}
