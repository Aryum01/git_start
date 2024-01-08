package java_Advanced.esempi.checkpoint.prova3;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> usersList = new ArrayList<>();

    public void addUser(User users) {
        usersList.add(users);
    }

    public void removeUser(User users) {
        usersList.remove(users);
    }

    public void printUsers() {
        for (User user : usersList) {
            System.out.println(user.getName() + " " + user.getSurname());
        }
        System.out.println(" ");
    }

    public List<User> livelUser(UserLivel livel) {
        List<User> userLivel = new ArrayList<>();
        for (User user : usersList) {
            if (user instanceof PremiumUser premiumUser && premiumUser.getLivel() == livel) {
                userLivel.add(user);
            }
        }
        return userLivel;
    }
}
