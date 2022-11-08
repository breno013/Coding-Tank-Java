
import java.util.Scanner;

public class AlunoNota {

    public static void main(String[] args) {
        
        //Declara
        int numDeAlunos;

        //Entrada
        Scanner leia = new Scanner(System.in);

        System.out.print("\nQuantos alunos você deseja inserir?: ");
        numDeAlunos = leia.nextInt();

        String[] nomeNota = new String [numDeAlunos*2];

        //Processo
        for (int i = 0; i < numDeAlunos*2; i++) {

            if (i % 2 == 0) {
                
                System.out.print("\nQual o nome do aluno?: ");
                nomeNota[i] = leia.next();

            } else {
                System.out.printf("\nQual a nota do aluno(a) %s ?: ", nomeNota[i-1]);
                nomeNota[i] = leia.next();
            }
        }
        //Saída
        System.out.print("\nALUNO(A) \t NOTA");
        for (int i = 0; i < numDeAlunos*2; i++) {
            if (i % 2 == 0) {
                System.out.printf("\n%s", nomeNota[i]);
            } else {
                System.out.printf("\t \t %s", nomeNota[i]);
            }
        }
        leia.close();
    }
    //Método
}
