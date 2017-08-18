
package examen1_diegomatamoros;

public class Libros {
    String titulo,descripcion,genero,autor;
    int copias,puntaje,añoPublicacion,valor,edicion;

    public Libros() {
    }

    public Libros(String titulo, String descripcion, String genero, String autor, int copias, int puntaje, int añoPublicacion, int valor, int edicion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.autor = autor;
        this.copias = copias;
        this.puntaje = puntaje;
        this.añoPublicacion = añoPublicacion;
        this.valor = valor;
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libros{" + "titulo=" + titulo + ", descripcion=" + descripcion + ", genero=" + genero + ", autor=" + autor + ", copias=" + copias + ", puntaje=" + puntaje + ", a\u00f1oPublicacion=" + añoPublicacion + ", valor=" + valor + ", edicion=" + edicion + '}';
    }
    
    
}
