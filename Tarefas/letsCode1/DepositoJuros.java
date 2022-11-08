/*Crie um programa que receba um valor que foi depositado e 
logo em seguida o valor com rendimento após 1 mês. 
Considere a taxa de juros da poupança em 0,70% a.m.*/

import java.util.Scanner;

public class DepositoJuros{
    public static void main(String[] args) {
        double valorInicial, valorRendido;
        final double JUROS_MES = 0.007;

        //Entrada
        pedirDeposito();
        valorInicial = receberDeposito();

        //Processamento
        valorRendido = calcularRendimento(valorInicial, JUROS_MES);

        //Saída
        mostrarRendimento(valorInicial, valorRendido);

    }
    //Método
    public static void pedirDeposito() {
        System.out.print("/n Por favor, insira o valor do depósito: ");
    }

    public static double receberDeposito() {
        Scanner leia = new Scanner(System.in);
        return leia.nextDouble();
    }

    public static double calcularRendimento(double valorInicial, double juros) {
        return valorInicial + valorInicial*juros;
    }

    public static void mostrarRendimento(double valorInicial, double valorRendido) {
        System.out.printf("O valor de R$ %.2f após 1 mês se tornou R$ %.2f", valorInicial, valorRendido);
    }

}