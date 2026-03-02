package appbank.main;

import appbank.domain.Person;

public class Main {
    public static void main(String[] args) {
        Person persona1 = new Person();
        System.out.println(persona1.getName());
        Person persona2 = new Person("214578","Carolina","anonix@gmail.com");
        System.out.println(persona2.getName());
        persona1.setName("Daniela");
        System.out.println(persona1.getName());
    }
}
