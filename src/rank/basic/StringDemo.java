package rank.basic;

import java.util.Scanner;

public class StringDemo {


    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//
//        String c=A+B;
//        System.out.println(c.length());
//
//        int i= stringCompare(A,B);
//
//        if (i<=0){
//            System.out.println("No");
//        }
//
//        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1));
//        System.out.println(B.substring(0,1).toUpperCase()+B.substring(1));
//        Scanner in = new Scanner(System.in);
////        String S = in.next();
////        int start = in.nextInt();
////        int end = in.nextInt();
////
////        System.out.println(S.substring(start,end));

        stringReverse();

    }


    public static void stringReverse(){

        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        int j=0;
        int length=str1.length();
        boolean palindrome=true;
        for (int i=0;i<length/2;i++){

            j=length-i-1;
            if(j>i){
                if(str1.charAt(i)!=str1.charAt(j)){
                    palindrome=false;
                    break;
                }
            }
        }
        System.out.println(palindrome);
    }


    public static int stringCompare(String str1,
                                    String str2)
    {
        for (int i = 0; i < str1.length() &&
                i < str2.length(); i++) {
            if ((int)str1.charAt(i) ==
                    (int)str2.charAt(i)) {
                continue;
            }
            else {
                return (int)str1.charAt(i) -
                        (int)str2.charAt(i);
            }
        }

        // Edge case for strings like
        // String 1="Geeky" and String 2="Geekyguy"
        if (str1.length() < str2.length()) {
            return (str1.length()-str2.length());
        }
        else if (str1.length() > str2.length()) {
            return (str1.length()-str2.length());
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
}
