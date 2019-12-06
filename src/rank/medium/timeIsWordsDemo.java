package rank.medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class timeIsWordsDemo {



    static String timeInWords(int h, int m) {



        if(h<1||h>12||m<0||m>=60){
            return "Invalid time.";
        }


        if(m==0){
            return h+" o' clock";
        }

        return "";
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        //bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        System.out.println(result);

        scanner.close();
    }

}
