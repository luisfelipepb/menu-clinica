package estudos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class esdudos3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> CLING = new ArrayList<String>();
        ArrayList<String> ORTO = new ArrayList<String>();
        ArrayList<String> FISIO = new ArrayList<String>();
        int opcao = 1;
        int opcao2 = 0;
        int opcao3 = 0;

            while (opcao != 5) {
                try {
                    System.out.print("====== CLINICA ======\n");
                    System.out.println();
                    System.out.print("Opções\n");
                    System.out.print("1 - AGENDAMENTO\n");
                    System.out.print("2 - CONSULTAR AGENDAMENTO\n");
                    System.out.print("3 - CANCELAR AGENDAMENTO\n");
                    System.out.print("4 - Sair do programa\n");
                    System.out.println();
                    System.out.print("ESCOLHA A OPÇAO: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    if (opcao == 1) {
                        while (opcao != 4) {
                            System.out.print("====== AGENDAMENTO ======\n");
                            System.out.println();
                            System.out.print("Opções\n");
                            System.out.print("1 - CLINICO GERAL\n");
                            System.out.print("2 - ORTOPEDIA\n");
                            System.out.print("3 - FISIOTERAPIA\n");
                            System.out.print("4 - VOLTAR\n");
                            System.out.println();
                            System.out.print("ESCOLHA A OPÇAO: ");
                            opcao2 = scanner.nextInt();
                            scanner.nextLine();

                            if (opcao2 == 1) {
                                System.out.println("INFORME SEU NOME: ");
                                String nome = scanner.nextLine();
                                CLING.add(nome);
                                System.out.print("consulta marcada para CLINICO GERAL");
                            } else if (opcao2 == 2) {
                                System.out.println("informe seu nome");
                                String nome = scanner.nextLine();
                                System.out.print("consulta marcada para ortopedia");
                                ORTO.add(nome);
                            } else if (opcao2 == 3) {
                                System.out.println("informe seu nome");
                                String nome = scanner.nextLine();
                                System.out.print("consulta marcada para fisioterapia");
                                FISIO.add(nome);
                            } else if (opcao2 == 4) {
                                System.out.println("voltando ao menu principal");
                                break;
                            } else {
                                System.out.print("opcao invalida");
                            }
                        }

                    }
                    if (opcao == 2) {
                        System.out.println("consultas atuais marcadas: ");
                        System.out.println("consultas para clinico geral: " + CLING);
                        System.out.println("consultas para fisioterapia: " + FISIO);
                        System.out.println("consultas para orto: " + ORTO);

                    } else if (opcao == 3) {
                        while (opcao != 4) {
                            System.out.print("informe o tipo da consulta para cancelar\n");
                            System.out.println();
                            System.out.print("Opções\n");
                            System.out.print("1 - CLINICO GERAL\n");
                            System.out.print("2 - ORTOPEDIA\n");
                            System.out.print("3 - FISIOTERAPIA\n");
                            System.out.print("4 - VOLTAR\n");
                            System.out.println();
                            System.out.print("ESCOLHA A OPÇAO: ");
                            opcao3 = scanner.nextInt();
                            scanner.nextLine();

                            if (opcao3 == 1) {
                                System.out.println("INFORME SEU NOME: ");
                                String nome = scanner.nextLine();
                                CLING.remove(nome);
                                System.out.print("consulta cancelada para CLINICO GERAL");
                            } else if (opcao3 == 2) {
                                System.out.println("informe seu nome");
                                String nome = scanner.nextLine();
                                System.out.print("consulta cancelada para ortopedia");
                                ORTO.remove(nome);
                            } else if (opcao3 == 3) {
                                System.out.println("informe seu nome");
                                String nome = scanner.nextLine();
                                System.out.print("consulta cancelada para fisioterapia");
                                FISIO.remove(nome);
                            } else if (opcao3 == 4) {
                                System.out.println("voltando ao menu principal");
                                break;
                            } else {
                                System.out.print("opcao invalida");
                            }
                        }
                    } else if (opcao == 4) {
                        System.out.println("Encerrando o programa");
                        break;
                    } else {
                        System.out.println();
                    }
                }catch(InputMismatchException exception){
                        System.out.println("Erro: informe apenas números.");
                    scanner.nextLine();}
            }
    }
}