package pkg08_herencia1;
public class Catedratico extends Empleado {
    //atributos
    public String profesion;
    //constructor
    public Catedratico(String nombre, int edad, char genero,
                       String profesion, float salario){
        //construir la super clase
        //para este caso he dedicido usar el constr. con param.
        //de la clase padre, para ejemplificarles que se puede
        super(nombre, edad, genero, "Catedrático/Docente", salario);
        //inicializar el atributo de esta clase
        this.profesion = profesion;
    }
    //metodos
    public void educar(){
        System.out.println("Doy clases de mi oficio: "+this.profesion);
    }
}
