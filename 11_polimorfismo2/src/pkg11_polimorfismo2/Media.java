package pkg11_polimorfismo2;

import java.util.Calendar;

public class Media extends File {
    //atributos
    public Author author;
    public int duration;
    //constructores
    public Media(Author author, int duration, String name, long size,
                 String extension, Calendar creationDate) {
        //construir la super clase, note que el type siempre
        //va a ser Media File
        super(name, size, "Media File", extension, creationDate);
        //inicializar los atributos de esta clase
        this.author = author;
        this.duration = duration;
    }
    //metodos
    @Override
    public void print() {
        //parcial
        super.print();
        //nuevas instrucciones
        if( this.author != null ) System.out.println("Author: "+this.author.name);
        System.out.println("Duration: "+this.duration+" seconds");
    }
    
}
