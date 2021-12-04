import java.util.ArrayList;
import java.util.List;

public class SocialNetworkApp {
    private List<Person> roster;

    public SocialNetworkApp() {
        this(new ArrayList<>());
    }

    public SocialNetworkApp(List<Person> roster) {
        this.roster = roster;
    }

    public void addToRoster(Person person) {
        this.roster.add(person);
    }

    public List<Person> getRoster() {
        return this.roster;
    }

    public Integer getSize() {
        return this.roster.size();
    }

}
