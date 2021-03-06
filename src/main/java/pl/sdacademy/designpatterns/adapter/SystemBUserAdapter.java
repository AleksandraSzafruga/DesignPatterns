package pl.sdacademy.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class SystemBUserAdapter implements User{

    private final SystemBUser systemBUser;

    public SystemBUserAdapter(SystemBUser systemBUser) {
        this.systemBUser = systemBUser;
    }

    @Override
    public String getFullname() {
        return systemBUser.getFullName();
    }

    @Override
    public String getUsername() {
        return systemBUser.getDisplayName();
    }

    @Override
    public long getAge() {
        return systemBUser.getAge();
    }

    @Override
    public List<String> getRoles() {
        return new ArrayList<>(systemBUser.getRoles());
    }
}
