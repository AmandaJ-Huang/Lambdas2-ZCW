import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        // People
        Person bob = new PersonBuilder().setName("Bob")
                .setEmailAddress("bob@email.com")
                .setGender(Person.Sex.MALE)
                .setBirthday(LocalDate.of(1990, 1, 1))
                .createPerson();

        Person michelle = new PersonBuilder()
                .setName("Michelle")
                .setEmailAddress("michelle@email.com")
                .setGender(Person.Sex.FEMALE)
                .setBirthday(LocalDate.of(1995, 1, 1))
                .createPerson();

        Person angel = new PersonBuilder()
                .setName("Angel")
                .setBirthday(LocalDate.of(2000, 1, 1))
                .setGender(Person.Sex.FEMALE)
                .setEmailAddress("angel@email.com")
                .createPerson();

        Person dominic = new PersonBuilder()
                .setBirthday(LocalDate.of(2010, 1, 1))
                .setName("Dominic")
                .setGender(Person.Sex.MALE)
                .setEmailAddress("dominic@email.com")
                .createPerson();

        Person tim = new PersonBuilder()
                .setBirthday(LocalDate.of(2015, 1, 1))
                .setName("Tim")
                .setGender(Person.Sex.MALE)
                .setEmailAddress("tim@email.com")
                .createPerson();

        // SocialNetwork
        List<Person> roster = Arrays.asList(bob, michelle, angel, dominic, tim);
        SocialNetworkApp socialNetworkApp = new SocialNetworkApp(roster);
    }
}
