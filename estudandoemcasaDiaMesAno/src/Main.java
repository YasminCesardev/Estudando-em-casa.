import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia;
        int mes;
        int ano;

        System.out.print("Digite o dia: ");
        dia = entrada.nextInt();

        System.out.print("Digite o mês: ");
        mes = entrada.nextInt();

        System.out.print("Digite o ano: ");
        ano = entrada.nextInt();

        System.out.print("A data informada foi: " + dia + "/" + mes + "/" + ano + ".");


    }
}