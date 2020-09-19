
package Clases;

/**
 *
 * @author Frael Campos
 */
public class Producto {
    // Atributos
    private String nom_prod;
    private String cod_prod;
    private String precio_prod;
    private String cant_prod;
    private String fecha_ingreso;

    public Producto(String nom_prod, String cod_prod, String precio_prod, String cant_prod, String fecha_ingreso) {
        this.nom_prod = nom_prod;
        this.cod_prod = cod_prod;
        this.precio_prod = precio_prod;
        this.cant_prod = cant_prod;
        this.fecha_ingreso= fecha_ingreso;
    }

    
    
    
    //Gets and Sets
  
    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(String precio_prod) {
        this.precio_prod = precio_prod;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getCant_prod() {
        return cant_prod;
    }

    public void setCant_prod(String cant_prod) {
        this.cant_prod = cant_prod;
    }

   
}
