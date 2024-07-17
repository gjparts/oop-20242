package pkg09_herencia2;
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
}