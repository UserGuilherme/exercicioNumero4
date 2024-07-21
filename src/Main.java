import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeroFuncionario;
        double horasTrabalhas;
        double valorHora;

        System.out.println("Digite o número de fucionário");
        numeroFuncionario = sc.nextDouble();

        System.out.println("Digite o número de horas trabalhadas");
        horasTrabalhas = sc.nextDouble();

        System.out.println("Digite o valor que o funcionário recebe por hora");
        valorHora = sc.nextDouble();


        double salario = horasTrabalhas * valorHora;

        System.out.println("Número do funcionário = " + numeroFuncionario);
        System.out.println("Salario = " + salario);

        sc.close();

    }
}