package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
        
        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        
        Arrays.sort(players);
        for(Player p : players) {
            if(p.getNationality().equals("FIN")) {
                System.out.println(p.getName() + " " + p.getTeam() + " " + p.getGoals() + " + " + p.getAssists() + " = " + ((int)p.getGoals() + (int)p.getAssists()));
            }
        }
    }
  
}