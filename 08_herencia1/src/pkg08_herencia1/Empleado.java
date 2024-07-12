package pkg08_herencia1;
public class Empleado extends Persona {
    //atributos
    public float salario;
    public String cargo;
    //constructores
    public Empleado(){
        //construir la super clase
        super("no tiene", 0, 'X');
        //inicializar los atributos de la clase hijo
        this.cargo = "no definido";
        this.salario = 0.00f;
    }
    public Empleado(String nombre, int edad, char genero,
                    String cargo, float salario){
        //construir la super clase
        super(nombre, edad, genero);
        //inicializar los atributos de la clase hijo
        this.cargo = cargo;
        this.salario = salario;
    }
    //metodos
    public void trabajar(){
        System.out.println("Estoy trabajando como "+this.cargo+", denme dinero.");
    }
}
