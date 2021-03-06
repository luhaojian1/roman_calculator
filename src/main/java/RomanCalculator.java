import java.util.Arrays;
import java.util.List;
import java.util.Map;
import util.RomanNumbersUtil;

class RomanCalculator {

  private final List<String> romanNumbers = Arrays.asList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
  private final List<Integer> numbers = Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
  private final Map<Character, Integer> baseRomanNumbers = RomanNumbersUtil.getBaseRomanNumbers();

  String calculate(String firstRomanNumber, String secondRomanNumber) throws RomanNumberTooLargeException {

    int firstNumber = getNumber(firstRomanNumber);
    int secondNumber = getNumber(secondRomanNumber);
    if (firstNumber > 1000 || secondNumber > 1000) {
      throw new RomanNumberTooLargeException();
    }

    int sum = firstNumber + secondNumber;

    return mapToRomanNumber(sum);

  }

  private String mapToRomanNumber(int sum) {
    StringBuilder romanNumber = new StringBuilder();
    int index = 0;
    while (index < numbers.size()) {
      if (sum - numbers.get(index) >= 0) {
        romanNumber.append(romanNumbers.get(index));
        sum -= numbers.get(index);
      } else {
        index++;
      }
    }
    return romanNumber.toString();
  }

  private Integer getNumber(String romanNumber) {
    char[] chars = romanNumber.toCharArray();
    if (chars.length == 0) {
      return 0;
    }
    int number = mapToNumber(chars[chars.length - 1]);
    for (int i = chars.length - 2; i >= 0; i--) {
      int nextNumber = mapToNumber(chars[i + 1]);
      int currentNumber = mapToNumber(chars[i]);
      if (currentNumber < nextNumber) {
        number -= currentNumber;
      } else {
        number += currentNumber;
      }
    }
    return number;
  }

  private int mapToNumber(char romanNumber) {
    return baseRomanNumbers.get(romanNumber);
  }

}
