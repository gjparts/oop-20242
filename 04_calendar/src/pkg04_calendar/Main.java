package pkg04_calendar;

import java.util.Calendar;
import java.text.SimpleDateFormat; //para dar formato a fecha
public class Main {
    public static void main(String[] args) {
        //crear un objeto de clase Calendar
        //como es una clase abstracta, Calendar provee su
        //propio medio para instanciarlo
        Calendar fecha1 = Calendar.getInstance();
        //que fecha y hora tiene?
        //extraer los componentes de la fecha
        System.out.println(fecha1.get( Calendar.YEAR ));
        //lo meses en Calendar se numeran de 0 a 11
        System.out.println(fecha1.get( Calendar.MONTH ));
        System.out.println(fecha1.get( Calendar.DAY_OF_MONTH ));
        System.out.println(fecha1.get( Calendar.HOUR ));
        System.out.println(fecha1.get( Calendar.MINUTE ));
        System.out.println(fecha1.get( Calendar.SECOND ));
        //imprimir el contenido de fecha1 usando un formateador
        /*literales para la mascara de fecha:
        YYYY año a 4 digitos
        MM mes a 2 digitos
        M mes a 1 digito
        MMM abreviatura de mes
        MMMM nombre de mes
        dd dia a dos 2 digitos
        d dia a 1 digito
        HH hora a dos digitos hora militar
        hh hora a dos digitos AM/PM
        mm minuto a dos digitos
        ss segundos a dos digitos*/
        SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println( formato.format(fecha1.getTime()) );
        //crear un objeto Calendar y ponerle una fecha determinada
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1982, 9, 15, 7, 33, 12);
        System.out.println( formato.format(fecha2.getTime()) );
        //cambiar solo un campo de una fecha
        fecha2.set(Calendar.MONTH, 11); //ponerle que es en Diciembre
        System.out.println( formato.format(fecha2.getTime()) );
        fecha2.set(Calendar.HOUR, 1); //ponerle que la hora es 1 de la mañana
        System.out.println( formato.format(fecha2.getTime()) );
        //sumar o restar a una fecha
        //sumar 2 años a fecha2
        fecha2.add(Calendar.YEAR, 2);
        System.out.println( formato.format(fecha2.getTime()) );
        //restar 3 meses
        fecha2.add(Calendar.MONTH, -3);
        System.out.println( formato.format(fecha2.getTime()) );
    }    
}
