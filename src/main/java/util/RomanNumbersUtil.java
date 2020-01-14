package util;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbersUtil {

  private static final Map<Character, Integer> baseRomanNumbers = new HashMap<Character, Integer>();

  static {
    baseRomanNumbers.put('I', 1);
    baseRomanNumbers.put('V', 5);
    baseRomanNumbers.put('X', 10);
    baseRomanNumbers.put('L', 50);
    baseRomanNumbers.put('C', 100);
    baseRomanNumbers.put('D', 500);
    baseRomanNumbers.put('M', 1000);
  }

  public static Map<Character, Integer> getBaseRomanNumbers() {
    return baseRomanNumbers;
  }
}
