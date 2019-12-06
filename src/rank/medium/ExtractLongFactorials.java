package rank.medium;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtractLongFactorials {


    static BigInteger extraLongFactorials(int n) {

        BigInteger bi,value;
        if(n<=1){
            return bi=BigInteger.valueOf(1);
        }
        else {
            value=BigInteger.valueOf(n);
            return extraLongFactorials(n-1).multiply(value);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(extraLongFactorials(25));
    }
}
