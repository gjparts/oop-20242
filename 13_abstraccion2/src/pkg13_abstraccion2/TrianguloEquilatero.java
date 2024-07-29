package pkg13_abstraccion2;
public class TrianguloEquilatero extends Figura {
    //atributos
    private double altura;
    private double base;
    //constructor
    public TrianguloEquilatero(double altura, double base) {
        super("Triángulo Equilatero"); //construir la super clase
        this.setAltura(altura);
        this.setBase(base);
    }
    //implementar los metodos abstractos
    @Override
    public double calcularArea() {
        return this.base*this.altura/2;
    }
    @Override
    public double calcularPerimetro() {
        return 3*this.base;
    }
    //getters y setters
    public double getAltura() {
        return this.altura;
    }
    public double getBase() {
        return this.base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
}
