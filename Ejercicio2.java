
// Ejercicio 2 Practica 2

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

    // Variables
    Scanner scannner = new Scanner(System.in);
    int num1, num2;
    // Entrada
    System.out.print("Digite primer numero: ");
    num1 = scannner.nextInt();
    System.out.print("Digite segundo numero: ");
    num2 = scannner.nextInt();
    // Condicional
    if (num1>num2){
        System.out.print("El primer numero es el mayor");
    } else if (num2>num1) {
        System.out.print("El segundo numero es el mayor");
    } else {
        System.out.print("Ambos numeros son iguales");
    }
    scannner.close();
    }
}