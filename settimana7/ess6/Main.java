package settimana7.ess6;

public class Main {
    public static void main(String[] args) {

        User utente1 = User.getInstance();

        System.out.println("Informazioni di utente 1");
        utente1.stampaInformazioni();

        utente1.setNome("Danilo");
        utente1.setEta(23);

        System.out.println("\nInformazioni di utente 1 modificate");
        utente1.stampaInformazioni();

        User utente2 = User.getInstance();

        System.out.println("\nInformazioni di utente 2");
        utente2.stampaInformazioni();

        utente2.setNome("Mario");
        utente2.setEta(27);

        
        System.out.println("\nInformazioni di utente 2 modificate");
        utente2.stampaInformazioni();


    }
}
