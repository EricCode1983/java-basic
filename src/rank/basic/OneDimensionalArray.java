package rank.basic;

import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer number=sc.nextInt();

        int [] arrayResult=new int[number];

        for (int i=0;i<number;i++){
           arrayResult[i]=sc.nextInt();
        }

        for (int i = 0; i < arrayResult.length; i++) {
            System.out.println(arrayResult[i]);
        }

        sc.close();
    }
}
