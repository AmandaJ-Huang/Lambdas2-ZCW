import java.time.LocalDate;

public class PersonBuilder {

    String name;
    LocalDate birthday;
    Person.Sex gender;
    String emailAddress;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public PersonBuilder setGender(Person.Sex gender) {
        this.gender = gender;
        return this;
    }

    public PersonBuilder setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public Person createPerson() {
        return new Person(name, birthday, gender, emailAddress);
    }
}
