package java_advanced.settimana7.ess4;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder("Danilo", "White");
        builder.age(23);
        builder.address("via roma 25");

        Person person1 = builder.build();
        Person person2 = new PersonBuilder("Piero", "Black").build();

        System.out.println("Prima persona : " + person1);
        System.out.println("seconda persona : " + person2);

    }
}
