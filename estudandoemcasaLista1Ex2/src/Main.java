import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int soma;
        double media;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = entrada.nextInt();

        soma = numero1 + numero2 + numero3;
        media = soma / 3.0;

        System.out.print("A soma dos três número é: " + soma + ". ");
        System.out.print("A média dos três número é: " + media);
    }
}