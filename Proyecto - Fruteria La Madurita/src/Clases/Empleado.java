
package Clases;

/**
 *
 * @author Frael Campos
 */
public class Empleado {
   
    private String nombres;
    private String apellidos;
    private String fecha_na;
    private String e_mail;
    private String cedula;
    private String contraseña;
    private String ve_contraseña;
    private String direccion;
    private String telefono;
    private String celular;
    private String rol;

    public Empleado(String nombres, String apellidos, String fecha_na, 
            String e_mail, String cedula, String contraseña,
            String ve_contraseña, String direccion, String telefono, String celular,
            String rol) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_na = fecha_na;
        this.e_mail = e_mail;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.ve_contraseña = ve_contraseña;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.rol = rol;
    }
    
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_na() {
        return fecha_na;
    }

    public void setFecha_na(String fecha_na) {
        this.fecha_na =fecha_na;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getVe_contraseña() {
        return ve_contraseña;
    }

    public void setVe_contraseña(String ve_contraseña) {
        this.ve_contraseña = ve_contraseña;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
