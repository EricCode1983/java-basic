package rank.web;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;


//call other url and get the json files
public class httpGetDemo {


    public static String[] getMovieTitles(String title) {
        List<String> result = new ArrayList<String>();
        try {
            URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + title);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            line = in.readLine();
            int pages = getTotalPages(line);
            for (int i = 1; i <= pages; i++) {
                URL nextURL = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + title + "&page=" + i);
                HttpURLConnection nextCon = (HttpURLConnection) nextURL.openConnection();
                nextCon.setRequestMethod("GET");
                BufferedReader input = new BufferedReader(new InputStreamReader(nextCon.getInputStream()));
                while ((line = input.readLine()) != null) {
                    result.addAll(getTitlesArray(line));
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(result);
        String[] res = new String[result.size()];
        result.toArray(res);
        return res;
    }

    public static int getTotalPages(String str) {
        try {
            Object obj1 = new JSONParser().parse(str);
            JSONObject jo = (JSONObject) obj1;
            return Integer.valueOf(String.valueOf(jo.get("total_pages")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static List<String> getTitlesArray(String str) {
        List<String> result = new ArrayList<String>();
        try {
            Object obj1 = new JSONParser().parse(str);
            JSONObject jo = (JSONObject) obj1;
            JSONArray data = (JSONArray) jo.get("data");
            Iterator<JSONObject> itr = data.iterator();
            while (itr.hasNext()) {
                Object item = new JSONParser().parse(itr.next().toString());
                JSONObject itemObj = (JSONObject) item;
                String theTitle = (String) itemObj.get("Title");
                result.add(theTitle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(result);
        return result;
    }

}
