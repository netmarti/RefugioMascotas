package beans;


public class Pez extends Mascota {
    
        public String tipoPez;//agua dulce o salada

    public Pez(String chip, String nombre, String estadoFisico, String estadoMental) {
        super(chip, nombre, estadoFisico, estadoMental);
        this.tipoPez = tipoPez;
        
    }

    public String getTipoPez() {
        return tipoPez;
    }

    public void setTipoPez(String tipoPez) {
        this.tipoPez = tipoPez;
    }

  
   
 
}//cierra la clase Pez
