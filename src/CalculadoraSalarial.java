package src;

import java.util.Scanner;

public class CalculadoraSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o regime de pagamento (CLT, Horista ou PJ): ");
        String regime = scanner.nextLine();

        double valorReceber = 0.0;

        if (regime.equalsIgnoreCase("CLT")) {

            System.out.print("Digite o salário mensal: ");
            double salarioMensal = scanner.nextDouble();
            valorReceber = salarioMensal;
        } else if (regime.equalsIgnoreCase("Horista")) {

            System.out.print("Digite o número de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();
            System.out.print("Digite o valor da hora de trabalho: ");
            double valorHoraTrabalho = scanner.nextDouble();
            valorReceber = horasTrabalhadas * valorHoraTrabalho;
        } else if (regime.equalsIgnoreCase("PJ")) {

            System.out.print("Digite o valor do contrato: ");
            double valorContrato = scanner.nextDouble();
            valorReceber = valorContrato;
        } else {
            System.out.println("Regime de pagamento inválido!");
            System.exit(0);
        }

        System.out.println("Nome do professor: " + nome);
        System.out.println("Valor a receber: " + valorReceber);

        scanner.close();
    }
}
