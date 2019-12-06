package rank.basic;

import java.util.Scanner;

/*
*
* https://www.hackerrank.com/challenges/java-static-initializer-block/problem?h_r=next-challenge&h_v=zen
* */
public class InitializerBlockDemo {


    static boolean flag;
    static int B,H;

    private static void isParallelogram(){

        Scanner in = new Scanner(System.in);
        B=in.nextInt();
        H=in.nextInt();

        if(B>0&&B<=100&&H>0&&H<=100){
            flag=true;
        }

    }

    public static void main(String[] args) {
        isParallelogram();
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }

}
