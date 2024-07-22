package pkg10_polimorfismo1;

public class Perro extends Animal {
    //atributos
    public String apodo;
    private String raza;
    //constructor
    public Perro(String apodo, String raza, int patas, boolean tieneCola) {
        super("Perro", "Canino", patas, tieneCola);
        this.apodo = apodo;
        this.raza = raza;
    }
    //metodos
    public void jugar(){
        System.out.println("Corre y mueve la cola.");
    }
    @Override
    public void hablar(){
        //Override completo
        System.out.println("Wof");
    }
    @Override
    public void imprimir(){
        //Override parcial
        super.imprimir();
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Raza: "+this.raza);
    }
}
