package rank.algorithm.sortingDemo;

import java.util.Scanner;

public class tools {

    public static int[] readData(){
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String input=sc.nextLine();
        String  inputArray[]=new String [length];
        int array[]=new int[length];
        inputArray= input.split(" ");

        for (int i=0;i<length;i++){
            array[i]=Integer.parseInt(inputArray[i]);
        }
        sc.close();

       return array;
    }
}
