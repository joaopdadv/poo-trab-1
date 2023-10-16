package menu;

import turmas.Turma;

import java.util.Scanner;

public class Menu {

    private Turma turmas[] = new Turma[20];
    private static Scanner scanner;

    public Menu(){}
    public void printMenu(){
        int escolha;

        scanner = new Scanner(System.in);

        do {
            System.out.println("------------------------------------------------------------");
            System.out.println("Instituição TI");
            System.out.println("------------------------------------------------------------");
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1) Listar todas as turmas");
            System.out.println("2) Informar dados de uma turma");
            System.out.println("3) Consultar os dados de uma turma");
            System.out.println("4) Consultar estatísticas gerais");
            System.out.println("5) Sair do sistema");
            System.out.println("------------------------------------------------------------");
            System.out.print("Escolha: ");

            escolha = scanner.nextInt();
            scanner.nextLine();


            switch (escolha) {
                case 1:
                    listarTurmas();
                    break;
                case 2:
                    informarDados();
                    break;
                case 3:
                    consultarDados();
                    break;
                case 4:
                    consultarEstatisticas();
                    break;
                case 5:
                    System.out.print("Deseja realmente sair? (S-Sim/N-Não): ");
                    String resposta = scanner.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
                        scanner.close();
                        System.out.println("Sistema encerrado.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (true);
    }

    private void buscarTurmaPorId(int id, Turma turmas[]){
        for (Turma t : turmas) {
            if (t != null && t.getCodigo() == id) {
                t.printComNotas();
                return;
            }
        }
        System.out.println("Turma não encontrada.");
    }

    private void listarTurmas(){
        int countTurmas = 0;

        for (Turma t : turmas) {
            if(t != null){
                countTurmas++;
            }
        }

        if(countTurmas == 0){
            System.out.println("Nenhuma turma cadastrada!");
        }else{
            for (Turma t: turmas) {
                if (t != null){
                    System.out.println(t);
                }
            }
        }

        System.out.print("Pressione Enter para continuar...");
        scanner.nextLine();
    };

    private void informarDados(){
        int countTurmas = 0;

        for (Turma t : turmas) {
           if(t != null){
              countTurmas++;
           }
        }

        Turma turma = new Turma();
        turmas[countTurmas] = turma;
    };

    private void consultarDados(){
        System.out.print("Qual o código da turma que está procurando? ");
        int id = scanner.nextInt();
        scanner.nextLine();

        buscarTurmaPorId(id, turmas);

        System.out.print("Pressione Enter para continuar...");
        scanner.nextLine();
    };

    private  void consultarEstatisticas(){
        int countTurmas = 0;

        for (Turma t : turmas) {
            if(t != null){
                countTurmas++;
            }
        }

        if(countTurmas == 0){
            System.out.println("Nenhuma turma cadastrada!");
        }else{
            for (Turma t : turmas) {
                if(t != null){
                    t.printDados();
                }
            }
        }

        System.out.print("Pressione Enter para continuar...");
        scanner.nextLine();
    };
}
