package rank.basic;

import java.util.Scanner;

public class OutputDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String xString="";
        int size=0,spaceNumber=0;
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            if(x>=0&&x<=999){
                if(x<10) {
                    xString="00"+x;
                    size=1;
                }
                else if (x<100){
                    xString="0"+x;
                    size=2;
                }
                else {
                    xString=Integer.toString(x);
                    size=3;
                }

            }
            System.out.print(s1);
            spaceNumber=15-s1.length();

            for (int j=0;j<spaceNumber;j++){
                System.out.print(" ");
            }

            System.out.println(xString);
        }
        System.out.println("================================");
    }
}
