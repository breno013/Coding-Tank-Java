import java.util.Scanner;

public class ConversorDeCelsius
{
    public static void main(String[] args) 
    {
        double celsius = 0.0 , kelvin = 0.0, rankine = 0.0, reaumur = 0.0, fahrenheit = 0.0;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o valor de Celsius: ");
        celsius = input.nextDouble();

        kelvin = calcularKelvin (celsius);
        fahrenheit = calcularFahrenheit(celsius); 
        rankine = calcularRankine(celsius);
        reaumur = calcularRéaumur(celsius);

        mostrarKelvin (kelvin);
        mostrarFahrenheit(fahrenheit);
        mostrarRankine(rankine);
        mostrarRéaumur(reaumur);

    }

    public static double calcularKelvin (double celsius)
    {
        return celsius + 273.15;
    }

    public static double calcularFahrenheit (double celsius)
    {
        return celsius*1.8 + 32;
    }

    public static double calcularRankine (double celsius)
    {
        return celsius*1.8 + 32 + 459.67;
    }

    public static double calcularRéaumur (double celsius)
    {
        return celsius*0.8;
    }


    public static void mostrarKelvin (double kelvin)
    {
        System.out.printf("Valor em Kelvin: %.2f\n", kelvin);
    }

    public static void mostrarFahrenheit (double fahrenheit)
    {
        System.out.printf("Valor em Fahrenheit: %.2f\n", fahrenheit);
    }

    public static void mostrarRankine (double rankine)
    {
        System.out.printf("Valor em rankine: %.2f\n", rankine);
    }

    public static void mostrarRéaumur (double reaumur)
    {
        System.out.printf("Valor em Réaumur: %.2f\n", reaumur);
    }
}