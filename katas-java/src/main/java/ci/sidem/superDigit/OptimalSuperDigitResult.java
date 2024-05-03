package ci.sidem.superDigit;

import java.math.BigInteger;

public class OptimalSuperDigitResult {
    public static BigInteger getSum(String p){
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < p.length(); i++) {
            String ch =Character.toString(p.charAt(i));
            sum=sum.add(new BigInteger(ch)) ;
        }
        return sum;
    }

    public static BigInteger superDigit(String n, BigInteger k) {
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

}
