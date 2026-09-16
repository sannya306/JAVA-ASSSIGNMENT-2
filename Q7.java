class Team {
    String name;
    int wins,draws;
    Team(String n,int w,int d){name=n;wins=w;draws=d;}
    int calculatePoints(){return 0;}
}
class CricketTeam extends Team {
    CricketTeam(String n,int w,int d){super(n,w,d);}
    int calculatePoints(){return wins*2+draws;}
}
class FootballTeam extends Team {
    FootballTeam(String n,int w,int d){super(n,w,d);}
    int calculatePoints(){return wins*3+draws;}
}
public class Q7 {
    public static void main(String[] args) {
        System.out.println(new CricketTeam("India",6,2).calculatePoints());
        System.out.println(new FootballTeam("Barcelona",6,1).calculatePoints());
    }
}
