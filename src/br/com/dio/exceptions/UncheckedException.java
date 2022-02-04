package br.com.dio.exceptions;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro" + e.getMessage());
        } catch (ArithmeticException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Impossível um número por 0" + e.getMessage());
        } finally {
            System.out.println("Chegou no Finally");
        }

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
