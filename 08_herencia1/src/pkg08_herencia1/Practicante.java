package pkg08_herencia1;
public class Practicante extends Empleado {
    //atributos
    public int meses;
    //constructores
    public Practicante(String nombre, int edad, int meses){
        //construir la super clase
        //en esta clase es opcional construirla puesto que
        //la clase padre(super) tiene un constr. sin parametros
        //por lo que JAVA no obliga a usarlo ya que asume que ese
        //se va a utilizar
        //pero como una buena practica se debe de poner
        super();
        //llenar algunos atributos de las super clases que heredamos
        //en este caso Practicante hereda de Empleado la cual
        //hereda de Persona
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = "Practicante/Pasante";
        //llenar los atributos  de esta clase
        this.meses = meses;
    }
}
