package alunos;

public class Aluno {

    private String nome;
    private float notas[] = new float[3];
    private float notaFinal;

    public Aluno(String nome, float n1, float n2, float n3) {
        this.nome = nome;
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
        this.notaFinal = calculateMedia(n1,n2,n3);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    private float calculateMedia(float n1,float n2,float n3){
        return (n1+n2+n3)/3;
    }
}
