package pkg00_primero;

/**
 *
 * @author Gerardo
 */
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    //constructores
    //construc. sin parametros
    public Persona(){
        //inicializar los atributos con valores predeterminados
        this.nombre = "No Tiene";
        this.edad = 0;
        this.genero = 'X';
    }
    //constructor con 3 parametros
    public Persona(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    //constructor con 2 parametros
    public Persona(String nombre, int edad){
        //ejecutar el construtor sin parametros para llenar aquello que no se va a llenar aqui
        //a esto se le conode como desencadenar constructores.
        this(); //siempre que haga un llamado a otro constructor debe ser la primera instruccion
        this.nombre = nombre;
        this.edad = edad;
        //this.genero = 'X'; esto ya no es necesario porque desde this() se llena el genero
    }
    //metodo que no devuelve un valor, solo ejecuta un trabajo
    public void imprimir(){
        System.out.println("********** PERFIL ************");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.print("Genero: ");
        switch (this.genero) {
            case 'M': System.out.println("Masculino"); break;
            case 'F': System.out.println("Femenino"); break;
            case 'X': System.out.println("Otros"); break;
            default: System.out.println("No configurado");
        }
    }
    //metodo que devuelve un valor
    public boolean esMayorDeEdad(){
        if( this.edad >= 18 )
            return true;
        else
            return false;
    }
}
