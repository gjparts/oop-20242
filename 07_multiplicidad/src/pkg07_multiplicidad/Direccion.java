package pkg07_multiplicidad;
public class Direccion {
    //atributos
    private Barrio colonia;
    public String calle;
    public String avenida;
    public String bloque;
    public String casa;
    //constructor
    public Direccion(Barrio colonia) {
        if( colonia != null )
            this.colonia = colonia; //se acepta
        else
            throw new IllegalArgumentException("Direccion: barrio no puede ser null");
        
        //esto de abajo es opcional, lo coloca si Usted prefiere
        //establecer valores predeterminados (default values):
        this.calle = "N/A";
        this.avenida = "N/A";
        this.bloque = "N/A";
        this.casa = "N/A";
    }
    //metodos
    public Barrio getColonia() {
        return colonia;
    }
}
