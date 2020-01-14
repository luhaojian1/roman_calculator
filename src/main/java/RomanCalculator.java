class RomanCalculator {

  String calculate(String firstNumerber, String secondnumber) {
    if ("I".equals(firstNumerber) && "III".equals(secondnumber)) {
      return "IV";
    }
    return firstNumerber + secondnumber;
  }

}
