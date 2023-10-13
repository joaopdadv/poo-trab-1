package alunos;

public class Aluno {

    private int codigo;
    private String nome;
    private String email;
    private float notas[] = new float[3];
    private float notaFinal;

    public Aluno(int codigo, String nome, String email, float n1, float n2, float n3) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
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

        sb.append("Aluno: " + nome);
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
        return '\n' + "{Aluno " + nome +
                " - codigo: " + codigo +
                " - email: " + email +
                " - notaFinal: " + notaFinal + '}';
    }
}
