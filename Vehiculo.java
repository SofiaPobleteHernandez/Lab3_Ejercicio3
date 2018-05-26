public class Vehiculo {
    private String modelo;
    private int capacidad_de_tanque;
    private int kilometraje;
    private String arrendatario;
    private String fecha;
    private int capacidad_previa_de_estanque;
    private int kilometraje_previo;

    public Vehiculo(){
        this.modelo=modelo;
        this.capacidad_de_tanque=capacidad_de_tanque;
        this.kilometraje=kilometraje;
        this.arrendatario=arrendatario;
        this.fecha=fecha;
        this.capacidad_previa_de_estanque=capacidad_previa_de_estanque;
        this.kilometraje_previo=kilometraje_previo;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getCapacidad_de_tanque(){
        return this.capacidad_de_tanque;
    }

    public int getKilometraje(){
        return this.kilometraje;
    }

    public int getCapacidad_previa_de_estanque(){
        return this.capacidad_previa_de_estanque;
    }

    public  int getKilometraje_previo(){
        return this.kilometraje_previo;
    }

    public String getArrendatario(){
        return this.arrendatario;
    }

    public String getFecha(){
        return this.fecha;
    }

    public String setModelo(String modelo){
        this.modelo=modelo;
        return this.modelo;
    }

    public int setCapacidad_de_tanque(int capacidad_de_tanque){
        this.capacidad_de_tanque=capacidad_de_tanque;
        return this.capacidad_de_tanque;
    }

    public int setKilometraje(int kilometraje){
        this.kilometraje=kilometraje;
        return this.kilometraje;
    }

    public int setCapacidad_previa_de_estanque(int capacidad_previa_de_estanque){
        this.capacidad_previa_de_estanque=capacidad_previa_de_estanque;
        return this.capacidad_previa_de_estanque;
    }

    public int setKilometraje_previo(int kilometraje_previo){
        this.kilometraje_previo=kilometraje_previo;
        return this.kilometraje_previo;
    }

    public String setArrendatario(String arrendatario){
        this.arrendatario=arrendatario;
        return this.arrendatario;
    }
    public String setFecha(String fecha){
        this.fecha=fecha;
        return this.fecha;
    }
}
