package pkg11_polimorfismo2;
import java.util.Calendar;
import java.util.LinkedList;
public class Video extends Media {
    //atributos
    public String codec;
    public int chapters;
    public String[] audio;
    public LinkedList<Subtitle> subtitles;
    //constructores
    public Video(String codec, int chapters, String[] audio,
           LinkedList<Subtitle> subtitles, Author author,
           int duration, String name, long size,
           String extension, Calendar creationDate) {
        //construir la super clase (Video hereda de Media, por lo tanto
        //el type de este tipo de archivos es Media File)
        super(author, duration, name, size, extension, creationDate);
        
        //inicializar los atributos de esta clase
        this.codec = codec;
        this.chapters = chapters;
        this.audio = audio;
        this.subtitles = subtitles;
    }
}
