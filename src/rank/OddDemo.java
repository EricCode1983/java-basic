package rank;

import java.util.Scanner;

public class OddDemo {


    private static void isOdd(int input){


        if(input%2!=0){
            System.out.println("Weird");
        }
        else if ((input>=2&&input<=5)||input>20){
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Weird");
        }

    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int i=0,n=0;

          while (i==0) {
              n = scanner.nextInt();
              scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
              isOdd(n);
          }
            scanner.close();


    }
}
