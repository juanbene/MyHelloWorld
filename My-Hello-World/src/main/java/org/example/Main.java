package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String firsName;
        String lastName;
        int age;
        System.out.println("Digite o seu nome: ");
        firsName = keyboard.next();
        System.out.println("Digite o seu sobrenome: ");
        lastName = keyboard.next();
        System.out.println("Digite a sua idade: ");
        age = keyboard.nextInt();
        System.out.println(firsName + " " + lastName+ ", " + age + " anos");
    }
}