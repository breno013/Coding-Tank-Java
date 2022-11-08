import java.util.Scanner;

public class Praia {
    public static void main(String[] args) {
        
        int numDePraias, indicePraiaMaisDistante = 0, contador = 0;
        double max = 0, soma = 0, media;
        

        Scanner leia = new Scanner(System.in);

        System.out.print("\nQuantas praias deseja adicionar?: ");
        numDePraias = leia.nextInt();

        String[] nomePraia = new String[numDePraias];
        double[] distanciaPraia = new double[numDePraias];

        //Entrada
        for (int i = 0; i < numDePraias; i++) {
            System.out.printf("\nQual o nome da %d° praia? ", i+1);
        
        
            //DÚVIDA: nextLine() é ignorado e next() não é
            nomePraia[i] = leia.next();
            //DÚVIDA:
            
            System.out.printf("\nQual a distância do(a) %s do hotel? ", nomePraia[i]);
            distanciaPraia[i] = leia.nextDouble();
        }
        //Processamento
        for (int i = 0; i < numDePraias; i++) {
            
            //Mais distante
            if (distanciaPraia[i] > max) {
                max = distanciaPraia[i];
                indicePraiaMaisDistante = i;
            }
            //Entre 10 e 15
            if (distanciaPraia[i] > 10 && distanciaPraia[i] < 15) {
                contador =+ 1;
            }
            //Média 
            soma += distanciaPraia[i];
        }
        
        media = soma / numDePraias;

        //Saída
        System.out.printf("\nTESTE: %.2f\n", soma);
        System.out.printf("\nA praia mais distante é %s", nomePraia[indicePraiaMaisDistante]);
        System.out.printf("\nHá %d praias entre 10km e 15 km", contador);
        System.out.printf("\nA média de distância das praias é %.2f ", media);
    }
    //Métodos
}
