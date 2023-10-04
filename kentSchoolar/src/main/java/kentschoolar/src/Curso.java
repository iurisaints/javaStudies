package kentschoolar.src;

import kentschoolar.src.Professor;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author iuri
 */
public class Curso {
    private int codigo;
    private String nome;
    private List<Aluno> alunos;
    private Professor professor;

    public Curso(int codigo, String nome, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    // Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

}
