package TDEPOO;

import java.util.Arrays;

public class Professor extends Usuario{
    private String escola;
    private Boolean alocado = false;
    private Disciplina[] disciplinas;

    public Professor(String nome, Long cpf, Integer matricula, String email, Disciplina[] disciplinas, 
                     String escola, Boolean alocado) {

        super(nome, cpf, matricula, email, disciplinas);
        this.escola = escola;
        if (disciplinas != null) {
            this.alocado = true;
        }
        this.alocado = alocado;
        this.disciplinas = disciplinas;
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

    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor [escola=" + escola + 
               ", alocado=" + alocado + ", disciplinas=" 
               + Arrays.toString(disciplinas) + getNome() + "]";
    }
  
    
}
