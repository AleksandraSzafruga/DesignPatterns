package pl.sdacademy.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AdapterDemo {
    public static void main(String[] args) {

        final List<User> users = new ArrayList<>();
        final SystemAUser userA = new SystemAUser("Andrzej", "Andrzejewski", 22L,List.of("USER"));
        final SystemAUser userA2 = new SystemAUser("Andrzej", "Andrzejewski", 22L,List.of("ADMIN"));
        final SystemBUser userB = new SystemBUser("Michal Nowak", "mn", 22, Set.of("USER","ADMIN"));

        users.add(new SystemAUserAdapter(userA));
        users.add(new SystemAUserAdapter(userA2));
        users.add(new SystemBUserAdapter(userB));

        users.forEach(user -> System.out.println(user.toString()));
    }
}
