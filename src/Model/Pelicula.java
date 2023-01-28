package Model;

import java.util.Date;

public class Pelicula {

    private int codigo;
    private String titulo;
    private String Categoria;
    private Date fecha;
    private String duracion;
    private String idioma;

    public Pelicula() {
    }

    public Pelicula(int codigo, String titulo, String Categoria, Date fecha, String duracion, String idioma) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.Categoria = Categoria;
        this.fecha = fecha;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /* METODOS */
    public void verDetalle() {
        /* .. */
    }

}
