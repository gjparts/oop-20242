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
        //como marca y bateria desde el constructor me aseguro
        //que no pueda ser null; entonces es imposible que a este
        //punto sea null alguno de los dos.
        System.out.println("******** SmartPhone ********");
        System.out.println("Fabricante: "+this.marca.nombre);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Almacenamiento: "+this.almacenamiento+" GB");
        System.out.println("RAM: "+this.ram+" GB");
        System.out.println("Bateria: ");
        System.out.println("\tMarca: "+this.bateria.getMarca().nombre);
        System.out.println("\tMiliAmperios: "+this.bateria.miliamperios);
        //imprimir los sim card
        //de acuerdo a como esta hecha la clase SmartPhone tanto
        //chip1 como chip2 pueden llegar a venir con null
        //lo correcto es que si alguno de ellos es null entonces
        //mejor no tratar de obtener informacion sobre ello.
        if( this.chip1 != null ){
            System.out.println("Chip 1:");
            System.out.println("\tOperador: "+this.chip1.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip1.numeroTelefonico);
        }
        if( this.chip2 != null ){
            System.out.println("Chip 2:");
            System.out.println("\tOperador: "+this.chip2.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip2.numeroTelefonico);
        }
    }
}
