package TDEPOO;

import java.util.Arrays;

public class Disciplina {
    private String titulo;
    private Integer codigo;
    private Integer cargaHoraria;
    private String descricao;
    private Integer aulasSemana;

    private Professor[] professoresMinistrantes;
    private Sala[] salas;
    private Turma[] turmas;


    public Disciplina(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Professor[] professoresMinistrantes, Sala[] salas, Sala[] labs) {
        this.titulo = titulo.toUpperCase();
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao.toUpperCase();
        this.aulasSemana = aulasSemana;
        this.professoresMinistrantes = professoresMinistrantes;
        this.salas = salas;
        this.labs = labs;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getAulasSemana() {
        return aulasSemana;
    }

    public void setAulasSemana(Integer aulasSemana) {
        this.aulasSemana = aulasSemana;
    }

    public Sala[] getProfessoresMinistrantes() {
        return professoresMinistrantes;
    }

    public void setProfessoresMinistrantes(Object[] professoresMinistrantes) {
        this.professoresMinistrantes = professoresMinistrantes;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Object[] salas) {
        this.salas = salas;
    }

    public Sala[] getLabs() {
        return labs;
    }

    public void setLabs(Object[] labs) {
        this.labs = labs;
    }

    @Override
    public String toString() {
        return "Disciplina [titulo=" + titulo + ", codigo=" + codigo + ", cargaHoraria=" + cargaHoraria + ", descricao="
                + descricao + ", aulasSemana=" + aulasSemana + ", professoresMinistrantes="
                + Arrays.toString(professoresMinistrantes) + ", salas=" + Arrays.toString(salas) + ", labs="
                + Arrays.toString(labs) + ", horasSemana=" + Arrays.toString(horasSemana) + "]";
    }

}