import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoContaCorrente = 2500;
        double saldoPoupanca = 5400;

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("\nDigite sua senha (contendo somente números):");
        int senha = scanner.nextInt();

        System.out.println("\nSelecione uma opção:");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Poupança\n");
        int conta = scanner.nextInt();
        scanner.nextLine();

        int operacoes;

        do {
            exibirDadosDaConta(nome, conta, saldoContaCorrente, saldoPoupanca);

            System.out.println("\nOperações:");
            System.out.println("1 - Consultar Saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair\n");
            operacoes = scanner.nextInt();

            switch (operacoes) {
                case 1:
                    if (conta == 1) {
                        System.out.printf("\nSeu saldo atual é de R$%.2f%n", saldoContaCorrente);
                    } else if (conta == 2) {
                        System.out.printf("Seu saldo atual é de R$%.2f%n\n", saldoPoupanca);
                    }
                    break;

                case 2:
                    if (conta == 1) {
                        System.out.println("Qual valor foi recebido?\n");
                        double valorAReceberContaCorrente = scanner.nextDouble();
                        if (valorAReceberContaCorrente > 0) {
                            saldoContaCorrente += valorAReceberContaCorrente;
                            System.out.printf("Seu saldo atual é de R$%.2f%n\n", saldoContaCorrente);
                        } else {
                            System.out.println("Valor inválido, tente novamente.\n");
                        }
                    } else if (conta == 2) {
                        System.out.println("Qual valor foi recebido?\n");
                        double valorAReceberPoupanca = scanner.nextDouble();
                        if (valorAReceberPoupanca > 0) {
                            saldoPoupanca += valorAReceberPoupanca;
                            System.out.printf("Seu saldo atual é de R$%.2f%n\n", saldoPoupanca);
                        } else {
                            System.out.println("Valor inválido, tente novamente.\n");
                        }
                    }
                    break;

                case 3:
                    if (conta == 1) {
                        System.out.println("Qual valor será transferido?\n");
                        double valorTransferidoContaCorrente = scanner.nextDouble();

                        System.out.println("Informe sua senha:\n");
                        int entradaSenha = scanner.nextInt();

                        if (senha == entradaSenha) {
                            if (saldoContaCorrente >= valorTransferidoContaCorrente) {
                                saldoContaCorrente -= valorTransferidoContaCorrente;
                                System.out.printf("\nSeu saldo atual é de R$%.2f%n", saldoContaCorrente);
                            } else {
                                System.out.println("\nSaldo insuficiente.");
                            }
                        } else {
                            System.out.println("\nSenha inválida, tente novamente.");
                        }
                    } else if (conta == 2) {
                        System.out.println("Qual valor será transferido?\n");
                        double valorTransferidoPoupanca = scanner.nextDouble();

                        System.out.println("Informe sua senha:\n");
                        int entradaSenha = scanner.nextInt();

                        if (senha == entradaSenha) {
                            if (saldoPoupanca >= valorTransferidoPoupanca) {
                                saldoPoupanca -= valorTransferidoPoupanca;
                                System.out.printf("\nSeu saldo atual é de R$%.2f%n", saldoPoupanca);
                            } else {
                                System.out.println("\nSaldo insuficiente.");
                            }
                        } else {
                            System.out.println("\nSenha inválida, tente novamente.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente...");
            }

        } while (operacoes != 4);

        scanner.close();
    }

    public static void exibirDadosDaConta(String nome, int conta, double saldoContaCorrente, double saldoPoupanca) {
        if (conta == 1) {
            System.out.println("\n*****************************************");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo Conta: Conta Corrente");
            System.out.printf("Saldo: R$%.2f%n", saldoContaCorrente);
            System.out.println("*****************************************");
        } else if (conta == 2) {
            System.out.println("\n*****************************************");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo Conta: Poupança");
            System.out.printf("Saldo: R$%.2f%n", saldoPoupanca);
            System.out.println("*****************************************");
        }
    }
}