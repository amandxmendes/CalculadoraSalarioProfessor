/*
* Nome:Amanda Mendes Santos
* RA:820141459
* Data:30/05/2023
* UC:Programação de Soluções çomputacionais
* Titulo: Calculadora Salarial de Professores
*/

package src;

import java.util.Scanner;

public class CalculadoraSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pede o nome do professor

        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();

        //pede o tipo de regime que ele trabalha

        System.out.print("Digite o regime de pagamento (CLT, Horista ou PJ): ");
        String regime = scanner.nextLine();

        //variavel que armazena o valor a receber

        double valorReceber = 0.0;

        //condicionais que verificam o tipo de regime que foi digitado e fazem a lógica do valor a receber para cada tipo de regime

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
            System.out.println("Regime de trabalho inválido. Tente novamente.");
            System.exit(0);
        }

        //imprime o nome do professor e o valor que ele irá receber

        System.out.println("Nome do professor: " + nome);
        System.out.println("Valor a receber: " + valorReceber);

        scanner.close();
    }
}
