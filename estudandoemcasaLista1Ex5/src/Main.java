import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura;
        double peso;
        double imc;

        System.out.print("Digite a sua altura metros: ");
        altura = entrada.nextDouble();

        System.out.print("Digite o seu peso em kg: ");
        peso = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.print("O seu IMC calculado é: " + imc);

    }
}