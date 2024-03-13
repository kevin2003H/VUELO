package miVuelo;

public class Persona {
	
    private String nombre;
    private int numeroIdentificacion;

    public Persona(String nombre, int numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion; 
    }

    
    public String getNombre() {
        return nombre; }
    public void setNombre(String nombre) {
    	this.nombre= nombre;
    }

    
    
    
    public int getNumeroIdentificacion() {
        return numeroIdentificacion; }
    public void setNumeroIdentificacion(int numeroIdentificacion) {
    	this.numeroIdentificacion= numeroIdentificacion;
    }
}


