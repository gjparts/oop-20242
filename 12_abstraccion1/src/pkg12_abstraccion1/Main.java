package pkg12_abstraccion1;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        //no podemos instanciar una clase abstracta
        //por metodos tradicionales:
        //SerVivo s1 = new SerVivo();
        
        Gato gato1 = new Gato("Misifus");
        gato1.vivir();
        
        gato1.hablar();
        gato1.desplazarse();
        gato1.dormir();
        gato1.alimentarse();
        System.out.println("**********************");
        Humano humano1 = new Humano("Gerardo");
        humano1.vivir();
        humano1.hablar();
        
        //la siguiente es una de vrias formas de instanciar
        //un clase abstracta:
        SerVivo s2 = new SerVivo("Canino"){
            //aqui estoy dentro de la definicion de la clase SerVivo
            @Override
            public void hablar() {
                System.out.println("Wof");
            }
            @Override
            public void alimentarse() {
                System.out.println("Come carne y lo que caiga");
            }
            @Override
            public void dormir() {
                System.out.println("Da dos vueltas y se duerme");
            }
            @Override
            public void desplazarse() {
                System.out.println("Camina con sus cuatro patitas");
            }
        };
        System.out.println("***************************");
        s2.vivir();
        s2.hablar();
    }    
}
