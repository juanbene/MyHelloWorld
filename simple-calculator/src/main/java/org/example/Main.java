package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Vamos calcular?");
        System.out.print("Digite o primeiro valor: ");
        double num1 = keyboard.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double num2 = keyboard.nextDouble();
        System.out.print("Qual operação deseja realizar? | (+) - ADIÇÃO | (-) SUBTRAÇÃO | (x) MULTIPLICAÇÃO | (/) DIVISÃO | : ");
        char operation = keyboard.next().charAt(0);

        double result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
        System.out.println("Resultado: " + result);
    }
}