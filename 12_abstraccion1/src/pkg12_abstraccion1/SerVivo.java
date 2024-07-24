package pkg12_abstraccion1;
public abstract class SerVivo {
    public String especie;
    //constructor
    public SerVivo(String especie){
        this.especie = especie;
    }
    //metodos abstractos
    public abstract void hablar();
    public abstract void alimentarse();
    public abstract void dormir();
    public abstract void desplazarse();
    //metodos (concretos o no abstractos)
    public void vivir(){
        //en este ejemplo el metodo vivir necesita
        //tres de los metodos abstractos
        this.desplazarse();
        this.alimentarse();
        this.dormir();
    }
}
