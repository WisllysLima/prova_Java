import java.util.Scanner;
import java.util.Locale;
public class SAP {
    static Scanner scanner = new Scanner(System.in);
    static Locale ptBr = new Locale("pt","BR");

    static double menorQue3 (double notas[][], int linha, int coluna){
        if (notas[linha][coluna] < 3) {
            notas[linha][coluna] = 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        int aluno = 0;
        double soma = 0;

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("----------------------Bem-vindo a Escola Jesuítas--------------------------------");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("No nosso sistema é possivel | Cadastrar as notas dos alunos | Visualizar as Notas | Calcular Media. |");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Digite ''1'' para dar continuidade no programa.");
        System.out.println("Digite ''2'' para sair.");
        int opcao = scanner.nextInt();

       while(opcao<2) {
           System.out.println("-------------------------------------------------------------------------------");
           System.out.println("Para prosseguir é necessario informar a quantidade dos alunos.");
           System.out.println("-------------------------------------------------------------------------------");
           System.out.println("Por gentileza Insira a quantidade de alunos da turma: ");
           int quantAlunos = scanner.nextInt();
           double[][] notas = new double[quantAlunos][4];

           switch (opcao) {
               case 1:
                   System.out.println("-------------------------------------------------------------------------------");
                   for (int linha = 0; linha < notas.length; linha++) {
                       System.out.printf("\nDigite a nota do %d aluno\n", linha + 1);
                       for (int coluna = 0; coluna < notas[linha].length; coluna++) {
                           System.out.printf("\nDigite a %d nota: ", coluna + 1);
                           notas[linha][coluna] = scanner.nextDouble();

                           menorQue3(notas, linha, coluna);
                       }
                   }
                   System.out.println("-------------------------------------------------------------------------------");
                   System.out.printf("\n|Para Visualizar as Notas digite ''1''|\n|Para Calcular a Media de um aluno digite ''2''|");
                   int opcao2 = scanner.nextInt();
                   System.out.println("-------------------------------------------------------------------------------");

                   switch (opcao2) {
                       case 1:
                           for (int linha = 0; linha < notas.length; linha++) {
                               for (int coluna = 0; coluna < notas[linha].length; coluna++) {
                                   System.out.printf(notas[linha][coluna] + "\t");
                               }
                               System.out.println("\n");
                           }
                       case 2:
                           System.out.println("-------------------------------------------------------------------------------");
                           System.out.println("Deseja saber a Media de qual Aluno?");
                           aluno = scanner.nextInt();
                           aluno -= 1;
                           for (int cl = 0; cl < notas[aluno].length; cl++) {
                               soma += notas[aluno][cl];
                           }
                           System.out.printf("\nA media do %d aluno : %2.2f", aluno + 1, soma / 4);
                           System.out.println("-------------------------------------------------------------------------------");
                           break;

                       default:
                           System.out.println("-------------------------------------------------------------------------------");
                           System.out.println("Valor fora da faixa, por gentileza tente novamente.");
                           System.out.println("-------------------------------------------------------------------------------");
                   }
               case 2:
                   System.out.println("-------------------------------------------------------------------------------");
                   System.out.println("Obrigado por usar nosso sistema!!!");
                   System.out.println("-------------------------------------------------------------------------------");
               default:
                   System.out.println("-------------------------------------------------------------------------------");
                   System.out.println("Valor fora da faixa, por gentileza tente novamente.");
                   System.out.println("-------------------------------------------------------------------------------");
                 }
       }
    }
}
