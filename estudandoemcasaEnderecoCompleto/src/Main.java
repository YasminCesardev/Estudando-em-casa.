import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String rua;
        int numero;
        String bairro;
        String cidade;
        String estado;

        System.out.print("Digite o nome da rua: ");
        rua = entrada.nextLine();

        System.out.print("Digite o numero da residência: ");
        numero = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o nome bairro: ");
        bairro = entrada.nextLine();

        System.out.print("Digite o nome da cidade: ");
        cidade = entrada.nextLine();

        System.out.print("Digite o nome do estado: ");
        estado = entrada.nextLine();

        System.out.print("O endereço da sua residência é: " + rua + " ," + numero + " ," + bairro + " ," + cidade + " ," + estado + ".");
    }
}