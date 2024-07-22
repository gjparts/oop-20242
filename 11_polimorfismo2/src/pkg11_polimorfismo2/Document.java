package pkg11_polimorfismo2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Document extends File {
    //atributos
    public Author author;
    public Calendar modificationDate;
    public int words;
    //constructores
    public Document(Author author, Calendar modificationDate, int words,
                    String name, long size,
                    String extension, Calendar creationDate) {
        //construir la super clase
        //observe que type lo deje como valor constante puesto
        //que si usa la clase Document el archivo siempre va a ser
        //un documento.
        super(name, size, "Document File", extension, creationDate);
        //inicializar los atributos de esta clase
        this.author = author;
        this.modificationDate = modificationDate;
        this.words = words;
    }
    //metodos
    @Override
    public void print() {
        //Override parcial
        super.print();
        //añadir mas funcionalidad
        if( this.author != null ) System.out.println("Author: "+this.author.name);
        System.out.println("Words: "+this.words);
        
        if( this.modificationDate != null ){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Modification Date: "+formato.format(this.modificationDate.getTime()));
        }
        
    }
}