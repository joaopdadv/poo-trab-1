package pessoa.professores;

import pessoa.Pessoa;

public class Professor extends Pessoa {
    public Professor(int codigo, String nome, String email) {
        super(codigo, nome, email);
    }

    @Override
    public String toString() {
        return "{Professor " + super.getNome() +
                " - codigo: " + super.getCodigo() +
                " - email: " + super.getEmail() + '}';
    }
}
