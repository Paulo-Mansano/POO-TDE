import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aluno extends Usuario {
    private static final int MAX_TURMAS = 10;
    private static final int MAX_DISCIPLINAS = 10;
    private static final int MAX_SALAS = 10;

    private String emailAcad;
    private String curso;
    private ArrayList<Turma> turma = new ArrayList<>();
    private ArrayList<Disciplina> disciplina = new ArrayList<>();
    private ArrayList<Sala> salas = new ArrayList<>();

    public Aluno(String nome, Long cpf, Integer matricula, String email, String emailAcad,
            ArrayList<Turma> turma, ArrayList<Disciplina> disciplina, ArrayList<Sala> salas) {

        super(nome, cpf, matricula, email);

        this.emailAcad = (emailAcad == null && super.getNome() != null) ? super.getNome().toLowerCase() + "@educorp.com"
                : emailAcad;

                this.emailAcad = (emailAcad == null && super.getNome() != null) ? super.getNome().toLowerCase() + "@educorp.com"
                : emailAcad;

        if (turma != null) {
            this.turma.addAll(turma);
        }

        if (disciplina != null) {
            this.disciplina.addAll(disciplina);
        }

        if (salas != null) {
            this.salas.addAll(salas);
        }
    }

    public String getEmailAcad() {
        return emailAcad;
    }

    public void setEmailAcad(String emailAcad) {
        this.emailAcad = emailAcad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma.toString();
    }

    public String getDisciplinas() {
        return disciplina.toString();
    }

    public String getSala() {
        return salas.toString();
    }

    public void addTurma(Turma novaTurma) {
        if (turma != null) {
            if (turma.size() < MAX_TURMAS) { // Defina MAX_TURMAS como a quantidade máxima permitida de turmas
                turma.add(novaTurma);
                System.out.println("Turma adicionada com sucesso!");
            } else {
                System.out.println("Limite de turmas atingido. Não foi possível adicionar a turma.");
            }
        } else {
            System.out.println("Erro: Lista de turmas não inicializada.");
        }
    }

    public Disciplina getDisciplina(int posicao) {
        if (posicao >= 0 && posicao < disciplina.size()) {
            return disciplina.get(posicao);
        } else {
            System.out.println("Posição inválida.");
            return null; // Ou lança uma exceção, dependendo do comportamento desejado
        }
    }

    public void addDisciplina(Disciplina novaDisciplina) {
        if (disciplina != null) {
            if (disciplina.size() < MAX_DISCIPLINAS) { // Defina MAX_disciplinaS como a quantidade máxima permitida de disciplinas
                disciplina.add(novaDisciplina);
                System.out.println("disciplina adicionada com sucesso!");
            } else {
                System.out.println("Limite de disciplinas atingido. Não foi possível adicionar a disciplina.");
            }
        } else {
            System.out.println("Erro: Lista de disciplinas não inicializada.");
        }
    }

    public Sala getSala(int posicao) {
         if (posicao >= 0 && posicao < salas.size()) {
            return salas.get(posicao);
        } else {
            System.out.println("Posição inválida.");
            return null; // Ou lança uma exceção, dependendo do comportamento desejado
        }
    }

    public void addSala(Sala novaSala) {
         if (novaSala != null) {
            if (salas.size() < MAX_SALAS) { // Defina MAX_disciplinaS como a quantidade máxima permitida de disciplinas
                salas.add(novaSala);
                System.out.println("disciplina adicionada com sucesso!");
            } else {
                System.out.println("Limite de salas atingido. Não foi possível adicionar a sala.");
            }
        } else {
            System.out.println("Erro: Lista de salas não inicializado.");
        }
    }

    @Override
    public String toString() {
        return "Aluno [emailAcad=" + emailAcad + ", turma=" + turma.toString() +
        ", disciplina=" + disciplina.toString() + ", salas=" + salas.toString() + "]";
    }

    
}
