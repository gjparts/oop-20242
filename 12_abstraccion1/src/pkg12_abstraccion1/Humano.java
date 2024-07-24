package pkg12_abstraccion1;

public class Humano extends SerVivo {
    //atributos
    public String nombre;
    //constructor
    public Humano(String nombre){
        super("Homo Sapiens");
        this.nombre = nombre;
    }
    //implementacion de metodos abstractos
    @Override
    public void hablar() {
        System.out.println("Se comunica con lenguaje humano");
    }
    @Override
    public void alimentarse() {
        System.out.println("Se alimenta en base a una dieta omnivora");
    }
    @Override
    public void dormir() {
        System.out.println("zzz");
    }
    @Override
    public void desplazarse() {
        System.out.println("Camina usando sus piernas");
    }   
}