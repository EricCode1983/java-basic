package rank.medium;

import java.io.*;
import java.util.Scanner;

public class ClimbingTheLeaderBoard {


    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {


        int alicePoistion=0;

        int [] rank=new int[scores.length];
        int [] aliceRank=new int [alice.length];

        int flag=1;
        rank[0]=1;
        System.out.println(rank[0]);
        for (int j=1;j<scores.length;j++){

              if (scores[j-1] == scores[j]) {
                    rank[j] = flag;
                } else {

                    rank[j] = ++flag;
              }

            //System.out.println(" "+rank[j]);

        }

        for (int i=0;i<aliceRank.length;i++){

            for (int j=scores.length-1;j>=0;j--){

                if(alice[i]==scores[j]){
                    aliceRank[i]=rank[j];
                    break;
                }
                else if (alice[i]<scores[j]){
                    aliceRank[i]=rank[j]+1;
                    break;
                }
                else if (alice[i]>scores[j]&&j==0){
                    aliceRank[i]=1;
                    break;
                }


            }
        }

        return aliceRank;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        try
        {
            File file=new File("demo.txt");    //creates a new file instance
            FileReader fr=new FileReader(file);   //reads the file
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
            String sScoreNumber=br.readLine();
            String scoreLine=br.readLine();
            String  sPlayNumber=br.readLine();
            String aliceScoreLine=br.readLine();

            int  scoreNumber=Integer.parseInt(sScoreNumber);
            int playNumber=Integer.parseInt(sPlayNumber);
            int[] scores = new int[scoreNumber];
            int[] playScores=new int [playNumber];

            String[] scoresItems=scoreLine.split( " ");
            String[] playItems=aliceScoreLine.split( " ");

            for (int i=0;i<scoreNumber;i++){
                if(!scoresItems[i].equals("")) {
                    scores[i] = Integer.parseInt(scoresItems[i]);
                }
            }

            for (int i=0;i<playNumber;i++){

                if(!playItems[i].equals( "")) {
                    playScores[i] = Integer.parseInt(playItems[i]);
                }
            }

            int[] result =  climbingLeaderboard(scores,playScores);
            fr.close();    //closes the stream and release the resources
            System.out.println("Contents of File: ");
            System.out.println(sb.toString());   //returns a string that textually represents the object


            for (int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }



    private void readByScanner(){
//        BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter("Buffered.txt"));
//
//        int scoresCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] scores = new int[scoresCount];
//
//        String[] scoresItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < scoresCount; i++) {
//            int scoresItem = Integer.parseInt(scoresItems[i]);
//            scores[i] = scoresItem;
//        }
//
//        int aliceCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] alice = new int[aliceCount];
//
//        String[] aliceItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < aliceCount; i++) {
//            int aliceItem = Integer.parseInt(aliceItems[i]);
//            alice[i] = aliceItem;
//        }
//
//        int[] result = climbingLeaderboard(scores, alice);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
