package pkg10_polimorfismo1;
public class Gato extends Animal {
    //atributos
    public String apodo;
    private boolean tienePelaje;
    //constructor
    public Gato(String apodo, boolean tienePelaje,
                int patas, boolean tieneCola) {
        //construir la super clase
        super("Gato", "Felino", patas, tieneCola);
        //inicializar atributos de esta clase
        this.apodo = apodo;
        this.tienePelaje = tienePelaje;
    }
    //metodos
    public void ronronear(){
        System.out.println("prrrrrrrrrr");
    }
    //Polimorfismo: reemplazar o cambiar el funcionamiento de un metodo heredado
    @Override
    public void hablar(){
        //Override completo: no reutilizaremos nada del metodo heredado
        //vamos a cambiar por completo su comportamiento
        System.out.println("Miau");
    }
    @Override
    public void imprimir(){
        //Override parcial: voy a reutilizar el metodo heredado y le voy
        //a agregar mas funcionalidades.
        super.imprimir(); //mandar a llamar imprimir() de la super clase
        //ejecutamos las nuevas funcionalidades
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Tiene pelaje: "+( this.tienePelaje ? "Si" : "No" ));
    }
}
