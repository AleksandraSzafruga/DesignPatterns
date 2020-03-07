package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class BuilderDemo {

    public static void main(String[] args) {

       final Player player = new Player.Builder().withHealth(100)
                .withMana(50)
                .withUsername("Zofia")
                .withFriends(List.of())
                .build();

       Person.builder()
               .age(20)
               .firstName("Zofia")
               .lastName("Nana");
    }
}
