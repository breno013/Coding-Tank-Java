/* Escreva um programa que leia o nome de um aluno 
e as notas das 3 primeiras provas que ele obteve no semestre.
 No final deverá informar a média do aluno.
*/

import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {
        String nome;
        double nota1, media, soma = 0;
        int numeroDeNotas;

        //Entrada
        pedirNome();
        nome = receberNome();
        
        pedirNumNota(nome);
        numeroDeNotas = receberNumNota();

        for (int i = 1; i <= numeroDeNotas; i++) {
            pedirNota(i);
            soma = soma + receberNota();
        }

        //Processamento
        media = media(soma, numeroDeNotas);

        //Saída
        mostrarMedia(nome, media);

    }
    //Método
    public static void pedirNome() {
        System.out.print("\nInsira o nome do aluno: ");
    }

    public static void pedirNota(int i) {
        System.out.printf("\nInsira a %d° nota: ", i);
    }
    
    public static void pedirNumNota(String aluno) {
        System.out.printf("\nQuantas notas do aluno %s vc quer inserir?: ", aluno);
    }

    public static String receberNome() {
        Scanner leia = new Scanner(System.in);
        return leia.nextLine();
    }

    public static double receberNota() {
        Scanner leia = new Scanner(System.in);
        return leia.nextInt();
    }

    public static int receberNumNota() {
        Scanner leia = new Scanner(System.in);
        return leia.nextInt();
    }

    public static Double media(double soma, int numeroDeNotas) {
        return soma / numeroDeNotas;
    }

    public static void mostrarMedia(String aluno, double media) {
        System.out.printf("A média da nota do(a) %s é %.2f", aluno, media);
    }

}