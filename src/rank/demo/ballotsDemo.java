package rank.demo;

import oracle.jvm.hotspot.jfr.StreamWriter;

import java.util.*;

public class ballotsDemo {




    public static String writeIn(List<String> ballot) {
        // Write your code here

        Map <String,Integer> voteMap=new HashMap<String,Integer>();

        for (String name:ballot){
             if(voteMap.keySet().contains(name))
                 voteMap.put(name, voteMap.get(name)+1);
             else
                 voteMap.put(name,1);
        }

        int maxVotePerson=0;
        String bidGuy="";

        for(Map.Entry<String,Integer> entry:voteMap.entrySet()){
            String key=entry.getKey();
            Integer val=entry.getValue();

            if(val>maxVotePerson){
                maxVotePerson=val;
                bidGuy=key;
            }
            else if(val==maxVotePerson && bidGuy.compareTo(key)<0){
                bidGuy=key;
            }
        }

        return bidGuy;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {

        int ballotCount = 3;

        List<String> lst=new ArrayList<String>();


        for (int i = 0; i < 3; i++) {
            String name = scanner.nextLine();
            lst.add(name);
        }

        String result=writeIn(lst);
        System.out.println(result);


    }

}
