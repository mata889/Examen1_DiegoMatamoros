
package examen1_diegomatamoros;

public class Solicitude {
    String nombre,aQuien;

    public Solicitude(String nombre, String aQuien) {
        this.nombre = nombre;
        this.aQuien = aQuien;
    }

    public Solicitude() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaQuien() {
        return aQuien;
    }

    public void setaQuien(String aQuien) {
        this.aQuien = aQuien;
    }

    @Override
    public String toString() {
        return "Solicitude{" + "nombre=" + nombre + ", aQuien=" + aQuien + '}';
    }
    
    
}
