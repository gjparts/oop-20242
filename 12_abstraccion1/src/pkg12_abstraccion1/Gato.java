package pkg12_abstraccion1;

public class Gato extends SerVivo {
    public String apodo;
    //constructor
    public Gato(String apodo){
        //construir la super clase
        super("Felino");
        this.apodo = apodo;
    }
    //implementar los metodos abstractos
    @Override
    public void dormir(){
        System.out.println("Descansa en un rincon");
    }
    @Override
    public void hablar(){
        System.out.println("Miau");
    }
    @Override
    public void desplazarse(){
        System.out.println("Camina sin hacer ruido");
    }
    @Override
    public void alimentarse(){
        System.out.println("Come alimentos gatunos");
    }
}
