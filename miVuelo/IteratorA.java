package miVuelo;

import java.util.Iterator;
import java.util.List;



public class IteratorA implements Iterable<Avion> {
    private List<Avion> aviones;

    public IteratorA(List<Avion> aviones) {
        this.aviones = aviones;
    }

    @Override
    public Iterator<Avion> iterator() {
        return aviones.iterator();
    }
    
}
