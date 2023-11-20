package TDEPOO;

import java.util.Arrays;

public class Professor extends Usuario{
    private String escola;
    private boolean alocado = false;
    private Object[] disciplinas;

    public Professor(String nome, Long cpf, Integer matricula, String email, Object[] disciplinas, 
                     String escola, boolean alocado, Object[] disciplinas2) {

        super(nome, cpf, matricula, email, disciplinas);
        this.escola = escola;
        if (disciplinas != null) {
            this.alocado = true;
        }
        this.alocado = alocado;
        disciplinas = disciplinas2;
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

    public Object[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Object[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor [escola=" + escola + 
               ", alocado=" + alocado + ", disciplinas=" 
               + Arrays.toString(disciplinas) + getNome() + "]";
    }
  
    
}
