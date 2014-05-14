/*
 *Práctica refugio de animales
 */
 
package beans;

import java.util.ArrayList;

/**
 * Categoria
 */
 
public class Categoria {

    private String tipo;
    private String descripcion;
    private ArrayList<Mascota> listaMascotas;
    
    public Categoria(String tipo, String descripcion) {

        this.tipo = tipo;
        this.descripcion = descripcion;
        this.listaMascotas = new ArrayList<Mascota>();   
    }
    
    public void add(Mascota mascota) {
        
        this.listaMascotas.add(mascota);
    }

    public Categoria() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        String categoriaString;

        categoriaString = "[Tipo: " + this.tipo + "]<br>"
                + "[Descripcion: " + this.descripcion + "]<br>"
                + this.listaMascotas.toString() +"]<br>";
                
        return categoriaString;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }  

}
