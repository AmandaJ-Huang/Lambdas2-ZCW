import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class SocialNetworkAppTest {

    private Person bob = new PersonBuilder()
            .setName("Bob")
            .setEmailAddress("bob@email.com")
            .setGender(Person.Sex.MALE)
            .setBirthday(LocalDate.of(1990, 1, 1))
            .createPerson();

    private Person michelle = new PersonBuilder()
            .setName("Michelle")
            .setEmailAddress("michelle@email.com")
            .setGender(Person.Sex.FEMALE)
            .setBirthday(LocalDate.of(1995, 1, 1))
            .createPerson();

    private Person angel = new PersonBuilder()
            .setName("Angel")
            .setBirthday(LocalDate.of(2000, 1, 1))
            .setGender(Person.Sex.FEMALE)
            .setEmailAddress("angel@email.com")
            .createPerson();

    private Person dominic = new PersonBuilder()
            .setBirthday(LocalDate.of(2010, 1, 1))
            .setName("Dominic")
            .setGender(Person.Sex.MALE)
            .setEmailAddress("dominic@email.com")
            .createPerson();

    private Person tim = new PersonBuilder()
            .setBirthday(LocalDate.of(2015, 1, 1))
            .setName("Tim")
            .setGender(Person.Sex.MALE)
            .setEmailAddress("tim@email.com")
            .createPerson();

    private List<Person> roster = Arrays.asList(bob, michelle, angel, dominic, tim);

    @Test
    public void testConstructor() {
        // Given
        SocialNetworkApp app = new SocialNetworkApp(roster);
        Integer expected = 5;

        // When
        Integer actual = app.getSize();

        // Then
        Assert.assertEquals(expected, actual);
    }


}
