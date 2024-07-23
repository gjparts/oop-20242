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
    //metodos
    @Override
    public void print(){
        super.print(); //parcial
        System.out.println("Codec: "+this.codec);
        System.out.println("Chapters: "+this.chapters);
        //pistas de audio
        if( this.audio != null ){
            if( this.audio.length > 0 ){
                System.out.println("Audio tracks:");
                for( int i = 0; i < this.audio.length; i++ )
                    if( this.audio[i] != null )
                        System.out.println("\t* "+this.audio[i]);
            }
        }
        //subtitulos disponibles
        if( this.subtitles != null ){
            if( this.subtitles.size() > 0 ){
                System.out.println("Subtitles: ");
                for( int i = 0; i < this.subtitles.size(); i++ ){
                    if( this.subtitles.get(i) != null ){
                        System.out.print("\t* "+this.subtitles.get(i).language);
                        if( this.subtitles.get(i).author != null )
                            System.out.print(" : "+this.subtitles.get(i).author.name);
                        System.out.println();
                    }                    
                }
            }
        }
    }
}
