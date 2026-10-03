import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor;
        double desconto;
        double valorfinal;


        System.out.print("Digite o valor do produto: ");
        valor = entrada.nextDouble();

        desconto = valor * 0.10;
        valorfinal =valor - desconto;

        System.out.print("O valor do produto com 10 porcento de desconto é: " + valorfinal);

    }
}