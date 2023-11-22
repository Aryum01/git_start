package settimana7.ess6;

public class User {
    private String nome;
    private int eta;

    public User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampaInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
    }

    private static User instance;

    public static User getInstance() {
        if (instance == null) {   
            instance = new User("Default", 0);
        }
        return instance;
    }

}
