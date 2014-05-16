package beans;

public class Mascota {

    //propriedades de la superclase Mascota
    protected String chip;
    protected String nombre;
    protected Estado estado;
    
    
    public Mascota() {
        
    }
    
    public Mascota(String chip,String nombre, String estadoFisico,String estadoMental) {
        
        this.chip = chip;
        this.nombre = nombre;
        
        
        //creo un objeto de tipo Mascota con los parametros pasados el constructor
        //llamo al constructor de la clase Estado
        this.estado = new Estado(estadoFisico, estadoMental);
        
    }

//creamos los métodos Setter y Getter de la clase
    
    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
                + "[Nombre: " + this.nombre + "]<br>"
                + "[Estado: " + this.estado.toString() + "]"
                + "[Tipo de mascota: " + this.getClass().getSimpleName() + "]";
                
        return mascotaString;
    }
}
