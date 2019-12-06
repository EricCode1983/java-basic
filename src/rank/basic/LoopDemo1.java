package rank.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoopDemo1 {



    private  static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int []nums= {2,7,11,15};
        int result[]=twoSum(nums,26);

        System.out.println(Arrays.toString(result));


        ArrayList <Integer> integerArrayList=new ArrayList<>();


    }


    public static void reverseString(char[] s) {

        for (int i=s.length-1; i>=0;i--) {

            System.out.print(s[i]);

        }


    }

    public static int[] twoSum(int []nums,int tartget){
        int length=nums.length;

        int [] twoSum={0,0};
        int flag=0;
        for (int i=0;i<length;i++){

            for (int j=i+1;j<length;j++){
                int calResult=nums[i]+nums[j];
                if(tartget==calResult)
                {
                    twoSum[0]=i;
                    twoSum[1]=j;
                    flag=1;
                    break;
                }
            }
            if (flag==1){
                break;
            }
        }
        return twoSum;
    }
}
