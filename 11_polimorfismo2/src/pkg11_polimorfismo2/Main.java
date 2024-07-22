package pkg11_polimorfismo2;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Calendar f1 = Calendar.getInstance();
        f1.set(2019, 11, 7); //7 de Diciembre de 2019
        
        File a1 = new File("calc", 28672, "Application", "exe", f1);
        a1.print();
        
        Author au1 = new Author("Gerardo", "", "gerardo.portillo@unah.edu.hn");
        Document d1 = new Document(au1, Calendar.getInstance(), 2, "leeme", 4, "txt", f1);
        d1.print();
        
        Media me1 = new Media(null, 5, "abanico", 256456, "gif", f1);
        me1.print();
        
        Audio aud1 = new Audio("Medadeth", "Youthanasia", 1994, 4, null,
                240, "A Tout le monde", 3456334, "mp3", null);
        aud1.print();
    }    
}
