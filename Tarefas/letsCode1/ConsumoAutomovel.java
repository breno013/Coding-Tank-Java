/*Escreva um programa em java para definir o consumo médio 
de um automóvel sendo fornecido a distância total percorrida 
pelo automóvel e o total de combustível gasto (litros).*/

import java.util.Scanner;

public class ConsumoAutomovel{
    public static void main(String[] args) {
        
        double distância, combustivel, consumo;
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Por favor, insira a distância total percorrida em metros: ");
        distância = leia.nextDouble();

        System.out.print("Por favor, insira o total de combustível gasto em litros: ");
        combustivel = leia.nextDouble();
        
        //Processamento
        consumo = calcularConsumo(distância, combustivel);

        //Saída
        mostrarConsumo(consumo);
    }
    //Método
    public static double calcularConsumo(double distância, double combustivel) {
        return distância / combustivel;
    }

    public static void mostrarConsumo(double consumo) {
        System.out.printf("\nConsumo será de %.2f metros por litro", consumo);
    }


}