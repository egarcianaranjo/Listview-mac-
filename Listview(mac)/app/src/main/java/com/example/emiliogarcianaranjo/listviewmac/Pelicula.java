package com.example.emiliogarcianaranjo.listviewmac;

/**
 * Created by emiliogarcianaranjo on 20/11/15.
 */
public class Pelicula {

    public int imagen;
    public String titulo;
    public String url;

    public Pelicula(int imagen, String titulo, String url)
    {
        this.imagen = imagen;
        this.titulo = titulo;
        this.url = url;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
