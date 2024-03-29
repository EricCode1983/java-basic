package rank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int cl=0,valley=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='U'){
              ++cl;
            }
            else if (c=='D'){
                --cl;
            }

             if(cl==0 &&c=='U'){
                 ++valley;
             }
        }
        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("CountingValleys.txt"));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();


        int result = countingValleys(n, s);
        System.out.println(s);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
