
package examen1_diegomatamoros;

import java.util.ArrayList;
import java.util.Date;


public class Usuarios {
    String nombre,contraseña,numero,correo,NombreFull,genero;
    Date fecha;
    ArrayList <Libros>libros=new ArrayList();
    ArrayList Amiguitos=new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String contraseña, String numero, String correo, String NombreFull, String genero, Date fecha) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.numero = numero;
        this.correo = correo;
        this.NombreFull = NombreFull;
        this.genero = genero;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreFull() {
        return NombreFull;
    }

    public void setNombreFull(String NombreFull) {
        this.NombreFull = NombreFull;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList getAmiguitos() {
        return Amiguitos;
    }

    public void setAmiguitos(ArrayList Amiguitos) {
        this.Amiguitos = Amiguitos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", numero=" + numero + ", correo=" + correo + ", NombreFull=" + NombreFull + ", genero=" + genero + ", fecha=" + fecha + ", libros=" + libros + ", Amiguitos=" + Amiguitos + '}';
    }

  
    
}
