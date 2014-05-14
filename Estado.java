/*
 *Práctica refugio de animales
 */

package beans;

/**
 *Clase Estado nos indica el estado físico y mental de la mascota
 */
public class Estado {
    
    private String fisico;
    private String mental;

    public Estado(String fisico, String mental) {
        this.fisico = fisico;
        this.mental = mental;
    }

    @Override
    public String toString() {
        return "Estado{" + "fisico=" + fisico + ", mental=" + mental + '}';
    }

    public String getFisico() {
        return fisico;
    }

    public void setFisico(String fisico) {
        this.fisico = fisico;
    }

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }    
}
