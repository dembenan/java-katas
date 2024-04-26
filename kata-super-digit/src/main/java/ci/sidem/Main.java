package ci.sidem;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String n = "3445345365";
        int k = 3;
        int result = SuperDigitResult.superDigit(n, k);
        System.out.print("result======"+result);
    }
}