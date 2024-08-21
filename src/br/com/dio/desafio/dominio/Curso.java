package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setCargaHoraria(cargaHoraria);
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso: " + getTitulo() +
                "\ndescricao: " + getDescricao() +
                "\ncargaHoraria=" + getCargaHoraria()+"\n";
    }

}
