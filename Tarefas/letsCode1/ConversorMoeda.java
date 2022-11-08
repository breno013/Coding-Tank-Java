/*Crie um programa que receba 2 números e ao final mostre as seguintes operações:
Soma
Subtração
Multiplicação
Divisão
*/

import java.util.Scanner;

public class ConversorMoeda{
    public static void main(String[] args) {

        double num1, num2;
        int opcao;
        

        Scanner leia = new Scanner(System.in);
        
        System.out.print("\nInsira, por favor, o 1° número: ");
        num1 = leia.nextDouble();
        System.out.print("\nInsira, por favor, o 2° número: ");
        num2 = leia.nextDouble();

        System.out.print("\n\nQual operação vc quer executar?: ");
        System.out.print("\n1. Soma");
        System.out.print("\n2. Subtração");
        System.out.print("\n3. Multiplicação");
        System.out.print("\n4. Divisão");
        opcao = leia.nextInt();
        

        switch (opcao) {
            case 1:
                System.out.printf("\n %.2f  +  %.2f  =  %.2f", num1, num2, num1 + num2);
                break;
            case 2:
                System.out.printf("\n %.2f  -  %.2f  =  %.2f", num1, num2, num1 - num2);
                break;
            case 3:
                System.out.printf("\n %.2f  *  %.2f  =  %.2f", num1, num2, num1 * num2);
                break;
            case 4:
                System.out.printf("\n %.2f  /  %.2f  =  %.2f", num1, num2, num1 / num2);
                break; 
            default: System.out.print("Erro: opção escolhida NÃO existe.");
                break;
        }
        leia.close();
    }
}