package settimana7.ess4;

public class PersonBuilder {

    public String firstName;
    public String lastName;
    public Integer age = null;
    public String address = null;

    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
