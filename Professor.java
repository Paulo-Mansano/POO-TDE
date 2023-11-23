import java.util.List;

public class Professor extends Usuario {
    private String emailAcad;
    private String escola;
    private boolean alocado;
    private List<Disciplina> disciplinas;

    public Professor(String nome, Long cpf, Integer matricula, String email, List<Disciplina> disciplinas,
                     String escola) {
        super(nome, cpf, matricula, email);

        // Corrigindo a lógica de atribuição do e-mail acadêmico
        this.emailAcad = (email != null) ? email : (super.getNome() + "@educacorp.com");

        this.escola = escola;

        // Corrigindo a lógica de atribuição de 'alocado'
        this.alocado = (disciplinas != null) && !disciplinas.isEmpty();

        this.disciplinas = (disciplinas != null) ? List.copyOf(disciplinas) : List.of();
    }

    public String getEscola() {
        return escola;
    }
    public void setEscola(String escola) {
        this.escola = escola;
    }
    

    public boolean isAlocado() {
        return alocado;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void addDisciplina(Disciplina disciplina) {
       this.disciplinas.add(disciplina);
       this.alocado = true;
    }



    @Override
    public String toString() {
        return super.toString() + "\nTipo: Professor" +
                "\nEmailAcad: " + emailAcad + "\nEscola: " + escola +
                "\nAlocado: " + alocado + "\nDisciplinas: " + disciplinas;
    }

    public String getEmailAcad() {
        return emailAcad;
    }
}
