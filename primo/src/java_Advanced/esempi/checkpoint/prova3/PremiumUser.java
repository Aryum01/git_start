package java_Advanced.esempi.checkpoint.prova3;

enum UserLivel {
    BASIC, PRO, VIP
}

public abstract class PremiumUser implements User {

    private final UserLivel livel;

    public PremiumUser(UserLivel livel) {
        this.livel = livel;
    }

    public UserLivel getLivel(){
        return livel;
    }
}
