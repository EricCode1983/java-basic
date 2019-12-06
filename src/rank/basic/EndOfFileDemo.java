package rank.basic;

import java.util.Scanner;

public class EndOfFileDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0;
        while(in.hasNextLine()) {

            i++;
            String s = in.nextLine();
            System.out.println(i+" "+s);
        }
        in.close();
    }

}
