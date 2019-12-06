package rank.algorithm.sortingDemo;

import java.util.Scanner;

public class bubbleSorting {

    public static void main(String[] args) {

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

        bubbleSorting(array);
    }

    private static void bubbleSorting(int array[]){

        int length=array.length;
        int i,j,temp;
        for ( i=0;i<length;i++){
            for (j=0;j<length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        for (i=0;i<length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
