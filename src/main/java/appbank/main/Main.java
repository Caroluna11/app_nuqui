package appbank.main;

import appbank.domain.Nuqui;
import appbank.domain.Person;
import appbank.domain.User;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nuqui appNuqui = new Nuqui("Nuqui", "1.0");
        appNuqui.startSystem();
        int option = 0;

        // tag for while
        userMenu:
        while(true){
            System.out.println("""
                    Menu:
                    1. Registrar usuario
                    2. Buscar usuario por ID
                    3. Mostrar todos los usuarios
                    4. Salir""");

            try{
                option = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número.");
                sc.nextLine();
            }

            switch (option){
                case 1 -> {
                    User user = new User();
                    user.createUser(user);
                    System.out.println(user);
                    if (appNuqui.findUserById(user.getIdNumber()) == null){
                        appNuqui.addUser(user);
                    }
                }
                case 2 -> {
                    System.out.println("Ingrese el ID del usuario:");
                    String idNumber = sc.nextLine();
                    User user = appNuqui.findUserById(idNumber);
                    if (user != null){
                        System.out.println(user);
                    } else {
                        System.out.println("Usuario no encontrado 😔\n");
                    }

                }
                case 3 -> {
                    appNuqui.showAllUsers();
                }
                case 4 -> {
                    appNuqui.closeSystem();
                    break userMenu;
                }
            }

        }
    }
}
