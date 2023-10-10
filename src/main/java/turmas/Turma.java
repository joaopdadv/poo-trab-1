package turmas;

import alunos.Aluno;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Turma {

    private int codigo;
    private String disciplina;
    private String nomeProfessor;
    private Aluno alunos[] = new Aluno[30];

    public Turma() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código da turma: ");
        this.codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome da turma: ");
        this.disciplina = scanner.nextLine();

        System.out.print("Nome do professor: ");
        this.nomeProfessor = scanner.nextLine();

        adicionarAlunos();
    }

    private void adicionarAlunos(){
        Scanner scanner = new Scanner(System.in);
        String sair;
        int count = 0;
        do{
            System.out.print("Código do aluno: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Email do aluno: ");
            String email = scanner.nextLine();

            System.out.println("Notas: ");
            System.out.print("n1: ");
            float n1 = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("n2: ");
            float n2 = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("n3: ");
            float n3 = scanner.nextFloat();
            scanner.nextLine();

            Aluno aluno = new Aluno(codigo, nome, email, n1, n2, n3);
            this.alunos[count] = aluno;
            count++;

            System.out.print("Continuar cadastrando? (S-Sim/N-Não):");
            sair = scanner.nextLine();

        }while (sair.equalsIgnoreCase("S"));
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

//    @Override
//    public String toString() {
//        StringBuilder alunosString = new StringBuilder("[");
//        boolean first = true;
//
//        for (Aluno a : alunos) {
//            if (a != null) {
//                if (!first) {
//                    alunosString.append(", ");
//                }
//                alunosString.append(a);
//                first = false;
//            }
//        }
//
//        alunosString.append("]");
//
//        return "\n" + "Turma " + disciplina +
//                " - código: " + código +
//                " - professor: " + nomeProfessor +
//                " - alunos: " + alunosString;
//    }

    public int numAlunos(){
        int numAlunos = 0;

        for (Aluno a : alunos) {
            if (a != null) {
                numAlunos ++;
            }
        }

        return numAlunos;
    }

    public int numAlunosAprovados(){

        return 0;
    }

    public float percentualAlunosAprovados(){

        return 0;
    }

    public void printComNotas(){
        StringBuilder alunosString = new StringBuilder("[");
        boolean first = true;

        for (Aluno a : alunos) {
            if (a != null) {
                if (!first) {
                    alunosString.append(", ");
                }
                alunosString.append(a.printNotas());
                first = false;
            }
        }

        alunosString.append("]");

        System.out.println(
                "\n" + "Turma " + disciplina +
                        " - código: " + codigo +
                        " - professor: " + nomeProfessor +
                        " - alunos: " + alunosString
        );
    }
    @Override
    public String toString() {
        int numAlunos = 0;

        for (Aluno a : alunos) {
            if (a != null) {
                numAlunos ++;
            }
        }

        return "\n" + "Turma " + disciplina +
                " - código: " + codigo +
                " - professor: " + nomeProfessor +
                " - alunos: " + numAlunos;
    }

}
