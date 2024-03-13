package miVuelo;

public class Frecuencia {
	
    private String origen;
    private String destino;
    private String horaSalida;
    private Avion avion;
    private Aerolinea aerolinea;
    private String dÃ­a;

    public Frecuencia(String origen, String destino, String horaSalida, Avion avion, Aerolinea aerolinea, String dÃ­a) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.avion = avion;
        this.aerolinea = aerolinea;
        this.dÃ­a = dÃ­a;
    }

    public Frecuencia(String origen2, String destino2, String horaSalida2, Aerolinea frecuenciaAvion,
			Aerolinea frecuenciaAerolinea, String dia) {
		// TODO Auto-generated constructor stub
	}


    public String getOrigen() {
        return origen; }
    public void setOrigen(String origen) {
    	this.origen = origen;
    }

    public String getDestino() {
        return destino; }
    public void setDestino(String destino) {
    	this.destino = destino;
    }

    public String getHoraSalida() {
        return horaSalida; }
    public void setHoraSalida(String horaSalida) {
    	this.horaSalida = horaSalida;
    }

    public Avion getAvion() {
        return avion; }
    public void setAvion(Avion avion) {
    	this.avion = avion;
    }

    public Aerolinea getAerolinea() {
        return aerolinea; }
    public void setAerolinea(Aerolinea aerolinea) {
    	this.aerolinea = aerolinea;
    }
    
    public String getDÃ­a() {
        return dÃ­a; }
    public void setDÃ­a(String dÃ­a) {
    	this.dÃ­a = dÃ­a ;
    }
}


