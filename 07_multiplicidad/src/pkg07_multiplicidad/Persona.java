package pkg07_multiplicidad;
public class Persona {
    //atributos
    public String identidad;
    public String nombre;
    public int telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public Mascota[] mascotas;
    //aqui faltan atributos
    //constructor
    public Persona(String identidad, String nombre, int telefono) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //metodos
    public void imprimir(){
        System.out.println("****** Perfil ******");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Identidad: "+this.identidad);
        System.out.println("Telefono: "+this.telefono);
        //la direccion probablemente venga null
        if( this.direccion != null ){
            System.out.println("Direccion de residencia: ");
            System.out.println("\tBarrio/Colonia: "+this.direccion.getColonia().nombre);
            System.out.println("\tCalle: "+this.direccion.calle);
            System.out.println("\tAvenida: "+this.direccion.avenida);
            System.out.println("\tBloque: "+this.direccion.bloque);
            System.out.println("\tCasa: "+this.direccion.casa);
            System.out.println("\tCodigo Postal"+this.direccion.getColonia().codigoPostal);
        }
        //la empresa donde labora puede venir null
        if( this.empresaLabora != null ){
            System.out.println("Empresa donde Labora:");
            System.out.println("\tNombre: "+this.empresaLabora.nombre);
            System.out.println("\tTelefono: "+this.empresaLabora.telefono);
            System.out.println("\tDireccion de la empresa: ");
            System.out.println("\t\tBarrio/Colonia: "+this.empresaLabora.getDireccion().getColonia().nombre);
            System.out.println("\t\tCalle: "+this.empresaLabora.getDireccion().calle);
            System.out.println("\t\tAvenida: "+this.empresaLabora.getDireccion().avenida);
            System.out.println("\t\tBloque: "+this.empresaLabora.getDireccion().bloque);
            System.out.println("\t\tCasa: "+this.empresaLabora.getDireccion().casa);
            System.out.println("\t\tCodigo Postal"+this.empresaLabora.getDireccion().getColonia().codigoPostal);
        }
    }
}
