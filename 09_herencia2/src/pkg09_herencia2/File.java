package pkg09_herencia2;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class File {
    //atributos
    public String name;
    public long size;
    private String type;
    public String extension;
    public Calendar creationDate;
    //constructores
    public File(String name, long size, String type,
                String extension, Calendar creationDate) {
        if( this.type.trim().length() == 0 )
            throw new IllegalArgumentException("File: type cannot be empty.");
        else
            this.type = type; //se acepta
        
        this.name = name;
        this.size = size;
        this.extension = extension;
        this.creationDate = creationDate;
    }
    //metodos
    public String getType() {
        return this.type;
    }
    public void print(){
        System.out.println("********* FILE *********");
        System.out.println("Name: "+this.name);
        System.out.println("Size (bytes): "+this.size);
        System.out.println("Type: "+this.type);
        System.out.println("EXtension: "+this.extension);
        if( this.creationDate != null ){
            SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println("Creation date: "+f.format(this.creationDate.getTime()));
        }
    }
}
