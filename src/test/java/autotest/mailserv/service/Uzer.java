package autotest.mailserv.service;

import java.util.Objects;
public class Uzer {
    private String username;
    public Uzer(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uzer)) return false;
        Uzer user = (Uzer) o;
        return Objects.equals(getUsername(), user.getUsername());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
}
