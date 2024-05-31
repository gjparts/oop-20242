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
        //ver los valores de los atributos del objeto
        System.out.println( "Nombre: "+pe1.nombre );
        System.out.println( "Edad: "+pe1.edad );
        System.out.println( "Genero: "+pe1.genero );
        
        System.out.println("************************************");
        Persona pe2 = new Persona();
        System.out.println( "Nombre: "+pe2.nombre );
        System.out.println( "Edad: "+pe2.edad );
        System.out.println( "Genero: "+pe2.genero );
        
        System.out.println("************************************");
        Persona pe3 = new Persona("Filomeno Colinas", 78, 'M');
        System.out.println( "Nombre: "+pe3.nombre );
        System.out.println( "Edad: "+pe3.edad );
        System.out.println( "Genero: "+pe3.genero );
        
        System.out.println("************************************");
        Persona pe4 = new Persona("Estebancito Maravilla", 80);
        System.out.println( "Nombre: "+pe4.nombre );
        System.out.println( "Edad: "+pe4.edad );
        System.out.println( "Genero: "+pe4.genero );
        
        System.out.println("************************************");
        Carro c1 = new Carro("Honda", "CIVIC", "Negro", 2004);
        System.out.println( "Marca: "+c1.marca );
        System.out.println( "Modelo: "+c1.modelo );
        System.out.println( "Color: "+c1.color );
        System.out.println( "Año: "+c1.anio );
        
    }
    
}
