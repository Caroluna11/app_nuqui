package appbank.domain;

import java.util.ArrayList;
import java.util.List;

public class Nuqui {
    String name;
    String version;
    List<User> users;

    //Metodos propios

    public User findUserById(String idNumber){
        for (User user : this.users) {
            if (user.getIdNumber().equalsIgnoreCase(idNumber)) {
                return user;
            }
        }
        return null;
    }
    public void showAllUsers(){
        for (User user : this.users) {
            System.out.println(user.idNumber + " - " + user.getName() + " " + user.getLastName() );
        }
    }
    public void addUser(User user){
        this.users.add(user);
        System.out.println("Se registro el usuario exitosamente.\n");
    }
    public void startSystem(){
        System.out.println("✨ Bienvenido a " + this.name + " ✨");
    }
    public void closeSystem(){
        System.out.println("Adios 🖐, vuelve pronto");
    }

    //Costructores

    public Nuqui(String name, String version) {
        this.name = name;
        this.version = version;
        users = new ArrayList<>();
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
