/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kentschoolar.main;

import kentschoolar.src.Professor;
import kentschoolar.src.Aluno;
import kentschoolar.src.Curso;


/**
 *
 * @author iuri
 */
public class KentSchoolar {

    public static void main(String[] args) {
        // Cria instâncias de Aluno, Professor e Curso
        Aluno aluno1 = new Aluno(1, "João", 20);
        Professor professor1 = new Professor(101, "Maria", "Matemática");
        Curso curso1 = new Curso(1001, "Matemática Avançada", professor1);

        // Adiciona alunos ao curso
        curso1.adicionarAluno(aluno1);

        // Realiza outras operações conforme necessário

        // Exemplo de uso de métodos getters para acessar informações
        System.out.println("Nome do aluno: " + aluno1.getNome());
        System.out.println("Professor do curso: " + curso1.getProfessor().getNome());
    }
}
