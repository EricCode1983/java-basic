package rank.algorithm.sortingDemo;

import java.util.Scanner;

/*选择排序*/
public class selectSortDemo {

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
        sc.close();

        selectSort(array,length);
    }


    private static void selectSort(int []array,int n){


        int i,j,min=0,k;
        for (i=0;i<n-1;i++){
            min=i;
            for (j=i;j<n;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }

            if(min!=i)
            {
                k=array[min];
                array[min]=array[i];
                array[i]=k;
            }
        }

        for (i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
