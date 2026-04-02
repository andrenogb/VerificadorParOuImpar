import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero;
        int opcaoVoltar;

        do {
            System.out.println("Bem vindo ao programa do PAR ou IMPAR!!!!!!!!!");
            System.out.println("Digite um numero e eu digo se é PAR ou IMPAR.");
            numero = leitor.nextInt();

            if (numero % 2 == 0){
                System.out.println("O numero digitado é PAR");
                System.out.println();
            } else {
                System.out.println("O numero ditado é IMPAR");
                System.out.println();
            }

            System.out.println("Voltar ao inicio e tentar outro numero?");
            System.out.println("1 - SIM");
            System.out.println("2 - NAO");
            opcaoVoltar = leitor.nextInt();

            if (opcaoVoltar == 2){
                System.out.println("Encerrando o programa... Obrigado!");
            } else if (opcaoVoltar != 1){
                System.out.println("Opcao invalida, encerrando programa...");
            }
        }while(opcaoVoltar == 1);

        leitor.close();

    }
}
