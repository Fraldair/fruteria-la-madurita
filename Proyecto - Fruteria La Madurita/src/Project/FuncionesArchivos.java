
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
    
    private static String [][]tablaproducto;
    
    
     public  static void agregarArchivoCliente(Clientes cliente) throws IOException{
     File file=new File("Clientes.txt");
     
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bfWriter;
        bfWriter = new BufferedWriter(fw);
            bfWriter.write(""); 
            bfWriter.write(cliente.getNombre()+"-"+cliente.getId()+"-"+cliente.getN_cedula()+"-"+cliente.getDireccion()
                    +"-"+cliente.getNum_cell()+"-"+"\r\n");
            bfWriter.close();
            fw.close();
    }
  
 public  static void crearArchivoCliente() throws IOException{
       File file=new File("Cliente.txt");
        FileWriter fw=new FileWriter(file);
    }
    
 public static void leerArchivoCliente(){
    cliente=new ArrayList<>();
    File file=new File("Clientes.txt");
     Scanner reader;
    String line;
    try{
    reader=new Scanner(file);
   
    while(reader.hasNextLine()){
    line= reader.nextLine();
    
    Scanner delimiter=new Scanner(line);
    delimiter.useDelimiter("\\s*-\\s*");
    cliente.add( new Clientes(delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next()));
    }
    }catch(FileNotFoundException s){
    System.out.println("fdfd");
    }
    
    }
    
 public static Clientes buscarCeduCliente(String cedula){
     leerArchivoCliente();
    Clientes info=new Clientes("","","","","");
    for(Clientes i:cliente){
       if((i.getN_cedula().trim()).equals(cedula.trim())){
       info=i;
       }
      }
       return info;
    }
    //fin cliente
      
//Empleado u Usuario
 public  static void crearArchivoE() throws IOException{
       File file=new File("Empleado.txt");
        FileWriter fw=new FileWriter(file);
    }
 
 public static void crearArchivoEmple(Empleado empleado)throws IOException{
          File arch=new File("Empleado.txt");
          
          FileWriter opw= new FileWriter(arch,true);
          BufferedWriter escribir= new BufferedWriter (opw);
           escribir.write(empleado.getNombres()+"-"+empleado.getApellidos()+"-"+empleado.getFecha_na()+"-"+empleado.getE_mail()
           +"-"+empleado.getCedula()+"-"+empleado.getContraseña()+"-"+empleado.getVe_contraseña()+"-"+
                   empleado.getDireccion()+"-"+empleado.getTelefono()+"-"+empleado.getCelular()+"-"+empleado.getRol()+"-"+"\r\n");
           escribir.close();
           opw.close();
           
      }
      
 public static void leerArchivoEmple(){
      empleado= new ArrayList<>();
     // Empleado emple=new Empleado("","","","","","","","","","");
       File archivoem= new File ("Empleado.txt");
       Scanner scan;
       String linea;
      try{ 
       scan= new Scanner (archivoem);
       
       while(scan.hasNextLine()){
           linea= scan.nextLine();
           
           Scanner delimitador=new Scanner(linea);
           delimitador.useDelimiter("\\s*-\\s*");
           empleado.add(new Empleado(delimitador.next(),delimitador.next(),delimitador.next(),delimitador.next()
                   ,delimitador.next(),delimitador.next(),delimitador.next(),delimitador.next(),
                   delimitador.next(),delimitador.next(),delimitador.next()));

           
       } }catch(FileNotFoundException s){
    System.out.println("fdfd");
    }
      
      }
 
 public static boolean buscaUsuario(String cedula, String pass) throws IOException{
 leerArchivoEmple();
 boolean ot=false;
 //Empleado usuario=new Empleado("","","","","","","","","","");
 for (Empleado usu:empleado){
    if (usu.getCedula().trim().equals(cedula.trim()) && usu.getContraseña().trim().equals(pass.trim())){
    ot= true;
    }
 }
 return ot;
 }
 
 public static boolean buscaUsuario2(String cedula, String email) throws IOException{
 leerArchivoEmple();
 boolean ot=false;
 //Empleado usuario=new Empleado("","","","","","","","","","");
 for (Empleado usu:empleado){
    if (usu.getCedula().trim().equals(cedula.trim()) || usu.getE_mail().trim().equals(email.trim())){
    ot= true;
    }
 }
 return ot;
 }
      
      //fin empleado
      
  //Producto
 public  static void crearArchivoIn() throws IOException{
       File file=new File("Inventario.txt");
        FileWriter fw=new FileWriter(file);
    }
 public static void crearArchivoInventario(Producto producto)throws IOException{
          File arch=new File("Inventario.txt");
          
          FileWriter opw= new FileWriter(arch,true);
          BufferedWriter escribir= new BufferedWriter (opw);
           escribir.write(producto.getNom_prod()+"!&%"+producto.getCod_prod()+"!&%"+producto.getPrecio_prod()+"!&%"
                   +producto.getCant_prod()+"!&%"+producto.getFecha_ingreso()+"\r\n");
           escribir.close();
           opw.close();
           
      }
      
public static void leerArchivoInventario(){
         producto= new ArrayList<>();
            
            File archivoin= new File ("Inventario.txt");
            Scanner scan;
            String linea="";
   try {
            scan= new Scanner (archivoin);
            
            while(scan.hasNextLine()){
            linea= scan.nextLine();
            
            Scanner delimitador=new Scanner(linea);
            delimitador.useDelimiter("\\s*!&%\\s*");
            producto.add(new Producto(delimitador.next(),delimitador.next(),delimitador.next(),delimitador.next(),delimitador.next()));
        
                
            }   } catch (FileNotFoundException ex) {
                System.out.println("Pendejo");
            Logger.getLogger(FuncionesArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
      
      }
public static Producto busProductoCod(String cod) {
      leerArchivoInventario();
      Producto product=new Producto("","","","","");
      for(Producto ele:producto){
       if(ele.getCod_prod().trim().equals(cod.trim())){
        product=ele;
       }
      }
      
      return product;
      }

      
public static Producto busProductoName(String name) {
  leerArchivoInventario();
  Producto product= new Producto("","","","","");
   for (Producto ele: producto){
    if(ele.getNom_prod().trim().equals(name.trim())){
     product=ele;
    }
   }
   return product;
} 

public static void eliminarProducto(Producto produc) throws IOException{
    producto.remove(produc);
    crearArchivoIn(); 
    for(Producto elemento:producto){
        crearArchivoInventario(elemento);//se guardan todos los valores menos el produc
    }
}

public static String[][] leerRegistroInventario(){
    leerArchivoInventario();
    tablaproducto=new String[producto.size()][5];
    for(int i=0;i<producto.size();i++){
    tablaproducto[i][0]=producto.get(i).getNom_prod();
    tablaproducto[i][1]=producto.get(i).getCod_prod();
    tablaproducto[i][2]=producto.get(i).getCant_prod();
    tablaproducto[i][3]=producto.get(i).getPrecio_prod();
    tablaproducto[i][4]=producto.get(i).getFecha_ingreso();
    
    }
    return tablaproducto;
    } 

public static String[][] leerRegistroProducto(){
    leerArchivoInventario();
    tablaproducto=new String[producto.size()][4];
    for(int i=0;i<producto.size();i++){
    tablaproducto[i][0]=producto.get(i).getNom_prod();
    tablaproducto[i][1]=producto.get(i).getCod_prod();
    tablaproducto[i][2]=producto.get(i).getCant_prod();
    tablaproducto[i][3]=producto.get(i).getPrecio_prod();
  //  tablaproducto[i][4]=producto.get(i).getFecha_ingreso();
    
    }
    return tablaproducto;
    } 
//fin producto

    //Proveedor

public static void crearArchivoProveedor(Proveedores proveedor) throws IOException
{
    File archivo= new File("Proveedores.txt");
    FileWriter opwr =new FileWriter(archivo,true);
    BufferedWriter escribir=new BufferedWriter(opwr);
     escribir.write(proveedor.getEmpresa()+"-"+proveedor.getContacto()+"-"+proveedor.getDireccion()+"-"+
             proveedor.getTelefono()+"-"+
             proveedor.getRuc()+"-"+proveedor.getCiudad()+"-"+"\r\n");
     
     escribir.close();
     opwr.close();
    

}

public static void leerArchivoProveedor() throws IOException{
    proveedor=new ArrayList<>();
    
    File archivo=new File ("Proveedores.txt");
    Scanner scan;
    String linea;
    
    scan =new Scanner(archivo);
    while(scan.hasNextLine()){
    linea = scan.nextLine();
    
    Scanner delimitador=new Scanner(linea);
    delimitador.useDelimiter("\\s*-\\s*");
    proveedor.add(new Proveedores(delimitador.next(),
            delimitador.next(),delimitador.next(),
            delimitador.next(),delimitador.next(),delimitador.next()));
    
    
    }
}
 public static boolean esEntero(String linea){
 boolean ot=true;
 char [] caract= linea.toCharArray();
   for (char i:caract){
    if(!Character.isDigit(i)){
     ot=false;
    }
   }      
 return ot; 
 }

 public static boolean twoWords(String strw){//para validar nombres y apellidos
   Scanner sc=new Scanner(strw);
   sc.useDelimiter("\\s* \\s*");
   sc.next();
   if(sc.hasNext()){
   sc.next();}
   return !sc.hasNext();
   }
 
 public static String unirS(String dia, String mes , String anio){
        String cadena="";
        cadena=dia+"/"+mes+"/"+anio;
    return cadena;
    }
 

 public static boolean validaCedula(String x){
    int suma=0;
    if(x.length()==9){
//      System.out.println("Ingrese su cedula de 10 digitos");
      return false;
    }else{
      int a[]=new int [x.length()/2];
      int b[]=new int [(x.length()/2)];
      int c=0;
      int d=1;
      for (int i = 0; i < x.length()/2; i++) {
        a[i]=Integer.parseInt(String.valueOf(x.charAt(c)));
        c=c+2;
        if (i < (x.length()/2)-1) {
          b[i]=Integer.parseInt(String.valueOf(x.charAt(d)));
          d=d+2;
        }
      }
    
      for (int i = 0; i < a.length; i++) {
        a[i]=a[i]*2;
        if (a[i] >9){
          a[i]=a[i]-9;
        }
        suma=suma+a[i]+b[i];
      } 
      int aux=suma/10;
      int dec=(aux+1)*10;
      if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length()-1))))
        return true;
      else
        if(suma%10==0 && x.charAt(x.length()-1)=='0'){
          return true;
        }else{
          return false;
        }
     
  }
 }

 //facturacion
 
 public  static void crearDatosfactura(Facturacion fa,String nu_factura) throws IOException{
     File file=new File("/Facturas/Factura.txt");
     
        FileWriter fw=new FileWriter(file,true);
        BufferedWriter bfWriter;
        bfWriter = new BufferedWriter(fw);
            bfWriter.write(""); 
            bfWriter.write(fa.getNom_clien()+"-"+fa.getCed_clien()+"-"+fa.getNum_factu()+"-"+fa.getFecha_ven()
                    +"-"+fa.getNom_vendedor()+"-"+"\r\n");
            bfWriter.close();
            fw.close();
    }
  
 public  static void creaArchivoDatosFac() throws IOException{
       File file=new File("Cliente.txt");
        FileWriter fw=new FileWriter(file);
    }
    
 public static void leerArchivoDatosFactura(){
    cliente=new ArrayList<>();
    File file=new File("Clientes.txt");
     Scanner reader;
    String line;
    try{
    reader=new Scanner(file);
   
    while(reader.hasNextLine()){
    line= reader.nextLine();
    
    Scanner delimiter=new Scanner(line);
    delimiter.useDelimiter("\\s*-\\s*");
    cliente.add( new Clientes(delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next(),delimiter.next()));
    }
    }catch(FileNotFoundException s){
    System.out.println("fdfd");
    }
    
    }
    
 
 
}

