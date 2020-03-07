package pl.sdacademy.designpatterns.adapter;

import java.util.List;

public interface User {
    String getFullname();
    String getUsername();
    long getAge();
    List <String> getRoles();


}
