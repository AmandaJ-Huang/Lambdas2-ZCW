import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testConstructor() {
        Person person = new Person();
        Assert.assertEquals("Bob", person.getName());
    }
}
