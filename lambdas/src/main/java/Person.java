import java.time.LocalDate;
import java.time.Period;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person() {

    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        Period period = Period.between(this.birthday, LocalDate.now());
        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Name: " + name)
                .append("\nBirthday: " + birthday)
                .append("\nGender: " + gender)
                .append("\nEmail: " + emailAddress)
                .toString();

        /* format =
        Name: name
        Birthday: yyyy-mm-dd
        Gender: MALE/FEMALE
        Email: email
         */
    }

    public void printPerson() {
        System.out.println(this);
    }


}
