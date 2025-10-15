package escola;

// Classe principal (Main)
public class Main {
    public static void main(String[] args) {
        // Cria um professor
        Professor prof1 = new Professor("Carlos Eduardo");

        // Cria uma turma e associa o professor
        Turma turma1 = new Turma("T1");
        turma1.setProfessor(prof1);

        // Mostra o resumo
        turma1.resumo();

        // Troca o professor
        Professor prof2 = new Professor("Ana Souza");
        turma1.setProfessor(prof2);

        // Mostra o resumo novamente
        turma1.resumo();
    }
}
