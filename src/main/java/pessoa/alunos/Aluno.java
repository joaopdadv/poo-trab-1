package pessoa.alunos;

import pessoa.Pessoa;

public class Aluno extends Pessoa {


    private float notas[] = new float[3];
    private float notaFinal;

    public Aluno(int codigo, String nome, String email, float n1, float n2, float n3) {
        super(codigo, nome, email);
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
        this.notaFinal = calculateMedia(n1,n2,n3);
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    private float calculateMedia(float n1,float n2,float n3){
        return (n1+n2+n3)/3;
    }

    public boolean aprovado(){
        if(this.notaFinal >= 7){
            return true;
        }else{
            return false;
        }
    }

    public String printNotas(){
        StringBuilder sb = new StringBuilder("\n{");

        sb.append("Aluno: " + super.getNome());
        sb.append(" - n1: " + notas[0]);
        sb.append(" - n2: " + notas[1]);
        sb.append(" - n3: " + notas[2]);
        sb.append(" - nota final: " + notaFinal);

        if (aprovado()){
            sb.append(" - APROVADO}");
        }else{
            sb.append(" - REPROVADO}");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return '\n' + "{Aluno " + super.getNome() +
                " - codigo: " + super.getCodigo() +
                " - email: " + super.getEmail() +
                " - notaFinal: " + notaFinal + '}';
    }
}
