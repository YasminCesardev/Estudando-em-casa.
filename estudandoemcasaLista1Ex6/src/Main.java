import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioatual;
        double aumento;
        double porcentagemaumento;
        double salariofinal;

        System.out.print("Digite o valor do seu salário atual: ");
        salarioatual = entrada.nextDouble();

        System.out.print("Digite a porcentagem de aumento: ");
        aumento = entrada.nextDouble();

        porcentagemaumento = salarioatual * aumento / 100;
        salariofinal = porcentagemaumento + salarioatual;

        System.out.println("O valor do seu aumento é de: " + porcentagemaumento + ". ");
        System.out.println("O valor do seu salário com o aumento é de: " + salariofinal + ".");
    }
}