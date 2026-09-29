package estudos;
import java.util.Scanner;
import java.util.ArrayList;

public class estudos1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> PACIENTE = new ArrayList<String>();
        int opcao = 1;

        while(opcao != 5) {
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

            if(opcao == 1) {
                System.out.println("INFORME SEU NOME: ");
                String nome = scanner.nextLine();
                PACIENTE.add(nome);
                System.out.println("CONSULTA MARCADA ");

            } else if(opcao == 2) {
                System.out.println("consultas atuais marcadas: " +PACIENTE);

            } else if(opcao == 3) {
                System.out.println("INFORME O NOME PARA CANCELAMENTO DA CONSULTA: ");
                String cancelar = scanner.nextLine();
                PACIENTE.remove(cancelar);
                System.out.println("consulta cancelada ");
            } else if(opcao == 4){
                System.out.println("Encerrando o programa");
            } else {
                System.out.println();
            }
        }
    }
}
