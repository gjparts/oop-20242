package pkg13_abstraccion2;
public class Circulo extends Figura {
    //atributo
    private double radio;
    //constructor
    public Circulo(double radio){
        super("Círculo");
        this.setRadio(radio);
    }
    //impementar los metodos abstractos
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(this.radio,2);
    }
    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.radio;
    }
    //getters y setters
    public double getRadio() {
        return this.radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
