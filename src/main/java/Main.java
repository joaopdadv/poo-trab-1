import menu.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            menu.printMenu();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
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
