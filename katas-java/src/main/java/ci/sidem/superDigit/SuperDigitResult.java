package ci.sidem.superDigit;

import java.math.BigInteger;

public class SuperDigitResult {
    public static BigInteger getSum(String p){
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < p.length(); i++) {
            String ch =Character.toString(p.charAt(i));
            sum=sum.add(new BigInteger(ch)) ;
        }
        return sum;
    }

    public static String customConcatStrig(String n,int k){
        //StringBuffer concaStringBuffer = new StringBuffer();
        String p = "";
        for (int i = 0; i < k; i++) {
            p = p.concat(n);
            //concaStringBuffer.append(n);
        }
        //System.out.println("p initial ==========="+p);
        return p;
    }
    public static BigInteger superDigit(String n, int k) {
        // Write your code here
        BigInteger superDigit = BigInteger.ZERO;
        String p = customConcatStrig(n,k);
        superDigit = getSum(p);
        while (String.valueOf(superDigit).length() != 1) {
            p = String.valueOf(superDigit);
            superDigit = superDigit(p, 1);
        }
        System.out.println("p ==========="+p);
        System.out.println("superDigit ==========="+superDigit);
        return superDigit;
    }


}
