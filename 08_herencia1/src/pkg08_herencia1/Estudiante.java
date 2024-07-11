package pkg08_herencia1;
public class Estudiante extends Persona {
    //atributos
    public String cuenta;
    public String carrera;
    //constructor
    public Estudiante(String nombre, String cuenta, String carrera){
        /*es importante saber que cuando la clase Padre
        NO tiene un constructor sin parametros es necesario
        entonces construir nosotros a la super clase
        usando alguno de sus constructores.*/
        //note en este caso que solo el nombre enviamos al constr.
        //de la super clase, la edad y el genero enviamos valores
        //predeterminados porque no los perdimos aqui
        super(nombre, 0, 'X');
        //atributos de la clase hijo
        this.cuenta = cuenta;
        this.carrera = carrera;
    }
    //metodos
    public void estudiar(){
        System.out.println("Estudio "+this.carrera+", mi edad es "+this.edad);
    }
}
