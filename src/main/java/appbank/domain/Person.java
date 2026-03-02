package appbank.domain;

import java.util.List;

public class Person {
    String idNumber;
    String name;
    String lastName;
    String phone;
    String city;
    String email;
    String addres;
    String birthdate;

    //Metodos propios

    public Person createUser(Person person){
        return person;
    }

    public Person updatePerson(Person person){
        return person;
    }

    public List<Person> getAllperson(){
        return null;
    }

    public Person getPersonById(int id){
        return null;
    }

    public void deletePerson(int id){}

    //Constructor
    public Person(){}
    public Person(String idNumber, String name, String email){
        this.idNumber = idNumber;
        this.name = name;
        this.email = email;
    }

    public Person(String idNumber, String name, String lastName, String phone, String city, String email, String addres, String birthdate) {
        this.idNumber = idNumber;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.city = city;
        this.email = email;
        this.addres = addres;
        this.birthdate = birthdate;
    }

    //Getter and Setter

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
