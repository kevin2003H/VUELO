package miVuelo;

import java.util.List;


public class Interfaz {
    public interface Iterator<T> {

	}

	public static void main(String[] args) {
        List<Avion> listaDeAviones = obtenerListaDeAviones(); // Reemplaza esto con tu lógica para obtener la lista de aviones

        AvionIterator avionIterator = new AvionIterator(listaDeAviones);
        while (avionIterator.hasNext()) {
        }
    }

	private static List<Avion> obtenerListaDeAviones() {
		// TODO Auto-generated method stub
		return null;
	}
}

class AvionIterator implements Interfaz.Iterator<Avion> {
    private List<Avion> aviones;
    private int position = 0;

    public AvionIterator(List<Avion> aviones) {
        this.aviones = aviones;
    }

    public boolean hasNext() {
        return position < aviones.size();
    }

    public Avion next() {
        if (hasNext()) {
            Avion avion = aviones.get(position);
            position++;
            return avion;
        }
        return null;
    }
}


