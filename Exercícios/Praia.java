import java.util.Scanner;

public class Praia {

    public static void main(String[] args) {
        //Declaração
        int numDePraias, indiceNomePraia, entre10e15;
        double maxDistancia, soma, media;
        String[] nomePraia;
        double[] distânciaPraia;

        //Entrada
            //Pedir qnts praias
        pedirNumPraias();
        numDePraias = receberNumPraias();

        nomePraia = new String[numDePraias];
        distânciaPraia = new double[numDePraias];

        for (int i = 0; i < numDePraias; i++) {
            pedirNomePraias(i);
            nomePraia[i] = receberNomePraia();
            pedirDistanciaPraias(i, nomePraia);
            distânciaPraia[i] = receberDistanciaPraias();
        }

        //Processo
            //EncontrarMaisDistante
        maxDistancia = maisDistante(distânciaPraia);
        indiceNomePraia = pesquisaLinear(distânciaPraia, maxDistancia);
            //Entre 10km e 15km
        entre10e15 = entreValores(distânciaPraia);
            //Distância média
        soma = somaDistancias(distânciaPraia);
        media = mediaDistancias(soma, numDePraias);
        //Saída2
        
            //mostrarProcessos
        mostrarPraiaDistante(indiceNomePraia, nomePraia);
        mostrarEntre10e15(entre10e15);
        mostrarMediaDistancia(media);

    }
    //Método
    public static void pedirNumPraias(){
		System.out.println("\nQuantas praias você quer inserir? ");
	}

    public static void pedirNomePraias(int i){
		System.out.printf("\nPor favor, insira nome da %d° praia: ", i+1);
	}

    public static void pedirDistanciaPraias(int i, String[] nome){
		System.out.printf("\nPor favor, insira a distância da praia %s: ", nome[i]);
	}

    public static int receberNumPraias(){
		Scanner leia = new Scanner(System.in);
		return leia.nextInt();
	}

    public static String receberNomePraia(){
		Scanner leia = new Scanner(System.in);
		return leia.nextLine();
	}

    public static double receberDistanciaPraias(){
		Scanner leia = new Scanner(System.in);
		return leia.nextDouble();
	}

    public static double maisDistante(double[] distânciaPraia) {
        double max = 0;
        for (int i = 0; i < distânciaPraia.length; i++) {
            if (distânciaPraia[i] > max) {
                max = distânciaPraia[i];
            }
        }
        return max;
    }

    public static int entreValores(double[] distânciaPraia) {
        int contador = 0;
        for (int i = 0; i < distânciaPraia.length; i++) {
            if (distânciaPraia[i] > 10 && distânciaPraia[i] < 15) {
                contador += 1;
            }
        }
        return contador;
    }

    public static double somaDistancias(double[] distânciaPraia) {
        int soma = 0;
        for (int i = 0; i < distânciaPraia.length; i++) {
            soma += distânciaPraia[i];
        }
        return soma;
    }
    
    public static double mediaDistancias(double soma, int numDePraias) {
        return soma / numDePraias;
    }

    public static int pesquisaLinear(double[] distânciaPraia, double maxDistancia){
        int j = 0;
        while (j < distânciaPraia.length) {
            if (distânciaPraia[j] == maxDistancia) {
                return j;
            } else {
                j += 1;
            }
        }
        return -1;
    }

	public static void mostrarPraiaDistante(int indiceNomePraia, String[] nomePraia){
		System.out.printf("\nO nome da praia mais distante é: %s", nomePraia[indiceNomePraia]);
	}

    public static void mostrarEntre10e15(int entre10e15) {
        System.out.printf("\nO número de praias entre 10km e 15km é de %d", entre10e15);
    }

    public static void mostrarMediaDistancia(double media) {
        System.out.printf("\nA média de distância entre as praias e o hotel é de %.2f Km", media);
    }
}

