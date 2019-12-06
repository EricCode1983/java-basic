package rank.medium;

import java.util.HashMap;
import java.util.Scanner;

public class GridSearchDemo {


    static String gridSearch(String[] G, String[] P) {


        System.out.println(G);
        System.out.println(P);


        int gRowNum =G.length;
        int gColNum=G[0].length();
        int pRowNum=P.length;
        int pColNum=P[0].length();

         P[0].charAt(0);
         int startIndex=0;
         String subString=P[0],result="NO";
        HashMap<Integer,Integer> matchIndex=new HashMap<>();
        for (int i = 0; i< gRowNum; i++)
        {
            //1 找出每行包含P[0] 的起头位置 放入2维数组中
           while (subString.indexOf(P[0],startIndex)>0){

               matchIndex.put(i,subString.indexOf(P[0]));
               startIndex=subString.indexOf(P[0])+1;

           }

        }

        for (HashMap.Entry<Integer, Integer> item : matchIndex.entrySet()) {

            int rowIndex=item.getKey();
            int columIndex=item.getValue();
            int flag=1;
            if((rowIndex+pRowNum)<gRowNum-1) {
                for (int i = 1; i < P.length; i++) {

                    if (G[rowIndex + i].indexOf(P[rowIndex + i], columIndex) > 0) {
                        flag++;
                    } else {
                        break;
                    }
                }
            }

            if (flag==P.length){
                result="YES";
                break;
            }


        }






        //2 循环2维数组看一样的开头有没有包含接下来的字符串

        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            System.out.println(result);
        }



        scanner.close();
    }
}
