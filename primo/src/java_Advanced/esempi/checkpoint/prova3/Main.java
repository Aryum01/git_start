package java_Advanced.esempi.checkpoint.prova3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        RealUser user1 = new RealUser("Gabriele", null, null);
        RealUser user2 = new RealUser("Giovanni", "Pietro di", null);

        PremiumUser premiumUser1 = new RealUser("Miao", "miao", UserLivel.PRO);

        UserManager userManager = new UserManager();
        userManager.addUser(user1);
        userManager.addUser(user2);
        userManager.addUser(premiumUser1);

        userManager.printUsers();
        System.out.println(" ");

        UserLivel livelToSearch = UserLivel.PRO;
        List<User> search = userManager.livelUser(livelToSearch);
        for (User user : search) {
            System.out.println(user.getName() + " " + user.getSurname());
        }
    }
}
