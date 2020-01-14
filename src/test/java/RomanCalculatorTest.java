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

  @Test
  void should_return_III_when_calculate_given_number1_I_number2_II() {
    String firstNumeral = "I";
    String secondNumeral = "II";

    RomanCalculator romanCalculator = new RomanCalculator();
    String result = romanCalculator.calculate(firstNumeral, secondNumeral);

    assertEquals("III", result);
  }

  @Test
  void should_return_IV_when_calculate_given_number1_I_number2_III() {
    String firstNumeral = "I";
    String secondNumeral = "III";

    RomanCalculator romanCalculator = new RomanCalculator();
    String result = romanCalculator.calculate(firstNumeral, secondNumeral);

    assertEquals("IV", result);
  }

  @Test
  void should_return_VIII_when_calculate_given_number1_IV_number2_IV() {
    String firstNumeral = "IV";
    String secondNumeral = "IV";

    RomanCalculator romanCalculator = new RomanCalculator();
    String result = romanCalculator.calculate(firstNumeral, secondNumeral);

    assertEquals("VIII", result);
  }

  @Test
  void should_return_IX_when_calculate_given_number1_IV_number2_V() {
    String firstNumeral = "IV";
    String secondNumeral = "V";

    RomanCalculator romanCalculator = new RomanCalculator();
    String result = romanCalculator.calculate(firstNumeral, secondNumeral);

    assertEquals("IX", result);
  }

  @Test
  void should_return_XXVIII_when_calculate_given_number1_XIII_number2_XV() {
    String firstNumeral = "XIII";
    String secondNumeral = "XV";

    RomanCalculator romanCalculator = new RomanCalculator();
    String result = romanCalculator.calculate(firstNumeral, secondNumeral);

    assertEquals("XXVIII", result);
  }

  @Test
  void should_return_LXXIII_when_calculate_given_number1_XXXIV_number2_XXXIX() {
    String firstNumeral = "XXXIV";
    String secondNumeral = "XXXIX";

    RomanCalculator romanCalculator = new RomanCalculator();
    String result = romanCalculator.calculate(firstNumeral, secondNumeral);

    assertEquals("LXXIII", result);
  }

}
