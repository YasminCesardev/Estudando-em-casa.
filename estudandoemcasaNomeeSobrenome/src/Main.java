import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        String sobrenome;


        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.print("Você é: " + nome + " " + sobrenome + ".");

    }
}