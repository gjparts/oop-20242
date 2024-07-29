package pkg13_abstraccion2;
public class Main {
    public static void main(String[] args) {
        //Figura f1 = new Figura("Hexagono");
        
        Rectangulo re1 = new Rectangulo(5, 8);
        System.out.println("Area de re1: "+re1.calcularArea());
        System.out.println("Perimetro de re1: "+re1.calcularPerimetro());
        Rectangulo re2 = new Rectangulo(7, 9);
        System.out.println("Area de re1: "+re2.calcularArea());
        System.out.println("Perimetro de re1: "+re2.calcularPerimetro());
        
        Circulo ci1 = new Circulo(45);
        System.out.println("Area de ci1: "+ci1.calcularArea());
        System.out.println("Perimetro de ci1: "+ci1.calcularPerimetro());
        Circulo ci2 = new Circulo(32);
        System.out.println("Area de ci2: "+ci2.calcularArea());
        System.out.println("Perimetro de ci2: "+ci2.calcularPerimetro());
        
        TrianguloEquilatero tr1 = new TrianguloEquilatero(5, 4);
        System.out.println("Area de tr1: "+tr1.calcularArea());
        System.out.println("Perimetro de tr1: "+tr1.calcularPerimetro());
        TrianguloEquilatero tr2 = new TrianguloEquilatero(6.7, 21.2);
        System.out.println("Area de tr2: "+tr2.calcularArea());
        System.out.println("Perimetro de tr2: "+tr2.calcularPerimetro());

/*      
        //esto no es posible, no podemos agregar atributos o metodos de esta manera:
        Figura f1 = new Figura("Cuadrado"){
            //atributos
            public double lado;
            @Override
            public double calcularArea() {
                return Math.pow(this.lado,2);
            }
            @Override
            public double calcularPerimetro() {
                return 4*lado;
            }
        };
        f1.lado = 4;
*/
    }
}
