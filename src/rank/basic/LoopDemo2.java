package rank.basic;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-loops/problem

public class LoopDemo2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String []resultArray=new String[t];

            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                String result = calSeries(a, b, n);
                resultArray[i] = result;
            }
            in.close();

            for (int i = 0; i < t; i++) {
                System.out.println(resultArray[i]);
            }

    }


    private static String  calSeries(int a, int b, int n){

       StringBuilder sb=new StringBuilder();
         int sum =a;
            for (int i=0;i<n;i++){

                sum+=(Math.pow(2,i)*b);

                sb.append(sum);
                if(i<n-1) {
                    sb.append(" ");
                }
               // System.out.print(sum);
                //System.out.print(" ");
            }
        //System.out.println("");
        return  sb.toString();
    }


}
