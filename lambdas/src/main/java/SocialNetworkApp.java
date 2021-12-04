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
}
