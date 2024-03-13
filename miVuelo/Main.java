package miVuelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        List<Avion> aviones = new ArrayList<>();
		        List<Aerolinea> aerolineas = new ArrayList<>();
		        List<Frecuencia> listaDeFrecuencias = new ArrayList<>();
		        List<Persona> listaDePasajeros = new ArrayList<>();

		        int option;

		        do {
		            System.out.println("Menu:");
		            System.out.println("1. ingrese el avion");
		            System.out.println("2. ingrese la aerolinea");
		            System.out.println("3. ingrese la frecuencia del vuelo");
		            System.out.println("4. ingrese el pasajero");
		            System.out.println("5. Listar aerolineas");
		            System.out.println("6. Listar vuelos");
		            System.out.println("7. Listar pasajeros");
		            System.out.println("8. Salir");
		            System.out.print("Seleccione una opcion: ");
		            option = scanner.nextInt();
		            scanner.nextLine(); // Consumir el salto de lÃ­nea pendiente

		            switch (option) {
		                case 1:
		                    System.out.print("Ingrese el modelo del avion: ");
		                    String modeloAvion = scanner.nextLine();
		                    System.out.print("agregue la capacidad del avion: ");
		                    int capacidadAvion = scanner.nextInt();
		                    scanner.nextLine(); // Consumir el salto de lÃ­nea pendiente
		                    Avion avion = new Avion(modeloAvion, capacidadAvion);
		                    aviones.add(avion);
		                    break;

		                case 2:
		                    System.out.print("agregue el nombre de la aerolinea: ");
		                    String nombreAerolinea = scanner.nextLine();
		                    System.out.print("agregue el codigo de la aerolinea: ");
		                    String codigoAerolinea = scanner.nextLine();
		                    Aerolinea aerolinea = new Aerolinea(nombreAerolinea, codigoAerolinea, new ArrayList<>());
		                    aerolineas.add(aerolinea);
		                    break;

		                case 3:
		                    System.out.print("Ingrese el origen de la frecuencia: ");
		                    String origen = scanner.nextLine();
		                    System.out.print("Ingrese el destino de la frecuencia: ");
		                    String destino = scanner.nextLine();
		                    System.out.print("Ingrese la hora de salida de la frecuencia: ");
		                    String horaSalida = scanner.nextLine();
		                    System.out.print("Ingrese el dia de la frecuencia: ");
		                    String dia = scanner.nextLine();

		                    System.out.println("Seleccione el avion para esta frecuencia:");
		                    for (int i = 0; i < aviones.size(); i++) {
		                        System.out.println(i + 1 + ". " + aviones.get(i).getModelo());
		                    }
		                    int avionIndex = scanner.nextInt() - 1;
		                    Avion frecuenciaAvion = aviones.get(avionIndex);

		                    System.out.println("Seleccione la aerolinea para esta frecuencia:");
		                    for (int i = 0; i < aerolineas.size(); i++) {
		                        System.out.println(i + 1 + ". " + aerolineas.get(i).getNombre());
		                    }
		                    int aerolineaIndex = scanner.nextInt() - 1;
		                    Aerolinea frecuenciaAerolinea = aerolineas.get(aerolineaIndex);

		                    Frecuencia frecuencia = new Frecuencia(origen, destino, horaSalida, frecuenciaAvion, frecuenciaAerolinea, dia);
		                    listaDeFrecuencias.add(frecuencia);
		                    break;

		                case 4:
		                    System.out.print("agruegue el nombre del pasajero: ");
		                    String nombrePasajero = scanner.nextLine();
		                    scanner.nextLine(); // Consumir el salto de lÃ­nea pendiente
		                    System.out.print("agregue el ID del pasajero: ");
		                    int numeroIdentificacionPasajero = scanner.nextInt();
		                    scanner.nextLine(); // Consumir el salto de lÃ­nea pendiente
		                    Persona pasajero = new Persona(nombrePasajero, numeroIdentificacionPasajero);
		                    listaDePasajeros.add(pasajero);
		                    break;

		                case 5:
		                    System.out.println("Listado de aerolineas:");
		                    for (Aerolinea airline : aerolineas) {
		                        System.out.println("Nombre: " + airline.getNombre());
		                        System.out.println("Codigo: " + airline.getCodigo());
		                        System.out.println("Aviones:");
		                        for (Avion airlineAvion : airline.getAviones()) {
		                            System.out.println("Modelo: " + airlineAvion.getModelo() + ", Capacidad: " + airlineAvion.getCapacidad());
		                        }
		                        System.out.println(); // Separador entre aerolÃ­neas
		                    }
		                    break;

		                case 6:
		                    System.out.println("Listado de vuelos:");
		                    for (Frecuencia frecuencia1 : listaDeFrecuencias) {
		                        System.out.println("Origen: " + frecuencia1.getOrigen());
		                        System.out.println("Destino: " + frecuencia1.getDestino());
		                        System.out.println("Hora de salida: " + frecuencia1.getHoraSalida());
		                        System.out.println("Aerolinea: " + frecuencia1.getAerolinea().getNombre());
		                        System.out.println("Avion: " + frecuencia1.getAvion().getModelo());
		                        System.out.println("Dia: " + frecuencia1.getDÃ­a());
		                        System.out.println(); // Separador entre vuelos
		                    }
		                    break;

		                case 7:
		                    System.out.println("Listado de pasajeros:");
		                    for (Persona pasajero1 : listaDePasajeros) {
		                        System.out.println("Nombre: " + pasajero1.getNombre());
		                        System.out.println("ID del pasajero: " + pasajero1.getNumeroIdentificacion());
		                        System.out.println("----------------------------------");
		                    }
		                    break;

		                case 8:
		                    System.out.println("Saliste del programa del programa.");
		                    break;

		                default:
		                    System.out.println("Opcion no valida.");
		                    break;
		            }
		        } while (option != 8);

		        scanner.close();
		    }
		

	}


