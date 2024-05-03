package ci.sidem.miniMaxSum;

import java.math.BigInteger;
import java.util.List;

public class OptimalMinMaxSumResult {

    public static void triParSelection(List<BigInteger> tab){
        System.out.println("TABLEAU NON TRIER ====={}\n"+tab);
        for (int i = 0; i < tab.size() - 1; i++) {
            int min = i;
            for (int j = i+1; j < tab.size(); j++) {
                if (tab.get(j).compareTo(tab.get(min))<0) {
                    min = j;
                }
            }
            BigInteger tmp = tab.get(i);
            tab.set(i,tab.get(min));
            tab.set(min,tmp);
        }
        System.out.println("TABLEAU  TRIER ====={}   "+tab);
    }

    public static void miniMaxSum(List<BigInteger> arr) {
        BigInteger minSum =  BigInteger.ZERO;
        BigInteger maxSum = BigInteger.ZERO;
        // Write your code here
        triParSelection(arr);
        for (int i = 1; i < arr.size(); i++) {
            maxSum.add(arr.get(i));
        }
        for (int i = 0; i < arr.size() -1; i++) {
            minSum.add( arr.get(i));
        }
        System.out.printf("%s %s",minSum,maxSum);

    }
}
