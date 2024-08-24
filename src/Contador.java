import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Criação do scanner para leitura de entrada do usuário
        Scanner terminal = new Scanner(System.in);

        // Solicitação do primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Solicitação do segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        // Tentativa de executar a contagem
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem de erro
            System.out.println(exception.getMessage());
        }

        // Fechamento do scanner
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de interações a serem realizadas
        int contagem = parametroDois - parametroUm;

        // Realiza o loop for para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

