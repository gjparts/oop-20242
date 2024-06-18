package pkg02_asociacion_clases;

/**
 * Describe un telefono inteligente
 * @author Gerardo Portillo
 *  @since 2024-06-18
 */
public class SmartPhone {
    //atributos
    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private Bateria bateria;
    public Chip chip1;
    public Chip chip2;
    //constructor
    public SmartPhone(Fabricante marca, String modelo, int almacenamiento, int ram,
                        Bateria bateria, Chip chip1, Chip chip2) {
        //segun el diagrama la marca y la bateria vienen por composicion
        //asi que no pueden ir vacios
        if( marca == null )
            throw new IllegalArgumentException("La marca no puede ser null");
        else
            this.marca = marca;
        
        if( bateria == null )
            throw new IllegalArgumentException("La bateria no puede ser null");
        else
            this.bateria = bateria;
        
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.chip1 = chip1;
        this.chip2 = chip2;
    }
    //metodos
    public Fabricante getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAlmacenamiento() {
        return this.almacenamiento;
    }
    public int getRam() {
        return this.ram;
    }
    public Bateria getBateria() {
        return this.bateria;
    }
    public void imprimir(){
        System.out.println("******** SmartPhone ********");
        System.out.println("Fabricante: ");
    }
}
