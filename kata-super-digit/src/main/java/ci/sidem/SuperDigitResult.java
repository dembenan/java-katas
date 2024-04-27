package ci.sidem;

import java.math.BigInteger;

public class SuperDigitResult {
    public static BigInteger superDigit(String n, BigInteger k) {
        BigInteger superDigit = BigInteger.ZERO;
        String p = concatString(n, k);
        while (p.length() != 1) {
            superDigit = getSum(p);
            p = String.valueOf(superDigit);
        }
        return superDigit;
    }
    public static String concatString(String n,BigInteger k){
        StringBuilder concatenatedString = new StringBuilder();
        for (BigInteger i = BigInteger.ZERO; i.compareTo(k)<0; i.add(BigInteger.ONE)) {
            concatenatedString.append(n);
        }
         return concatenatedString.toString();
}
public static BigInteger getSum(String p){
    BigInteger sum = BigInteger.ZERO;
    for (int i = 0; i < p.length(); i++) {
        String ch =Character.toString(p.charAt(i));
        BigInteger b = new BigInteger(ch);
        sum= sum.add(b);
    }
    return sum;
}

    public static BigInteger superDigit2(String n, BigInteger k) {
        BigInteger nSum = getSum(n);
        BigInteger repeatedSum = nSum.multiply(k);
        return superDigitHelper(repeatedSum);
    }

    public static BigInteger superDigitHelper(BigInteger number) {
        if (number.compareTo(BigInteger.TEN) < 0) {
            return number;
        } else {
            return superDigitHelper(getSumDigits(number));
        }
    }

    public static BigInteger getSumDigits(BigInteger number) {
        BigInteger sum = BigInteger.ZERO;
        while (!number.equals(BigInteger.ZERO)) {
            sum = sum.add(number.mod(BigInteger.TEN));
            number = number.divide(BigInteger.TEN);
        }
        return sum;
    }

    public static BigInteger getSum2(String p) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < p.length(); i++) {
            int digit = Character.getNumericValue(p.charAt(i));
            sum = sum.add(BigInteger.valueOf(digit));
        }
        return sum;
    }


}
