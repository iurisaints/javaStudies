package kentschoolar.src;

/**
 *
 * @author iuri
 */
public class Professor {
    private int id;
    private String nome;
    private String disciplina;
    
    public Professor(int id, String nome, String disciplina) {
        this.id = id;
        this.nome = nome;
        this.disciplina = disciplina;
    }
    
    // Métodos getters e setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
