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

    // Approach 1 - match one (age)
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    // Approach 2 - general search
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
}
