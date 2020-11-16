
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String team;
    private int goals;
    private int assists;
    private String nationality;

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public String getTeam() {
        return this.team;
    }

    public int getGoals() {
        return this.goals;
    }

    public int getAssists() {
        return this.assists;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public String getNationality() {
        return this.nationality;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Player player) {
        int s1 = this.goals + this.assists;
        int s2 = player.goals + this.assists;
        if(s1 > s2) return -1;
        if(s1 < s2) return 1;
        return 0;
    }
      
}
