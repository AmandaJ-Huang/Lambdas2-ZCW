import org.junit.Assert;
import org.junit.Test;

public class SocialNetworkAppTest {

    @Test
    public void testConstructor() {
        // Given
        SocialNetworkApp app = new SocialNetworkApp();
        Integer expected = 1;
        Person bob = new PersonBuilder()
                .setName("Bob")
                .createPerson();

        // When
        app.addToRoster(bob);
        Integer actual = app.getSize();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
