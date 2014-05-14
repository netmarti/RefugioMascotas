/*
 *Práctica refugio de animales
 */
package beans;

/**
 * Clase Padre
 */
public class Mascota {

    //propriedades de la superclase Mascota
    protected String chip;
    protected String tipo;
    protected String nombre;
    protected int edad;
    protected Estado estado;
    
     //constructor de la superclase Mascota
    public Mascota() {
        
    }
    
    public Mascota(String chip,String tipo, String nombre, int edad,String fisico,String mental) {
        
        this.chip = chip;
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        //creo un objeto de tipo Estado con los parametros pasados el constructor de Mamifero
        //llamo el constructor de la clase Estado
        this.estado = new Estado(fisico, mental);
        
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getColor() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String mascotaString;
        
        mascotaString = "[Chip: " + this.chip + "]<br>"
                + "[Tipo: " + this.tipo + "]<br>"
                + "[Nombre: " + this.nombre + "]<br>"
                + "[Edad: " + this.edad + "]<br>"
                + "[Estado: " + this.estado + "]";
                
        return mascotaString;
    }
}
