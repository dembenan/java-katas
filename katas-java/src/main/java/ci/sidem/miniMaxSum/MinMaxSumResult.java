package ci.sidem.miniMaxSum;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MinMaxSumResult {
    public static void main(String[] args) {
        List<BigInteger> tab = new ArrayList<>();
        tab.add(new BigInteger("1"));
        tab.add(new BigInteger("2"));
        tab.add(new BigInteger("3"));
        tab.add(new BigInteger("4"));
        tab.add(new BigInteger("5"));
        miniMaxSum(tab);
    }


    public static void miniMaxSum(List<BigInteger> arr) {
        BigInteger minSum = BigInteger.ZERO;
        BigInteger maxSum = BigInteger.ZERO;
        // Write your code here
        AlgorithmesTri.triParSelection(arr);
        for (int i = 0; i < arr.size() -1; i++) {
            minSum = minSum.add(arr.get(i));
        }
        for (int i = 1; i < arr.size(); i++) {
            maxSum = maxSum.add(arr.get(i));
        }
        System.out.printf("%s %s",minSum,maxSum);

    }
}
