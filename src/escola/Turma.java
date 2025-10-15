package escola;

// Classe Turma
public class Turma {
    private String codigo;
    private Professor professor; // relação de agregação

    // Construtor
    public Turma(String codigo) {
        this.codigo = codigo;
    }

    // Método para associar um professor à turma
    public void setProfessor(Professor p) {
        this.professor = p;
    }

    // Método resumo: mostra código da turma e nome do professor
    public void resumo() {
        if (professor != null) {
            System.out.println("Turma: " + codigo + " | Professor: " + professor.getNome());
        } else {
            System.out.println("Turma: " + codigo + " | Professor: (não definido)");
        }
    }
}
