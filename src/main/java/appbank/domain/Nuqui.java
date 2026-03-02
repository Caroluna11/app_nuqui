package appbank.domain;

import java.util.List;

public class Nuqui {
    String name;
    String version;
    List<User> users;

    //Metodos propios

    public void startSystem(){}
    public void closeSystem(){}

    //Costructores

    public Nuqui(String name, String version, List<User> users) {
        this.name = name;
        this.version = version;
        this.users = users;
    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
