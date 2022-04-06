import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
