import menu.Menu;
import turmas.Turma;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Turma turma;
        Turma turmas[] = new Turma[20];
        Scanner scanner = new Scanner(System.in);

        int escolha;
        int countTurmas = 0;

        do {
            menu.printMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    for (Turma t: turmas) {
                        if (t != null){
                            System.out.println(t);
                        }
                    }
                    break;
                case 2:
                    turma = new Turma();
                    turmas[countTurmas] = turma;
                    countTurmas++;
                    break;
                case 3:
                    System.out.println(3);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                case 5:
                    System.out.print("Deseja realmente sair? (S-Sim/N-Não): ");
                    String resposta = scanner.nextLine().toUpperCase();
                    if (resposta.equals("S")) {
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
}
