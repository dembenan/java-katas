package ci.sidem;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        String n = "9";
        BigInteger k = new BigInteger("1");
        BigInteger result = SuperDigitResult.superDigit2(n, k);
        System.out.print("result======"+result);
    }
}