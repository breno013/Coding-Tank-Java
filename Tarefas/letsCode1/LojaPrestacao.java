/*Uma loja está vendendo seus produtos em 5 prestações sem juros. 
Faça um programa que insira o valor total de uma compra e o valor das prestações.
*/

import java.util.Scanner;

public class LojaPrestacao {

    public static void main(String[] args) {
        double valorTotal, valorPrestacao;

        //Entrada
        pedirValorTotal();
        valorTotal = receberValorTotal();
        
        //Processamento
        valorPrestacao = calculoPrestcao(valorTotal);

        //Saída
        mostrarPrestacao(valorTotal, valorPrestacao);
    }
    //Método
    public static void pedirValorTotal() {
        System.out.print("\nInsira o valor total: ");
    }

    public static double receberValorTotal() {
        Scanner leia =  new Scanner (System.in);
        return leia.nextDouble();
    }

    public static double calculoPrestcao(double valorTotal) {
        return valorTotal / 5;
    }

    public static void mostrarPrestacao(double valorTotal, double valorPrestacao) {
        System.out.printf("\nO valor total de %.2f será revertido em 5 prestações de %.2f sem juros", valorTotal, valorPrestacao);
    }

}