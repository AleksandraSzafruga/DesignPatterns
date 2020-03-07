package pl.sdacademy.designpatterns.adapter;

import java.util.List;
import java.util.Set;

public class SystemBUser {
    private String fullName;
    private String displayName;
    private Integer age;
    private Set<String> roles;

    public SystemBUser(String fullName, String displayName, Integer age, Set<String> roles) {
        this.fullName = fullName;
        this.displayName = displayName;
        this.age = age;
        this.roles = roles;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public long getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "SystemBUser{" +
                "firstName='" + fullName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", age=" + age +
                ", roles=" + roles +
                '}';
    }
}
