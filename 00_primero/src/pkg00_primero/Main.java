package pkg00_primero;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar un objeto de clase persona
        Persona pe1 = new Persona();
        //asignar valores a los atributos del objeto
        pe1.nombre = "Gerardo";
        pe1.genero = 'M';
        pe1.edad = 42;
        //ller los valores de los atributos del objeto
        System.out.println( "Nombre: "+pe1.nombre );
        System.out.println( "Edad: "+pe1.edad );
        System.out.println( "Genero: "+pe1.genero );
    }
    
}
