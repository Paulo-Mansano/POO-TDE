package TDEPOO;

import java.util.Arrays;

public class Disciplina {
    private String titulo;
    private Integer codigo;
    private Integer cargaHoraria;
    private String descricao;
    private Integer aulasSemana;

    private Object[] professoresMinistrantes;
    private Object[] salas;
    private Object[] labs;
    private Object[] horasSemana;
    private Object[] turmas;


    public Disciplina(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Object[] professoresMinistrantes, Object[] salas, Object[] labs, Object[] horasSemana) {
        this.titulo = titulo.toUpperCase();
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao.toUpperCase();
        this.aulasSemana = aulasSemana;
        this.professoresMinistrantes = professoresMinistrantes;
        this.salas = salas;
        this.labs = labs;
        this.horasSemana = horasSemana;
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

    public Object[] getProfessoresMinistrantes() {
        return professoresMinistrantes;
    }

    public void setProfessoresMinistrantes(Object[] professoresMinistrantes) {
        this.professoresMinistrantes = professoresMinistrantes;
    }

    public Object[] getSalas() {
        return salas;
    }

    public void setSalas(Object[] salas) {
        this.salas = salas;
    }

    public Object[] getLabs() {
        return labs;
    }

    public void setLabs(Object[] labs) {
        this.labs = labs;
    }

    public Object[] getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(Object[] horasSemana) {
        this.horasSemana = horasSemana;
    }

    @Override
    public String toString() {
        return "Disciplina [titulo=" + titulo + ", codigo=" + codigo + ", cargaHoraria=" + cargaHoraria + ", descricao="
                + descricao + ", aulasSemana=" + aulasSemana + ", professoresMinistrantes="
                + Arrays.toString(professoresMinistrantes) + ", salas=" + Arrays.toString(salas) + ", labs="
                + Arrays.toString(labs) + ", horasSemana=" + Arrays.toString(horasSemana) + "]";
    }

    

    

}