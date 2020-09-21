package Project;

import Clases.Empleado;
import Clases.Proveedores;
import Clases.Producto;
import Clases.Clientes;
import Clases.Facturacion;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frael Campos
 */
public class FuncionesArchivos {

    public static List<Clientes> cliente;
    public static List<Empleado> empleado;
    public static List<Producto> producto;
    public static List<Proveedores> proveedor;

    private static String[][] tablaproducto;

    public static void agregarCliente(Clientes cliente) throws IOException {

    }

    public static void leerArchivoCliente() {
        cliente = new ArrayList<>();

    }

    public static Clientes buscarCeduCliente(String cedula) {
        Clientes info = new Clientes("", "", "", "", "");

        return info;
    }
//fin cliente

    public static void crearEmpleado(Empleado empleado) throws IOException {

    }

    public static void leerArchivoEmple() {

    }

    public static boolean buscaUFsuario(String cedula, String pass) throws IOException {

        boolean ot = false;
        return ot;
    }

    public static boolean buscaUsuario2(String cedula, String email) throws IOException {

        boolean ot = false;

        return ot;
    }

    //fin empleado
    //Producto
    public static void crearArchivoInventario(Producto producto) {

    }

    public static void leerArchivoInventario() {
        producto = new ArrayList<>();
    }

    public static Producto busProductoCod(String cod) {
        leerArchivoInventario();
        Producto product = new Producto("", "", "", "", "");
        for (Producto ele : producto) {
           
        }

        return product;
    }

    public static Producto busProductoName(String name) {
        leerArchivoInventario();
        Producto product = new Producto("", "", "", "", "");
        for (Producto ele : producto) {
           
        }
        return product;
    }

    public static void eliminarProducto(Producto produc) throws IOException {

    }

    public static String[][] leerRegistroInventario() {
        leerArchivoInventario();
        tablaproducto = new String[producto.size()][5];
        for (int i = 0; i < producto.size(); i++) {
            tablaproducto[i][0] = producto.get(i).getNom_prod();
            tablaproducto[i][1] = producto.get(i).getCod_prod();
            tablaproducto[i][2] = producto.get(i).getCant_prod();
            tablaproducto[i][3] = producto.get(i).getPrecio_prod();
            tablaproducto[i][4] = producto.get(i).getFecha_ingreso();

        }
        return tablaproducto;
    }

    public static String[][] leerRegistroProducto() {
        leerArchivoInventario();
        tablaproducto = new String[producto.size()][4];
        for (int i = 0; i < producto.size(); i++) {
            tablaproducto[i][0] = producto.get(i).getNom_prod();
            tablaproducto[i][1] = producto.get(i).getCod_prod();
            tablaproducto[i][2] = producto.get(i).getCant_prod();
            tablaproducto[i][3] = producto.get(i).getPrecio_prod();
            //  tablaproducto[i][4]=producto.get(i).getFecha_ingreso();

        }
        return tablaproducto;
    }
//fin producto

    //Proveedor
    public static void crearArchivoProveedor(Proveedores proveedor) throws IOException {

    }

    public static void leerArchivoProveedor() throws IOException {
        proveedor = new ArrayList<>();


      
    }

    public static boolean esEntero(String linea) {
        boolean ot = true;
 
        return ot;
    }

    public static boolean twoWords(String strw) {//para validar nombres y apellidos
        Scanner sc = new Scanner(strw);
        sc.useDelimiter("\\s* \\s*");
        sc.next();
        if (sc.hasNext()) {
            sc.next();
        }
        return !sc.hasNext();
    }

  

    public static boolean validaCedula(String x) {
        int suma = 0;
        if (x.length() == 9) {
//      System.out.println("Ingrese su cedula de 10 digitos");
            return false;
        } else {
            int a[] = new int[x.length() / 2];
            int b[] = new int[(x.length() / 2)];
            int c = 0;
            int d = 1;
            for (int i = 0; i < x.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(x.charAt(c)));
                c = c + 2;
                if (i < (x.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(x.charAt(d)));
                    d = d + 2;
                }
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;
                }
                suma = suma + a[i] + b[i];
            }
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length() - 1)))) {
                return true;
            } else if (suma % 10 == 0 && x.charAt(x.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }

        }
    }

    //facturacion
    public static void crearDatosfactura(Facturacion fa, String nu_factura) throws IOException {
        
    }

  

    public static void leerArchivoDatosFactura() {
        cliente = new ArrayList<>();
       

    }

}
