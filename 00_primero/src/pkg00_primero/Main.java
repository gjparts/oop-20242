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
        
        Producto pr1 = new Producto("ABC01", "Coca Cola 3L", 55);
        Producto pr2 = new Producto("XYZ01", "Cheetos Pequeño","Frito Lay",true,10);
        pr1.imprimir();
        pr2.imprimir();
        
        pe1.imprimir();
        pe2.imprimir();
        pe3.imprimir();
        pe4.imprimir();
        System.out.println("*****************************************");
        System.out.println("p1: mayor de edad:"+pe1.esMayorDeEdad());
        
        Empleado em1 = new Empleado("Gerardo", 42, 'M', 10000, 'T');
        em1.setEdad(90);
        System.out.println("la edad de em1 es: "+em1.getEdad());
    }
    
}
