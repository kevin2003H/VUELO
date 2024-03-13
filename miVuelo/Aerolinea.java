package miVuelo;

import java.util.Iterator;
import java.util.List;

public class Aerolinea {
	
	    private String nombre;
	    private String codigo;
	    private List<Avion> aviones; 
	    
	  
	   
	    public Aerolinea(String nombre, String codigo, List<Avion> aviones) {
	        this.nombre = nombre;
	        this.codigo = codigo;
	        this.aviones = aviones;
	    }

	   
	    public String getNombre() {
	        return nombre; }
	    public void setNombre(String nombre) {
	    	this.nombre = nombre;
	    }

	    public String getCodigo() {
	        return codigo; }
	    public void setCodigo(String codigo) {
	    	this.codigo = codigo;
	    }

	    public List<Avion> getAviones() {
	        return aviones; }
	    public void setAviones(List<Avion> aviones) {
	        this.aviones = aviones;
	    }

		public static Iterator<Aerolinea> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		public int getModelo() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void agregarAvion(Avion avion) {
			// TODO Auto-generated method stub
			
		}
	}


