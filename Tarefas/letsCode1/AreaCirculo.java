/*
Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
Cálculo:  área = PI * (raio²)
*/

import java.util.Scanner;

public class AreaCirculo{
    public static void main(String[] args) {
        //Declara
        double raio, area;

        //Entrada
        pedirRaio();
        raio = receberRaio();

        //Processo
        area = calcularArea(raio);

        //Saída
        mostrarArea(area);
    
    }
    
    //Método
    public static void pedirRaio(){
		System.out.print("\nPor favor, insira o raio: ");
    }

    public static double receberRaio(){
		Scanner leia = new Scanner(System.in);
		return leia.nextDouble();
    }

    public static double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static void mostrarArea(double area){
		System.out.printf("\nO valor da área da circunferência é: %.2f ", area);
	}

}