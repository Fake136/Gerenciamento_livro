package com.example.books.model;

import jakarta.persistence.*;

@Entity
@Table
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String titulo;
    private  String autor;
    private  String anoPublicado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(String anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
}
