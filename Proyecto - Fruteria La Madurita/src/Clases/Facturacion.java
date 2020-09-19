
package Clases;
import Clases.Clientes;
/**
 *
 * @author Frael Campos
 */
public class Facturacion {
  
    public String nom_clien;
    public String ced_clien;
    public String num_factu;
    public String fecha_ven;
    public String nom_vendedor;

    public Facturacion(String nom_clien, String ced_clien, String num_factu, String fecha_ven, String nom_vendedor) {
        this.nom_clien = nom_clien;
        this.ced_clien = ced_clien;
        this.num_factu = num_factu;
        this.fecha_ven = fecha_ven;
        this.nom_vendedor = nom_vendedor;
    }

    public String getNom_clien() {
        return nom_clien;
    }

    public void setNom_clien(String nom_clien) {
        this.nom_clien = nom_clien;
    }

    public String getCed_clien() {
        return ced_clien;
    }

    public void setCed_clien(String ced_clien) {
        this.ced_clien = ced_clien;
    }

    public String getNum_factu() {
        return num_factu;
    }

    public void setNum_factu(String num_factu) {
        this.num_factu = num_factu;
    }

    public String getFecha_ven() {
        return fecha_ven;
    }

    public void setFecha_ven(String fecha_ven) {
        this.fecha_ven = fecha_ven;
    }

    public String getNom_vendedor() {
        return nom_vendedor;
    }

    public void setNom_vendedor(String nom_vendedor) {
        this.nom_vendedor = nom_vendedor;
    }
    
  
    
    
    public class Detalle_ven{
    
    
    }
}
