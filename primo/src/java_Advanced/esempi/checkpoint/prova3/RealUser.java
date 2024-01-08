package java_Advanced.esempi.checkpoint.prova3;

public class RealUser extends PremiumUser {

    private final String name;
    private final String surname;

    public RealUser(String name, String surname, UserLivel livel) {
        super(livel);
        this.name = name;
        this.surname = surname;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }
}
