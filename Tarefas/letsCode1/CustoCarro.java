/*O custo ao consumidor de um carro novo é a soma do custo 
de fábrica com a porcentagem do distribuidor e dos impostos. 
Supondo que a porcentagem do distribuidor seja de 28% e os 
impostos de 45%. Escreva um programa que leia o custo de fábrica 
e informe o custo ao consumidor final.
*/

import java.util.Scanner;

public class CustoCarro{
    public static void main(String[] args) {
    
    //Declaração
    double valorCustoFabrica, custoConsumidor;
    final double DISTRIBUIDOR = 0.28, IMPOSTO = 0.45;

    //Entrada
    pedirCustoDeFabrica();
    valorCustoFabrica = receberCusto();

    //Processamento
    custoConsumidor = calcularCustoConsumidor(valorCustoFabrica, DISTRIBUIDOR, IMPOSTO);

    //Saída
    
    mostrarCustoConsumidor(custoConsumidor);

    }
    //Métodos
    public static void pedirCustoDeFabrica() {
        System.out.print("\nPor favor, insira o custo de fábrica: ");
    }
    
    public static double receberCusto() {
        Scanner leia = new Scanner(System.in);
        return leia.nextDouble();
    }
    
    public static double calcularCustoConsumidor(double valorCustoFabrica, double distribuidor, double imposto) {
        return valorCustoFabrica + valorCustoFabrica*distribuidor + valorCustoFabrica*imposto;
    }

    public static void mostrarCustoConsumidor(double custoConsumidor) {
        System.out.printf("\nO custo do consumidor final será de R$ %.2f ", custoConsumidor);
    }
}