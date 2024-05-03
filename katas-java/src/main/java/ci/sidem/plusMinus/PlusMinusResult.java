package ci.sidem.plusMinus;

import java.util.List;
import java.util.stream.Collectors;

public class PlusMinusResult {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        Double plusRatio = new Double(0);
        Double minusRatio = new Double(0);
        Double zerosRatio = new Double(0);
        List<Integer> plus = arr.stream().filter(p -> p > 0).collect(Collectors.toList());
        List<Integer> minus = arr.stream().filter(p -> p < 0).collect(Collectors.toList());
        List<Integer> zeros = arr.stream().filter(p -> p == 0).collect(Collectors.toList());
        if (arr.size() > 0) {
            if (plus.size()>0) {
                plusRatio = Double.valueOf(plus.size())/Double.valueOf(arr.size());
            }
            if (minus.size()>0) {
                minusRatio = Double.valueOf(minus.size())/Double.valueOf(arr.size());
            }
            if (zeros.size()>0) {
                zerosRatio = Double.valueOf(zeros.size())/Double.valueOf(arr.size());
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f",plusRatio,minusRatio,zerosRatio);
    }
}
