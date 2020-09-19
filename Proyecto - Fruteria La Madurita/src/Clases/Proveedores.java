package Clases;

/**
 *
 * @author Frael Campos
 */
public class Proveedores {

public String empresa;
public String contacto;
public  String direccion;
public String telefono;
public String ruc;
public String Ciudad;

    public Proveedores(String empresa, String contacto, String direccion, String telefono, String ruc, String Ciudad) {
        this.empresa = empresa;
        this.contacto = contacto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ruc = ruc;
        this.Ciudad = Ciudad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }


    
}
