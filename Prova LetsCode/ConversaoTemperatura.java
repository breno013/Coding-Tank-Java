/*ENUNCIADO*/

import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {
        //Declaração
        int numConversões, menu, contador = 0;
        double valorEscolhido, somaEscolhidas, somaConvertida, mediaEscolhida =0, mediaConvertida=0;

        //Entrada
        pedirNumeroConversões();
        numConversões = receberNumeroConversões();

        int[] ordemMenu = new int[numConversões];
        double[] valorOrigem = new double[numConversões];
        double[] valorFinal = new double[numConversões];
        int len = valorOrigem.length;

        for (int i = 0; i < len; i++) {
            while (contador == i) {
                pedirEscolhaMenu();
                menu(i, numConversões);
                Scanner leia = new Scanner(System.in);
                menu = leia.nextInt();
                
                switch (menu) {
                    case 1:
                        pedirCelsius();
                        valorEscolhido = receberValorEscolhido();
                        valorOrigem[i] = valorEscolhido;
                        valorFinal[i] = celsiusParaKelvin(valorEscolhido);
                        ordemMenu[i] = 1;
                        contador += 1;
                        break;
                    case 2:
                        pedirCelsius();
                        valorEscolhido = receberValorEscolhido();
                        valorOrigem[i] = valorEscolhido;
                        valorFinal[i] = celsiusParaFahrenheit(valorEscolhido);
                        ordemMenu[i] = 2;
                        contador += 1;
                        break;
                    case 3:
                        pedirKelvin();
                        valorEscolhido = receberValorEscolhido();
                        valorOrigem[i] = valorEscolhido;
                        valorFinal[i] = kelvinParaCelsius(valorEscolhido);
                        ordemMenu[i] = 3;
                        contador += 1;
                        break;
                    case 4:
                        pedirKelvin();
                        valorEscolhido = receberValorEscolhido();
                        valorOrigem[i] = valorEscolhido;
                        valorFinal[i] = kelvinParaFahrenheit(valorEscolhido);
                        ordemMenu[i] = 4;
                        contador += 1;
                        break;
                    case 5:
                        pedirFahrenheit();
                        valorEscolhido = receberValorEscolhido();
                        valorOrigem[i] = valorEscolhido;
                        valorFinal[i] = fahrenheitParaCelsius(valorEscolhido);
                        ordemMenu[i] = 5;
                        contador += 1;
                        break;
                    case 6:
                        pedirFahrenheit();
                        valorEscolhido = receberValorEscolhido();
                        valorOrigem[i] = valorEscolhido;
                        valorFinal[i] = fahrenheitParaKelvin(valorEscolhido);
                        ordemMenu[i] = 6;
                        contador += 1;
                        break;
                    default: System.out.println("Erro: Escolha uma das opções válidas.");
                        break;
                }
            }       
        }
        //Processamento
        somaEscolhidas = somaTemp(valorOrigem);
        somaConvertida = somaTemp(valorFinal);

        mediaTemp(somaEscolhidas, valorOrigem);
        mediaTemp(somaConvertida, valorFinal);

        //Saída
        for (int i = 0; i < len; i++) {
            if (ordemMenu[i] == 1) {
                System.out.printf("\n %.2f C° =  %.2f K°", valorOrigem[i], valorFinal[i]);
            } else if (ordemMenu[i] == 2) {
                System.out.printf("\n %.2f C° =  %.2f F°", valorOrigem[i], valorFinal[i]);
            } else if (ordemMenu[i] == 3) {
                System.out.printf("\n %.2f K° =  %.2f C°", valorOrigem[i], valorFinal[i]);
            } else if (ordemMenu[i] == 4) {
                System.out.printf("\n %.2f K° =  %.2f F°", valorOrigem[i], valorFinal[i]);
            } else if (ordemMenu[i] == 5) {
                System.out.printf("\n %.2f F° =  %.2f C°", valorOrigem[i], valorFinal[i]);
            } else if (ordemMenu[i] == 6) {
                System.out.printf("\n %.2f F° =  %.2f K°", valorOrigem[i], valorFinal[i]);
            } //Se não escolheu nada como fica??

            System.out.printf("\n %.2f %.2f", valorOrigem, valorFinal);
        }

        mostrarMediaConvertida(mediaConvertida);
        mostrarMediaEscolhida(mediaEscolhida);

    }


    //Métodos
    public static void pedirNumeroConversões(){
        System.out.println("Insira, por favor, a quantidade de temperaturas a serem transformadas: ");
    }

    public static void pedirEscolhaMenu(){
        System.out.println("Escolha o número da opção de transformação: ");
    }

    public static void pedirCelsius(){
        System.out.println("Digite a temperatura em Celsius: ");
    }

    public static void pedirKelvin(){
        System.out.println("Digite a temperatura em Kelvin: ");
    }

    public static void pedirFahrenheit(){
        System.out.println("Digite a temperatura em Fahrenheit: ");
    }

    public static void menu(int i, int numConversões) {
        System.out.printf("\nNúmero de transformação escolhida: %d° de %d", i, numConversões);
        System.out.println("1.  Celsius para Kelvin");
        System.out.println("2.  Celsius para Fahrenheit");
        System.out.println("3.  Kelvin para Celsius");
        System.out.println("4.  Kelvin para Fahrenheit");
        System.out.println("5.  Fahrenheit para Celsius");
        System.out.println("6.  Fahrenheit para Kelvin");
    }

    public static int receberNumeroConversões(){
        Scanner leia = new Scanner(System.in);
        return leia.nextInt();
    }

    public static double receberValorEscolhido(){
        Scanner leia = new Scanner(System.in);
        return leia.nextDouble();
    }

    public static double celsiusParaKelvin(double valorEscolhido) {
        return valorEscolhido + 273.15;
    }

    public static double celsiusParaFahrenheit(double valorEscolhido) {
        return  valorEscolhido*1.8 + 32;
    }

    public static double kelvinParaCelsius(double valorEscolhido) {
        return valorEscolhido - 273.15;
    }

    public static double kelvinParaFahrenheit(double valorEscolhido) {
        return (valorEscolhido - 273.15) *1.8 + 32; 
    }

    public static double fahrenheitParaCelsius(double valorEscolhido) {
        return (valorEscolhido - 32) / 1.8;
    }

    public static double fahrenheitParaKelvin(double valorEscolhido) {
        return (valorEscolhido - 32)/1.8 + 273.15;
    }

    public static double somaTemp(double[] valorOrigem){
        double soma = 0;
        for (int i = 0; i < valorOrigem.length; i++) {
            soma += valorOrigem[i];
        }
        return soma;
    }

    public static double mediaTemp(double soma, double[] array) {
        return soma / array.length;
    }

    public static void mostrarMediaEscolhida(double mediaEscolhida) {
        System.out.printf("\nO valor da média das temperaturas iniciais é de %.2f", mediaEscolhida);
    }

    public static void mostrarMediaConvertida(double mediaConvertida) {
        System.out.printf("\nO valor da média das temperaturas finais é de %.2f", mediaConvertida);
    }
}