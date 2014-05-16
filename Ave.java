/*
 *Práctica refugio de animales
 */
package beans;


public class Ave extends Mascota {
    
        public String tipoAve;//cantora o parlanchina

    //creamos el constructor
    public Ave(String tipoAve, String chip, String nombre, String estadoFisico, String estadoMental) {
        super(chip, nombre, estadoFisico, estadoMental);
        this.tipoAve = tipoAve;
    }
   
    //getters y setters
    public String getTipoAve() {
        return tipoAve;
    }

    public void setTipoAve(String tipoAve) {
        this.tipoAve = tipoAve;
    }
    
    
    
}//cierra la clase Ave
