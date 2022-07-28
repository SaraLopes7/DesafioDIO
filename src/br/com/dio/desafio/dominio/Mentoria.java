package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String titulo;
    private String descriçao;
    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descriçao='" + descriçao + '\'' +
                ", data=" + data +
                '}';
    }
}
