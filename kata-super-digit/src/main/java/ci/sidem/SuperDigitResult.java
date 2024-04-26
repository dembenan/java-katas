package ci.sidem;

public class SuperDigitResult {
    public static int superDigit(String n, int k) {
        int superDigit = 0;
        String p = concatString(n, k);
        System.out.println("=====p.length()===="+p.length()+"=========");
        System.out.println("=====p===="+p+"=========");
        System.out.println("=====getsum===="+getSum("123")+"=========");
        while (p.length() != 1) {
            superDigit = getSum(p);
            p = String.valueOf(superDigit);
        }
        return superDigit;
    }
    public static String concatString(String n,int k){
    StringBuilder concatenatedString = new StringBuilder();
         for (int i = 0; i < k; i++) {
        concatenatedString.append(n);
    }
         return concatenatedString.toString();
}
public static int getSum(String p){
    int sum = 0;
    for (int i = 0; i < p.length(); i++) {
        sum+=Character.getNumericValue(p.charAt(i));
    }
    return sum;
}


}
