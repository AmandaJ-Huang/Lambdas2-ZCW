import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class PersonTest {

    @Test
    public void testConstructor() {
        // Given
        String name = "Stella";
        LocalDate birthday = LocalDate.MAX;
        Person.Sex gender = Person.Sex.FEMALE;
        String emailAddress = "stella@gmail.com";

        Person person = new PersonBuilder()
                .setName(name)
                .setBirthday(birthday)
                .setGender(gender)
                .setEmailAddress(emailAddress)
                .createPerson();

        // When
        String actualName = person.getName();
        LocalDate actualBirthday = person.getBirthday();
        Person.Sex actualGender = person.getGender();
        String actualEmailAddress = person.getEmailAddress();

        // Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthday, actualBirthday);
        Assert.assertEquals(gender, actualGender);
        Assert.assertEquals(emailAddress, actualEmailAddress);
    }

    @Test
    public void testGetAge() {
        // Given
        Person person = new PersonBuilder()
                .setName("Bob")
                .setBirthday(LocalDate.of(1994, 4, 20))
                .createPerson();
        Integer expected = 27;

        // When
        Integer actual = person.getAge();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
