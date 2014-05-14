/*
 *Práctica refugio de animales
 */
package beans;

/**
 *Clase Ave
 */
public class Ave extends Mascota {

  private String comportamiento;
  
    /*
     * @param protected String chip;
     * @param protected String tipo;
     * @param protected String nombre;
     * @param protected int edad;
     * @param protected Estado estado; // fisico y mental
     * @param listaMascotas
     * @param ArrayList
     * @param comportamiento // diurno o nocturno
     */
     
      //constructor de la clase Ave
  
    public Ave(String chip, String tipo, String nombre, 
    int edad, String fisico, String mental, java.util.
    ArrayList<Mascota> listaMascotas, Mascota ArrayList, String comportamiento) {
        
        super(chip,tipo,nombre,edad,fisico,mental);
        this.comportamiento = comportamiento;
     }

  //seters y geters para obtener la variable Comportamiento
  
    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    @Override
    public String toString() {
        return "Ave{" + "comportamiento=" + comportamiento + '}';
    }

}//cierra la clase, útlima llave del documento
